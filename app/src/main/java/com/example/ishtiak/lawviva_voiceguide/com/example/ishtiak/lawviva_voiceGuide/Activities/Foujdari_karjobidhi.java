package com.example.ishtiak.lawviva_voiceguide.com.example.ishtiak.lawviva_voiceGuide.Activities;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ishtiak.lawviva_voiceguide.R;

import static java.security.AccessController.getContext;

public class Foujdari_karjobidhi extends AppCompatActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foujdari_karjobidhi);

        viewPager = (ViewPager) findViewById(R.id.viewpagerFkarjobidhi);

        CustomPagerAdapter adapter = new CustomPagerAdapter(this);
        viewPager.setAdapter(adapter);

    }
}
