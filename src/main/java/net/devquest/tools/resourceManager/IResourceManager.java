package net.devquest.tools.resourceManager;

public interface IResourceManager {
	public String getStartDir();
	public void setStartDir(String startDir);
	public void readDirectory();
	public void readDirectory(String dir);
}
