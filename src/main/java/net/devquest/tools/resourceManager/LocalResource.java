package net.devquest.tools.resourceManager;

import java.io.Console;
//import java.io.File;
//import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
//import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LocalResource implements IResourceManager {
	protected String mountPoint = "";
	protected String curDir = "";

	public LocalResource(String mountPoint) {
		this.mountPoint = mountPoint;
		this.curDir = mountPoint;
	}

	public String getMountPoint() {
		return this.mountPoint;
	}

	public void setMountPoint(String mountPoint) {
		this.mountPoint = mountPoint;
	}

	public void readDirectory() {
		this.readDirectory(this.curDir);
	}

	public void readDirectory(String strDir) {
		Path pDir = Paths.get(strDir);

		if (Files.exists(pDir) && Files.isDirectory(pDir)) {
			System.out.println("dir path Exists = " + strDir);
			
			Console cons;
			cons = System.console();
			Charset charset = cons.charset();
			System.out.println("charset.name() = " + charset.name());
			System.out.println("charset.toString() = " + charset.toString());
			System.out.println("charset.displayName() = " + charset.displayName());
			

//			final String encoding = "UTF-8"; // "UTF16LE" or "UTF-16BE"
//			byte[] b;
//			try {
//				b = strDir.getBytes(encoding);
//				System.out.println("dir path Exists = " + b);
//			} catch (UnsupportedEncodingException e) {
//				e.printStackTrace();
//			}
			
			
//			FileSystem strSysDir = pDir.getFileSystem();			
			
//			for (final File fileEntry : folder.listFiles()) {
//		        if (fileEntry.isDirectory()) {
//		            listFilesForFolder(fileEntry);
//		        } else {
//		            System.out.println(fileEntry.getName());
//		        }
//		    }
			
		} else {
			System.out.println("dir path not Exists = " + strDir);
		}
	}
}
