package com.viewpagerexp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private List<String> sampleModelArrayList;

    public RecyclerViewAdapter(List<String> list) {
        this.sampleModelArrayList = list;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView textView;

        public MyViewHolder(View view) {
            super(view);
            textView = (TextView) view.findViewById(R.id.textView);
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_recycler_view, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.textView.setText(sampleModelArrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return sampleModelArrayList.size();
    }
}
