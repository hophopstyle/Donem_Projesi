package com.example.donem_projesi;

import java.security.PublicKey;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

public class UyeOl extends ActionBarActivity {

	AutoCompleteTextView autoCompleteTextView;  //şehirler için AutocompleteTextView oluşturdum. (Otamatik Tamamlama)
	String[] array ={"İstanbul","İzmir","Isparta","Ankara","Amasya","Adiyaman","Antalya","Agri","Kırıkkale","Kayseri",
			"Kastamonu","Denizli","Muğla","Mardin","Mersin","Diyarbakır","Sivas","Trabzon","Tekirdağ","Edirne","Konya","Kahramanmaraş","Düzce","Bolu","Bilecik","Bursa","Eskişehir","Adana"};  //81 ili buraya Array olarak ekliyeceğiz..!
	
	// Spinner spinner = (Spinner) findViewById(R.id.spinner);
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_uye_ol);
		
		autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item,array);
		autoCompleteTextView.setThreshold(1);
		autoCompleteTextView.setAdapter(adapter);
	
		
		//Checkbox'ların aynı anda seçilememesi için düzenleme
		//public void onRadi
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.uye_ol, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
