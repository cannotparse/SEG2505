package seg.f2505.interfaceusager;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainScreen extends Activity {
	
	public Profile loggedp;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_screen);
		loggedp = new Profile("Rodger", "rodger.waldron@gmail.com", "hi");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_screen, menu);
		return true;
	}
	public void onClickAskQuestion(View view){
		Intent intent = new Intent(this, AskQuestion.class);
		intent.putExtra("Profile", loggedp);  
		startActivity(intent);
	}
	public void onClickAnswerQuestion(){
		
	}
	public void onClickViewProfile(){
		
	}
	public void onClickViewBank(){
		
	}
}
