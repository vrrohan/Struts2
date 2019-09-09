package com.ron.message.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletContext;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport implements ServletContextAware {

	/**
	 * 
	 */
	private static Logger uploadLogger = Logger.getLogger(FileUploadAction.class.getName());
	private static final long serialVersionUID = 1L;
	private File userImage;
	private String userImageContentType;
	private String userImageFileName;
	private ServletContext context;
	private String filesPath;

	public String getFilesPath() {
		return filesPath;
	}

	public void setFilesPath(String filesPath) {
		this.filesPath = filesPath;
	}

	public ServletContext getContext() {
		return context;
	}

	public void setContext(ServletContext context) {
		this.context = context;
	}

	public File getUserImage() {
		return userImage;
	}

	public void setUserImage(File userImage) {
		this.userImage = userImage;
	}

	public String getUserImageContentType() {
		return userImageContentType;
	}

	public void setUserImageContentType(String userImageContentType) {
		this.userImageContentType = userImageContentType;
	}

	public String getUserImageFileName() {
		return userImageFileName;
	}

	public void setUserImageFileName(String userImageFileName) {
		this.userImageFileName = userImageFileName;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try {
			String filePath = context.getRealPath("") + File.separator + filesPath;
			// File fileToCreate = new File(filePath, this.userImageFileName);
			uploadLogger.info("@@@===> File object created");
			// FileUtils.copyFile(userImage, fileToCreate);
			System.out.println("after fileutils copyfile");
			// String targetPath = new File(filePath).getPath() + File.separator +
			// this.userImageFileName;
			uploadTmpFile(getUserImage(), getUserImageFileName(), filePath);
		} catch (Exception e) {
			uploadLogger.warning("@@@===> Exception occurs");
			return INPUT;
		}
		return SUCCESS;
	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub
	}

	private void uploadTmpFile(File file, String fileName, String filesDirectory) {

		File dir = new File(filesDirectory);
		if (!dir.exists()) {
			dir.mkdirs();
		}

		String targetPath = dir.getPath() + File.separator + fileName;
		System.out.println("source file path ::" + file.getAbsolutePath());
		System.out.println("saving file to ::" + targetPath);
		File destinationFile = new File(targetPath);
		try (FileInputStream in = new FileInputStream(file);
				FileOutputStream out = new FileOutputStream(destinationFile)) {
			int c;

			while ((c = in.read()) != -1) {
				out.write(c);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void setServletContext(ServletContext context) {
		// TODO Auto-generated method stub
		this.context = context;
	}
}
