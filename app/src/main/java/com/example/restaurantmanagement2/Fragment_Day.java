package com.example.restaurantmanagement2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;

public class Fragment_Day extends Fragment {

    LineChart lineChart_day;

    public Fragment_Day() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //fragment_month를 view로 연결
        View view = (View) inflater.inflate(R.layout.fragment_day, container, false);

        //Line차트 선언
        lineChart_day =(LineChart) view.findViewById(R.id.linechart_day);

        //Line차트 하단의 범례 표시
        LineDataSet lineDataSet1 = new LineDataSet(dataValues2(),"Data set 1");


        ArrayList<ILineDataSet> dataSets = new ArrayList<>();
        dataSets.add(lineDataSet1);

        //Line차트에 data 설정
        LineData data = new LineData(dataSets);
        lineChart_day.setData(data);
        lineChart_day.invalidate();

        //fragment_month가 연결되어있는 view를 반환하여 화면에 보여줌
        return view;
    }

    private ArrayList<Entry> dataValues2() {
        ArrayList<Entry> dataVals = new ArrayList<Entry>();

        //x축: 월, y축: 판매금액
        dataVals.add(new Entry(4f, 0));
        dataVals.add(new Entry(8f, 1));
        dataVals.add(new Entry(6f, 2));
        dataVals.add(new Entry(2f, 3));
        dataVals.add(new Entry(18f, 4));
        dataVals.add(new Entry(9f, 5));
        dataVals.add(new Entry(16f, 6));
        dataVals.add(new Entry(5f, 7));
        dataVals.add(new Entry(3f, 8));
        dataVals.add(new Entry(7f, 10));
        dataVals.add(new Entry(9f, 11));
        return dataVals;
    }

}
