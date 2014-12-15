package com.example.donem_projesi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class HosgeldinEkrani extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.hosgeldin_ekran);
		
		
		Thread zamanlayici = new Thread()
		{
			public void run()
			{
				try {
					sleep(3500);
					
					
				} catch (Exception e) {
					// TODO: handle exception
				}
				finally
				{
					Intent mainActivityCagir = new Intent("com.example.donem_projesi.MAINACTIVITY");
					startActivity(mainActivityCagir);
				};
			}
		};
		zamanlayici.start();
		
	}

	
}
