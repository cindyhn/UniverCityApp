package com.example.univercityapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<Integer> week, date;
    private ArrayList<String> month, lecture, lab;

    public RecyclerViewAdapter(ArrayList<Integer> week, ArrayList<Integer> date, ArrayList<String> month,
                               ArrayList<String> lecture, ArrayList<String> lab, ProgressionActivity progressionActivity) {
        this.week = week;
        this.date = date;
        this.month = month;
        this.lecture = lecture;
        this.lab = lab;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {

        viewHolder.week.setText("Week " + String.valueOf(week.get(position)));
        viewHolder.date.setText(String.valueOf(date.get(position)));
        viewHolder.month.setText(month.get(position));
        viewHolder.lecture.setText(lecture.get(position));
        viewHolder.lab.setText(lab.get(position));
    }

    @Override
    public int getItemCount() {
        return week.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder  {
        TextView week, date, month, lecture, lab;
        RelativeLayout parentLayout;

        public ViewHolder(View view) {
            super(view);
            date = view.findViewById(R.id.date);
            week = view.findViewById(R.id.week);
            month = view.findViewById(R.id.month);
            lecture = view.findViewById(R.id.lecture);
            lab = view.findViewById(R.id.lab);
            parentLayout = view.findViewById(R.id.parent_layout);
        }
    }
}