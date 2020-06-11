package com.namo.songpong;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;
import java.util.ArrayList;

public class GraphFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_graph,null);
        LineChart lineChart = (LineChart) view.findViewById(R.id.chart);
        ArrayList<Entry> entries = new ArrayList<>();
        entries.add(new Entry(4f, 0));
        entries.add(new Entry(8f, 1));
        entries.add(new Entry(6f, 2));
        entries.add(new Entry(2f, 3));
        entries.add(new Entry(18f, 4));
        entries.add(new Entry(9f, 5));
        entries.add(new Entry(16f, 6));
        entries.add(new Entry(5f, 7));
        entries.add(new Entry(3f, 8));
        entries.add(new Entry(7f, 10));
        entries.add(new Entry(9f, 11));

        LineDataSet dataset = new LineDataSet(entries, "월별 수분변화");

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
        LineDataSet dataSet = new LineDataSet(entries, "수분 증가폭");
        LineData data = new LineData(dataSet);
        dataset.setColors(ColorTemplate.MATERIAL_COLORS); //
        /*dataset.setDrawCubic(true); //선 둥글게 만들기
        dataset.setDrawFilled(true); //그래프 밑부분 색칠*/

        lineChart.setData(data);
        lineChart.animateY(5000);



        LineChart lineCharts = (LineChart) view.findViewById(R.id.charts);
        ArrayList<Entry> entriess = new ArrayList<>();
        entriess.add(new Entry(4f, 0));
        entriess.add(new Entry(8f, 1));
        entriess.add(new Entry(6f, 2));
        entriess.add(new Entry(2f, 3));
        entriess.add(new Entry(18f, 4));
        entriess.add(new Entry(9f, 5));
        entriess.add(new Entry(16f, 6));
        entriess.add(new Entry(5f, 7));
        entriess.add(new Entry(3f, 8));
        entriess.add(new Entry(7f, 10));
        entriess.add(new Entry(9f, 11));

        LineDataSet datasets = new LineDataSet(entriess, "월별 비옥도");

        ArrayList<String> labelss = new ArrayList<String>();
        labelss.add("January");
        labelss.add("February");
        labelss.add("March");
        labelss.add("April");
        labelss.add("May");
        labelss.add("June");
        labelss.add("July");
        labelss.add("August");
        labelss.add("September");
        labelss.add("October");
        labelss.add("November");
        labelss.add("December");
        LineDataSet dataSets = new LineDataSet(entries, "비옥도 증가폭");
        LineData datas = new LineData(dataSet);
        dataset.setColors(ColorTemplate.COLORFUL_COLORS); //
        /*dataset.setDrawCubic(true); //선 둥글게 만들기
        dataset.setDrawFilled(true); //그래프 밑부분 색칠*/

        lineCharts.setData(data);
        lineCharts.animateY(5000);
        return view;

    }
}