package com.eningapps.voicegame;

import android.graphics.Point;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.eningapps.voicegame.VoiceRunGame;

import utils.Constants;

public class AndroidLauncher extends AndroidApplication {

	//public static final DisplayMetrics DISPLAY_METRICS = new DisplayMetrics();

	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		//Gdx.graphics.setWindowedMode(Constants.APP_WIDTH, Constants.APP_HEIGHT);
		initialize(new VoiceRunGame(), config);

		//getWindowManager().getDefaultDisplay().getMetrics(DISPLAY_METRICS);
	}

/*	public static int getScreenHeightPixels() {
		return DISPLAY_METRICS.heightPixels;
	}

	public static int getScreenWidthPixels() {
		return DISPLAY_METRICS.widthPixels;
	}*/
}
