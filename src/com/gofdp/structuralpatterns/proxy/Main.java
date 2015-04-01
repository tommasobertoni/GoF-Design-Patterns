package com.gofdp.structuralpatterns.proxy;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		IFileSystem fs = new ProxyFileSystem(null);
		
		for (Authorization auth : Authorization.values()) {
			
			((ProxyFileSystem)fs).setAuthLevel(auth);
			System.out.println("-----------------------");
			System.out.println("File system auth: " + auth);
			
			System.out.println("\npublic files:");
			try { printList(fs.getPublicFileNames());
			} catch (UnauthorizedException uEx) { System.out.println("Access unauthorized"); }
			
			System.out.println("\nreserved files:");
			try { printList(fs.getReservedFileNames());
			} catch (UnauthorizedException uEx) { System.out.println("Access unauthorized"); }
			
			System.out.println("\nsecret files:");
			try { printList(fs.getSecretFileNames());
			} catch (UnauthorizedException uEx) { System.out.println("Access unauthorized"); }
			
			System.out.println("\nall files:");
			printList(fs.getAllFileNames());
			System.out.println();
		}
	}
	
	public static void printList(List<?> list) {
		for(int i = 0; i < list.size(); i++)
            System.out.println("\t" + list.get(i));
	}
}
