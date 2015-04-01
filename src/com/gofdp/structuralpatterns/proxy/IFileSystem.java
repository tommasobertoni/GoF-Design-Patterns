package com.gofdp.structuralpatterns.proxy;

import java.util.List;

public interface IFileSystem {

	public List<String> getPublicFileNames();
	
	public List<String> getReservedFileNames();
	
	public List<String> getSecretFileNames();
	
	public List<String> getAllFileNames();
}
