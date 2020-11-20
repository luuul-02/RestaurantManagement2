package com.example.restaurantmanagement2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//Tab레이아웃 사용위한 추가 코드
import com.google.android.material.tabs.TabLayout;

//차트 사용위한 추가 코드 (MPAndroidChart import)
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.github.mikephil.charting.charts.LineChart;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //메뉴별/월별/일별 판매량/ 리뷰 페이지로 이동하기 위한 viewpager 설정과 adapter 설정
        ViewPager vp = findViewById(R.id.resmanage_viewpager);
        VPAdapter adapter = new VPAdapter(getSupportFragmentManager());
        vp.setAdapter(adapter);

        // tab table과 연동
        TabLayout tab = findViewById(R.id.resmanage_tab);
        tab.setupWithViewPager(vp);
        for(int i=0;i<4;i++) tab.getTabAt(i);



    }

}