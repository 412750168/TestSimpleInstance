package zzl.example.activity;

import com.example.testsimpleinstance.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import zzl.example.util.StringUtil;

public class FirstActivity extends Activity {
	
	private Button button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first_layout);
		button = (Button)findViewById(R.id.button_jump);
		button.setText(StringUtil.getIntance().getHelloWorld());
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
				startActivity(intent);
				finish();
			}
		});
	}
	
	

}
