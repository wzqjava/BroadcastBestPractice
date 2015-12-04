package com.example.broadcastbestpractice.activity;

import android.app.Activity;
import android.os.Bundle;

import com.example.broadcastbestpractice.ActivityCollector;

public class BaseActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ActivityCollector.addActivity(this);
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		ActivityCollector.removeActivity(this);
	}
	
}
