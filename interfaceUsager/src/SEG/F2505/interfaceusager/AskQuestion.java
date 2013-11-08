package seg.f2505.interfaceusager;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;


public class AskQuestion extends Activity implements OnItemSelectedListener {
	private Profile p;
	public Spinner spinner2, spinner1; 
	//public Spinner spinner = (Spinner) findViewById(R.id.spinner1);
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ask_question);
		Intent i = getIntent();
        this.p =(Profile) i.getSerializableExtra("Profile");
       
       subItems();
       addListenerOnSpinnerItemSelection();
       
       
	}
	public void subItems(){
		spinner2 = (Spinner) findViewById(R.id.spinner2);
		
		List listMath = new ArrayList();
		listMath.add("Calc");
		listMath.add("line");
		
		List listSci = new ArrayList();
		listSci.add("Bio");
		listSci.add("Chem");
		
		ArrayAdapter dataAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item, listMath);
		dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner2.setAdapter(dataAdapter);


	}
	public void addListenerOnSpinnerItemSelection() {
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		
		
		
		spinner1.setOnItemSelectedListener(new myListenerSubItem());
		
	}	
	public void addListenerOnButton() {
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		spinner2 = (Spinner) findViewById(R.id.spinner2);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ask_question, menu);
		return true;
	}
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
    	//ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,R.array.domain_array_sub2, android.R.layout.simple_spinner_item);
       // adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       // spinner2.setAdapter(adapter2);
    }

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}
}
