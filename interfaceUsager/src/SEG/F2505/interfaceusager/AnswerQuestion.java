package seg.f2505.interfaceusager;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class AnswerQuestion extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_answer_question);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.answer_question, menu);
		return true;
	}

}
