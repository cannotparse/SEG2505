package seg.f2505.interfaceusager;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Toast;

public class myListenerSubItem implements OnItemSelectedListener {
	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
		Toast.makeText(parent.getContext(), "Selected Domain : " + parent.getItemAtPosition(pos).toString(), Toast.LENGTH_SHORT).show();
		if((parent.getItemAtPosition(pos).toString()).equals("Math")){
			
		}
	}
	public void onNothingSelected(AdapterView parent){
		
	}
}
