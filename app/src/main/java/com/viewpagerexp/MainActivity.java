package com.viewpagerexp;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.viewpagerindicator.CirclePageIndicator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private int [] imageIds = {R.drawable.selected_dot, R.drawable.deselected_dot, R.drawable.selected_dot, R.drawable.deselected_dot, R.drawable.selected_dot};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViewPagerComponent();
    }

    private void initViewPagerComponent() {
        ViewPager mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(new SamplePagerAdapter(getSupportFragmentManager(), getDummyData()));
        setCircularPageIndicator(mViewPager);
    }

    private ArrayList<SampleModel> getDummyData() {
        ArrayList<SampleModel> list = new ArrayList<SampleModel>();
        for (int i = 0; i < 3; i++) {
            SampleModel sampleModel = new SampleModel();
            ArrayList<String> strList = new ArrayList<>();
            for (int j = 0; j < 4; j++) {
                strList.add(String.valueOf(j));
            }
            sampleModel.setPaymentList(strList);
            list.add(sampleModel);
        }
        return list;
    }

    private void setCircularPageIndicator(ViewPager mViewPager) {
        CirclePageIndicator title = (CirclePageIndicator) findViewById(R.id.titles);
        title.setViewPager(mViewPager);

        final float density = getResources().getDisplayMetrics().density;
        title.setRadius(10 * density);
        title.setPageColor(R.color.payment_dots);
        title.setFillColor(R.color.grey);
        title.setStrokeWidth(2 * density);
    }
}