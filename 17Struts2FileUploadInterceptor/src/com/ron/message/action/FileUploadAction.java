package com.ron.message.action;

import java.io.File;
import java.util.logging.Logger;
import org.apache.commons.io.FileUtils;
import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport {

	/**
	 * 
	 */
	private static Logger uploadLogger = Logger.getLogger(FileUploadAction.class.getName());
	private static final long serialVersionUID = 1L;
	private File myFile;
	private String contentType;
	private String fileName;

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setMyFile(File myFile) {
		this.myFile = myFile;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		String destPath = "D:/up/";
		uploadLogger.info("@@@===> File Upload location : " + destPath);
		// first create a file in d:/up folder
		File destFile = new File(destPath, fileName);
		// now copying source file to destination file
		FileUtils.copyFile(myFile, destFile);
		return SUCCESS;
	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub
	}

}
