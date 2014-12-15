package com.example.donem_projesi;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button kang = (Button)findViewById(R.id.button1); //button1 burada oluşturduk
		
		kang.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v)
			{
				Intent kgon = new Intent(MainActivity.this,KanGonullusu.class);
				startActivity(kgon);
				
				
			}
		});
		
		Button karama = (Button)findViewById(R.id.button2); //button2 yi burada 
		karama.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				Intent karam = new Intent(MainActivity.this,KanArama.class);
				startActivity(karam);
				
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
