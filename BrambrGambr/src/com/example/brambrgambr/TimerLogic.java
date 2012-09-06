package com.example.brambrgambr;

import android.view.View;
import android.widget.TextView;

public class TimerLogic {

	private int _timerState = 0;
	private int[] _imageCollection;
	public TimerLogic() {
		_imageCollection 		= new int[12];
		
		_imageCollection[0] 	= R.drawable.h1;
		_imageCollection[1] 	= R.drawable.h2;
		_imageCollection[2] 	= R.drawable.h3;
		_imageCollection[3] 	= R.drawable.h4;
		_imageCollection[4] 	= R.drawable.h5;
		_imageCollection[5] 	= R.drawable.h6;
		_imageCollection[6] 	= R.drawable.h7;
		_imageCollection[7] 	= R.drawable.h8;
		_imageCollection[8] 	= R.drawable.h9;
		_imageCollection[9] 	= R.drawable.h10;
		_imageCollection[10] 	= R.drawable.h11;
		_imageCollection[11] 	= R.drawable.h12;
	}
	
	public void execute() {
		// TODO Auto-generated method stub
		
		_timerState++;
		if(_imageCollection.length == _timerState)
		{
			_timerState = 0;
		}
	}
	
	public int timerState() {
		return _timerState;
	}
	
	public int getImageId() {
		return _imageCollection[_timerState];
	}

	public String getTime() {
		// TODO Auto-generated method stub
		
		return String.valueOf(timerState()+1) ;
	}

}
