package com.ron.custom.interceptor;

import java.util.logging.Logger;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyCloudConnectInterceptor implements Interceptor {

	/**
	 * 
	 */
	private static Logger myCloudLogger = Logger.getLogger(MyCloudConnectInterceptor.class.getName());
	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		myCloudLogger
				.info("@@@===> MyCloudConnectorInterceptor ==> destroy() runs... disconnected from cloud servers.");
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		myCloudLogger.info("@@@===> MyCloudConnectorInterceptor ==> init() runs... connected to cloud servers.");
	}

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		// TODO Auto-generated method stub
		myCloudLogger.info("@@@===> MyCloudConnectorInterceptor ==> intercept() before invoke()");
		String invoke = actionInvocation.invoke();
		myCloudLogger.info("@@@===> MyCloudConnectorInterceptor ==> intercept() after invoke()");
		return invoke;
	}

}
