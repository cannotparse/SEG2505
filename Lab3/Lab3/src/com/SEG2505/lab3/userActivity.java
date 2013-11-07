package com.SEG2505.lab3;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class userActivity extends Activity{
	
	 
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_user);
		TextView txtEmail = (TextView) findViewById(R.id.errorPass);
		TextView txtUsername = (TextView) findViewById(R.id.userId);
		Intent i = getIntent();
		String email = i.getStringExtra("email");
		String username = i.getStringExtra("username");
		txtEmail.setTextColor(Color.BLUE);
		txtEmail.setText(email);
		txtUsername.setTextColor(Color.BLUE);
		txtUsername.setText(" "+username+",");
		
	}
	
}
