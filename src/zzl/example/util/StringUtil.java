package zzl.example.util;

import com.example.testsimpleinstance.R;

import zzl.example.application.MainApplication;

public class StringUtil {

	private static StringUtil intance;
	public MainApplication application = MainApplication.getInstance();
	
	public static StringUtil getIntance(){
		if(intance==null)
			return intance = new StringUtil();
		return intance;
	}
	
	public String getHelloWorld(){
		return application.getResources().getString(R.string.hello_world);
	}
}
