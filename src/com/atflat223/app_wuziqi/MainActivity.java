package com.atflat223.app_wuziqi;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {
	private WuziqiPanel wuziqiPanel;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		wuziqiPanel = (WuziqiPanel) findViewById(R.id.view_Wuziqi);
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		menu.add(0, 1, 0, "重来一局");
		return super.onCreateOptionsMenu(menu);
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if(item.getItemId() == 1){
			wuziqiPanel.reStart();
		}
		return super.onOptionsItemSelected(item);
	}
}
