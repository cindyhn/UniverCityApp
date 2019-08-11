package com.example.univercityapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.view.Window;


public class OnboardingActivity extends AppCompatActivity {


    private Button skipBtn;
    private Button nextBtn;
    private ViewPager viewPager;
    private LinearLayout layoutDot;
    private TextView[]dots;
    private int[]onBoardScreens;
    private OnboardingAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setNotifBarTrans();
        setContentView(R.layout.onboard_activity);

        viewPager = findViewById(R.id.viewPager);
        layoutDot = findViewById(R.id.dottedLayout);
        nextBtn = findViewById(R.id.next);
        skipBtn = findViewById(R.id.skip);



        skipBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startMainActivity();
            }
        });

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int currentPage = viewPager.getCurrentItem()+1;
                if(currentPage < onBoardScreens.length) {
                    viewPager.setCurrentItem(currentPage);
                } else {
                    startMainActivity();
                }
            }
        });

        onBoardScreens = new int[]{R.layout.onboard0,R.layout.onboard1, R.layout.onboard2, R.layout.onboard3, R.layout.onboard4, R.layout.onboard5,R.layout.onboard6};
        pagerAdapter = new OnboardingAdapter(onBoardScreens,getApplicationContext());
        viewPager.setAdapter(pagerAdapter);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int page, float pageoffset, int pagepixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if(position == onBoardScreens.length-1){
                    nextBtn.setText("START");
                    skipBtn.setVisibility(View.GONE);
                }else {
                    nextBtn.setText("NEXT");
                    skipBtn.setVisibility(View.VISIBLE);
                }
                setDotStatus(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        setDotStatus(0);
    }

    private void setDotStatus(int page){
        layoutDot.removeAllViews();
        dots =new TextView[onBoardScreens.length];
        for (int i = 0; i < dots.length; i++) {
            dots[i] = new TextView(this);
            dots[i].setText(Html.fromHtml("&#8226;"));
            dots[i].setTextSize(30);
            dots[i].setTextColor(Color.parseColor("#a9b4bb"));
            layoutDot.addView(dots[i]);
        }
        if(dots.length>0){
            dots[page].setTextColor(Color.parseColor("#ffffff"));
        }
    }

    private void startMainActivity(){
        startActivity(new Intent(OnboardingActivity.this, HomeActivity.class));
        finish();
    }

    private void setNotifBarTrans(){
        if (Build.VERSION.SDK_INT >= 21){
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE|View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
        }

    }
}