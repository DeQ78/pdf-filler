package net.devquest.tools.resourceManager;

public interface IResourceManager {
	public String getMountPoint();
	public void setMountPoint(String mountPoint);
	public void readDirectory();
	public void readDirectory(String dir);
}
