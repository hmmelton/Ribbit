package com.hmmelton.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() {
		super.onCreate();
		
		Parse.enableLocalDatastore(this);
		Parse.initialize(this, "IChfuEWkR3UCar1Aux8YITDkeJLUytolTzFYEeKO", 
				"86SkLbG8V1OcFvojOhMdJtU6527i4alE7ZOzknFR");
	}
}
