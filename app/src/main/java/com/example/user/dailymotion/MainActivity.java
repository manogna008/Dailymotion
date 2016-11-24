package com.example.user.dailymotion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private DMWebVideoView mVideoView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mVideoView = ((DMWebVideoView) findViewById(R.id.dmWebVideoView));
        mVideoView.loadUrl("http://orange.jobs/jobs/mobi.do?do=getOffer&lang=FR&id=28866");

    }
    @Override
    public void onBackPressed() {
        mVideoView.handleBackPress(this);
    }
}
