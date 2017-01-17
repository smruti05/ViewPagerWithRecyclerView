package com.viewpagerexp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

@SuppressLint("ValidFragment")
public class SampleFragment extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<SampleModel> list;
    private int position;
    private RecyclerViewAdapter recyclerViewAdapter;

    @SuppressLint("ValidFragment")
    public SampleFragment(ArrayList<SampleModel> list, int position) {
        this.list = list;
        this.position = position;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_one, container, false);
        initViews(rootView);
        return rootView;
    }

    private void initViews(View rootView) {
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);
        recyclerViewAdapter = new RecyclerViewAdapter(list.get(position).getPaymentList());
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}

