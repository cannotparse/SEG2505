package SEG.F2505.interfaceusager;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class PendingQuestions extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pending_questions);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pending_questions, menu);
		return true;
	}

}
