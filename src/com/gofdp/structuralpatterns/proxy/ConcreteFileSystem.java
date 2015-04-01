package com.gofdp.structuralpatterns.proxy;

import java.util.ArrayList;
import java.util.List;

public class ConcreteFileSystem implements IFileSystem {
	
	private List<String> _publicFiles;
	private List<String> _reservedFiles;
	private List<String> _secretFiles;
	
	public ConcreteFileSystem() {
		_publicFiles = new ArrayList<>();
		_reservedFiles = new ArrayList<>();
		_secretFiles = new ArrayList<>();
		
		dummyInit();
	}

	@Override
	public List<String> getPublicFileNames() {
		return _publicFiles;
	}

	@Override
	public List<String> getReservedFileNames() {
		return _reservedFiles;
	}

	@Override
	public List<String> getSecretFileNames() {
		return _secretFiles;
	}

	@Override
	public List<String> getAllFileNames() {
		List<String> allFiles = new ArrayList<>();
		allFiles.addAll(_publicFiles);
		allFiles.addAll(_reservedFiles);
		allFiles.addAll(_secretFiles);
		return allFiles;
	}
	
	private void dummyInit() {
		addDummyFilesToList(_publicFiles);
		addDummyFilesToList(_reservedFiles);
		addDummyFilesToList(_secretFiles);
	}
	
	private static void addDummyFilesToList(List<String> files) {
		java.util.Random rand = new java.util.Random();
		for (int i = 0; i < 3; i++) {
			String filename = "";
			for (int j = 0; j < 4; j++) {
				filename += (char)(97 + rand.nextInt(26));
			}
			filename += ".txt";
			files.add(filename);
		}
	}
}
