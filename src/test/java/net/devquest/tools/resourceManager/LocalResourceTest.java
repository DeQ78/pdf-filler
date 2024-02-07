package net.devquest.tools.resourceManager;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Assertions;


@DisplayName("LocalResourceTest xxxx")
public class LocalResourceTest {

	public static LocalResource localResource;
	public static String workDir = System.getProperty("user.home");

	@DisplayName("@BeforeAll")
	@BeforeAll
	public static void beforeAll() {
		System.out.println("\n> net.devquest.tools.resourceManager.LocalResourceTest");
		System.out.println("[@BeforeAll]");
		localResource = new LocalResource(workDir);
	}

	@Test
	@DisplayName("getStartDir after init object")
	public void getStartDirTest() {
		System.out.println("- getStartDir after init object");
		String startDir = localResource.getStartDir();
		Assertions.assertSame(workDir, startDir);
	}

	@Test
	@DisplayName("setMountPoint after init object")
	public void setMountPointTest() {
		System.out.println("- setMountPoint");
		System.out.println("- System.getProperty(\"file.separator\") = " + System.getProperty("file.separator"));
		
		String startDir = localResource.getStartDir();
		Assertions.assertSame(workDir, startDir);
	}
	
	

//	public void setMountPoint(String mountPoint) {
//		this.mountPoint = mountPoint;
//	}
//
//	public void readDirectory() {
//		this.readDirectory(this.curDir);
//	}

}
