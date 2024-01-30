package net.devquest.tools.resourceManager;

public class LocalResource implements IResourceManager {
	String mountPoint = "";

	public LocalResource(String mountPoint) {
		this.mountPoint = mountPoint;
	}

	public String getMountPoint() {
		return this.mountPoint;
	}

	public void setMountPoint(String mountPoint) {
		this.mountPoint = mountPoint;
	}

}
