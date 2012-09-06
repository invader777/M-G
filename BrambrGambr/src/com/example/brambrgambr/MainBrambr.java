package com.example.brambrgambr;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainBrambr extends Activity {
	
	private TimerLogic _timerLogic;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_brambr);
        
        configLogic();
    }
	
	private void configLogic() {
		_timerLogic = new TimerLogic();
	}
	
	public void onTimeButtonClick(View v) {
		_timerLogic.execute();
		((TextView) findViewById(R.id.timerTextView)).setText("time: " + (_timerLogic.getTime()));
		ImageView image = (ImageView) findViewById(R.id.imageView1);
		image.setImageResource(_timerLogic.getImageId());
	}
	
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main_brambr, menu);
        return true;
    }
    
    
}
