package SEG.F2505.interfaceusager;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class AskQuestion extends Activity {
	Profile p;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ask_question);
		 Intent i = getIntent();
         this.p =(Profile) i.getSerializableExtra("Profile");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ask_question, menu);
		return true;
	}

}
