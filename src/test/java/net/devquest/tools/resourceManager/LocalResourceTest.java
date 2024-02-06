package net.devquest.tools.resourceManager;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Assertions;

public class LocalResourceTest {

	private static LocalResource localResource;
	private static String workDir = "aaaaaaaaaaaaaaaaaa";
//	System.getProperty("user.home")

	@BeforeAll
	void beforeAll() {
		localResource = new LocalResource(workDir);
	}

	@Test
	public void getMountPointTest() {
		String mountPoint = localResource.getMountPoint();
		System.out.println("------------ mountPoint = " + mountPoint);
//		Assertions.assertSame(workDir, workDir);
		Assertions.assertSame(mountPoint, workDir);

//		Assertions.assertEquals(localResource.getMountPoint(),workDir);
	}

//	public void setMountPoint(String mountPoint) {
//		this.mountPoint = mountPoint;
//	}
//
//	public void readDirectory() {
//		this.readDirectory(this.curDir);
//	}

}
