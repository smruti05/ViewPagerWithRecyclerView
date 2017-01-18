package com.viewpagerexp;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.viewpagerindicator.CirclePageIndicator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    /*private int[] imageIds = {R.drawable.faasos, R.drawable.zomato,
            R.drawable.foodpanda, R.drawable.my_website,
            R.drawable.phone_call, R.drawable.swiggy,
            R.drawable.thefork, R.drawable.travel_khana};*/

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
        ArrayList<SampleModel> arrayList = new ArrayList<SampleModel>();
        for (int i = 0; i < 3; i++) {
            SampleModel sampleModel = new SampleModel();
            ArrayList<String> strList = new ArrayList<>();
            for (int j = 0; j < 4; j++) {
                strList.add(String.valueOf(j));
            }
            sampleModel.setPaymentList(strList);
            arrayList.add(sampleModel);
        }
       /* ArrayList<SampleModel> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            SampleModel model = new SampleModel();
            ArrayList<String> list = new ArrayList<>();
            list.add(String.valueOf(i));
            model.setPaymentList(list);
        }
        for (int start = 0; start < arrayList.size(); start += 3) {
            int end = Math.min(start + 3, arrayList.size());
            List<String> sublist = arrayList.get(start).getPaymentList().subList(start, end);
            System.out.println(sublist);
        }*/
        return arrayList;
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