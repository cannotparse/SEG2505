package seg.f2505.interfaceusager;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class EditDomains extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_edit_domains);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.edit_domains, menu);
		return true;
	}

}
