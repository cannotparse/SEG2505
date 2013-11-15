package seg.f2505.interfaceusager;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class AskQuestion extends Activity implements OnItemSelectedListener {

	//private Profile p;
	private ArrayAdapter<String> adp1, adp2;
	private Spinner sp1, sp2;
	private int category;
	private int sub_category;
	
	String[] domainList		= new String[] { "Math", "Science", "Computers" };
	String[] listMath 		= new String[] { "Calculus", "Linear", "Geometry","1+1's" };
	String[] listScience 	= new String[] { "Physics", "Quantum Mechanics", "Biology" };
	String[] listComputer 	= new String[] { "C", "C++", "C#", "Why aren't you coding in C?" };

	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ask_question);

		sp1 = (Spinner) findViewById(R.id.spinner1);
		sp2 = (Spinner) findViewById(R.id.spinner2);

		adp1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, domainList);
		adp1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		sp1.setAdapter(adp1);

		sp1.setOnItemSelectedListener(new OnItemSelectedListener() {
			
			public void onItemSelected(AdapterView<?> arg0, View arg1,int arg2, long arg3) {
				
				AskQuestion.this.category = sp1.getSelectedItemPosition();
				switch (AskQuestion.this.category) {
					case 0:
						adp2 = new ArrayAdapter<String>(AskQuestion.this,android.R.layout.simple_spinner_item, listMath);
						adp2.setDropDownViewResource(android.R.layout.simple_spinner_item);
						sp2.setAdapter(adp2);
						select();
					break;
					case 1:
						adp2 = new ArrayAdapter<String>(AskQuestion.this,android.R.layout.simple_spinner_item, listScience);
						adp2.setDropDownViewResource(android.R.layout.simple_spinner_item);
						sp2.setAdapter(adp2);
						select();
					break;
					case 2:
						adp2 = new ArrayAdapter<String>(AskQuestion.this, android.R.layout.simple_spinner_item, listComputer);
						adp2.setDropDownViewResource(android.R.layout.simple_spinner_item);
						sp2.setAdapter(adp2);
						select();
					break;
				}
			}

			private void select() {
				Toast.makeText(getBaseContext(), "You have Selected : " + domainList[category],Toast.LENGTH_SHORT).show();
			}
			
			public void onNothingSelected(AdapterView<?> arg0) {}
		});
		sp2.setOnItemSelectedListener(new OnItemSelectedListener(){

			public void onItemSelected(AdapterView<?> arg0, View arg1,int arg2, long arg3) {
				AskQuestion.this.sub_category = sp2.getSelectedItemPosition();
				switch(category){
				case 0:
					Toast.makeText(getBaseContext(), "You have Selected : " + listMath[sub_category],Toast.LENGTH_SHORT).show();
					break;
				case 1:
					Toast.makeText(getBaseContext(), "You have Selected : " + listScience[sub_category],Toast.LENGTH_SHORT).show();
					break;
				case 2:
					Toast.makeText(getBaseContext(), "You have Selected : " + listComputer[sub_category],Toast.LENGTH_SHORT).show();
					break;
				}
			}
			public void onNothingSelected(AdapterView<?> arg0) {}
			
		});
		
	}

	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		return true;
	}
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,long arg3) {}
	public void onNothingSelected(AdapterView<?> arg0) {}

}
