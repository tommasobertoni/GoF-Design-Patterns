package com.gofdp.structuralpatterns.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyFileSystem implements IFileSystem {
	
	private IFileSystem _fileSystem;
	private Authorization _authLevel;
	
	public ProxyFileSystem(Authorization authLevel) {
		_authLevel = authLevel;
		_fileSystem = new ConcreteFileSystem();
	}
	
	public void setAuthLevel(Authorization authLevel) {
		_authLevel = authLevel;
	}
	
	public Authorization getAuthLevel() {
		return _authLevel;
	}

	@Override
	public List<String> getPublicFileNames() {
		
		if (_authLevel == null || _authLevel.ordinal() < Authorization.BASE.ordinal())
			throw new UnauthorizedException();
		
		return _fileSystem.getPublicFileNames();
	}

	@Override
	public List<String> getReservedFileNames() {

		if (_authLevel == null || _authLevel.ordinal() < Authorization.OPERATOR.ordinal())
			throw new UnauthorizedException();
		
		return _fileSystem.getReservedFileNames();
	}

	@Override
	public List<String> getSecretFileNames() {

		if (_authLevel == null || _authLevel.ordinal() < Authorization.ADMIN.ordinal())
			throw new UnauthorizedException();
		
		return _fileSystem.getSecretFileNames();
	}

	@Override
	public List<String> getAllFileNames() {
		
		List<String> allAccessibleFiles = new ArrayList<>();
		
		switch (_authLevel) {
		case ADMIN: allAccessibleFiles.addAll(0, getSecretFileNames());
		case OPERATOR: allAccessibleFiles.addAll(0, getReservedFileNames());
		case BASE: allAccessibleFiles.addAll(0, getPublicFileNames());
		}
		
		return allAccessibleFiles;
	}
}
