package com.example.restaurantmanagement2;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;


public class Fragment_month extends Fragment {

    LineChart lineChart_month;

    public Fragment_month() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //fragment_month를 view로 연결
        View view = (View) inflater.inflate(R.layout.fragment_month, container, false);

        //Line차트 선언
        lineChart_month =(LineChart) view.findViewById(R.id.linechart_month);

        //Line차트 하단의 범례 표시
        LineDataSet lineDataSet1 = new LineDataSet(dataValues1(),"Data set 1");



        ArrayList<ILineDataSet> dataSets = new ArrayList<>();
        dataSets.add(lineDataSet1);

        //Line차트에 data 설정
        LineData data = new LineData(dataSets);
        lineChart_month.setData(data);
        lineChart_month.invalidate();

        //fragment_month가 연결되어있는 view를 반환하여 화면에 보여줌
        return view;
    }

    //Line차트 내용 입력
    private ArrayList<Entry> dataValues1() {
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

        LineDataSet lineDataSet1 = new LineDataSet(dataVals,"# of Calls");

        ArrayList<String> labels = new ArrayList<String>();
        labels.add("January");
        labels.add("February");
        labels.add("March");
        labels.add("April");
        labels.add("May");
        labels.add("June");
        labels.add("July");
        labels.add("August");
        labels.add("September");
        labels.add("October");
        labels.add("November");
        labels.add("December");

        LineData data = new LineData(lineDataSet1);
        lineDataSet1.setLabel("January");
        int[] color = ColorTemplate.COLORFUL_COLORS;
        lineDataSet1.setColor(color[0]);

        lineChart_month.setData(data);
        lineChart_month.animateY(5000);
        return dataVals;
    }

}