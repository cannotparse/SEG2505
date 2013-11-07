package com.SEG2505.lab3;

import com.swarmconnect.Swarm;

import com.swarmconnect.SwarmAchievement;
import com.swarmconnect.SwarmActivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class MainActivity extends SwarmActivity {
	EditText username;
	EditText email;
	EditText password;
	EditText passwordConfirm;
	Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
        if(Swarm.isEnabled()== false){
        	
        	Swarm.init(this, 8089, "4d096af724fb94ff8608fe6994989431");
        	
        }
        username = (EditText) findViewById(R.id.uName);
        email = (EditText) findViewById(R.id.emailUser);
        password = (EditText) findViewById(R.id.passwordUser);
        passwordConfirm = (EditText) findViewById(R.id.passwordConfirm);
  
        
    }
    public void addListenerOnButton() {
    	 button = (Button) findViewById(R.id.submitProfile);
    	 button.setOnClickListener(new OnClickListener() {
 
			public void onClick(View arg0) {
				String user = username.getText().toString();
				String pass = password.getText().toString();
				String passconf = passwordConfirm.getText().toString();
				String e = email.getText().toString();
			    Intent intent = new Intent(getApplicationContext(), userActivity.class);
			    intent.putExtra("email", email.getText().toString());  
			    intent.putExtra("username", username.getText().toString());
			    if(!(user.matches("")) && !(e.matches(""))&&(pass.equals(passconf)) && !(pass.matches("") || passconf.matches(""))){
			    startActivity(intent); 
			    }
			    else{
			    	if(user.matches("")){
				TextView error = (TextView) findViewById(R.id.errorUser);
				error.setTextColor(Color.RED);
				error.setText("*Incorrect username");
			    	}
			    	if(e.matches("")){
			    TextView error = (TextView) findViewById(R.id.errorEmail);
			    error.setTextColor(Color.RED);
			    error.setText("*Incorrect email");
			    	}
			    	if(!(pass.equals(passconf))|| (passconf.matches("") || passconf.matches(""))){
			    TextView error = (TextView) findViewById(R.id.errorPass);
			    error.setTextColor(Color.RED);
			    error.setText("*incorrect password");
			    	}
			    }
			
		}
		
		});
 
	}
    
    
 
 
    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void showSwarm(View view){
    	if(! Swarm.isInitialized()){
    		
    		Swarm.init(MainActivity.this, 8089, "4d096af724fb94ff8608fe6994989431");
    		
    	}
    	achievement();
    	Swarm.showDashboard();
    }
    public void achievement(){
    	
    	SwarmAchievement.unlock(17098);
    	if(Swarm.isLoggedIn()){
    		SwarmAchievement.unlock(17096);
    	}
    }
    
}
