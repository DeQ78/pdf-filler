package net.devquest.pdfFiller;

import net.devquest.tools.resourceManager.LocalResource;

public class PdfFiller {
	public static void main(String[] args) {
		runme();
	}

	protected static void runme() {
		System.out.println("Hello World!");
		
		try {
			LocalResource localResource = new LocalResource(System.getProperty("user.home"));
			System.out.println("localResource = " + localResource.getStartDir());
			
			localResource.readDirectory();
			
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
		
		
	}
}
