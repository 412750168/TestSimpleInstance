package zzl.example.activity;

import com.example.testsimpleinstance.R;

import android.app.Activity;
import android.os.Bundle;
import zzl.example.thread.PrintThread;

public class SecondActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_layout);
		new PrintThread().start();
		
	}
	

}
