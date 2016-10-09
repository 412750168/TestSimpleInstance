package zzl.example.application;

import android.app.Application;

public class MainApplication extends Application {

	private static MainApplication instance;
	
	public static MainApplication getInstance(){
		return instance;
	}
	
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		if(instance == null)
			instance = this;
	}

}
