package com.bolnizar.countgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import fr.castorflex.android.verticalviewpager.VerticalViewPager;

public class PlayActivity extends AppCompatActivity {

    private VerticalViewPager mVerticalViewPager;
    private PartsAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        loadViews();
        loadAdapter();
    }

    private void loadAdapter() {
        mAdapter = new PartsAdapter(getSupportFragmentManager());
        mVerticalViewPager.setAdapter(mAdapter);
    }

    private void loadViews() {
        mVerticalViewPager = (VerticalViewPager) findViewById(R.id.play_pager);
    }
}
