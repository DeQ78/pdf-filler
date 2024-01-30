package net.devquest.pdfFiller;

import net.devquest.tools.resourceManager.LocalResource;

public class PdfFiller {
	public static void main(String[] args) {
		run();
	}

	protected static void run() {
		System.out.println("Hello World!");
		
		LocalResource localResource = new LocalResource(System.getProperty("user.home"));
		System.out.println("localResource = " + localResource.getMountPoint());		
	}
}
