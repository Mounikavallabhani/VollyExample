package com.example.welcome.vollyexample;

import android.content.Context;
import android.support.annotation.NonNull;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import  android.support.v7.widget.RecyclerView.*;
import android.widget.TextView;

/**
 * Created by Welcome on 5/21/2018.
 */

public class ModelAdapter  extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private Context context;
    private List<Model> list;
    ModelAdapter.MyViewHolder modelAdapter;

    public ModelAdapter(Context context, List<Model> list) {
        this.context = context;
        this.list = list;
    }




    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.row, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        modelAdapter= (MyViewHolder) holder;
        Model model=list.get(position);

        modelAdapter.textTitle.setText(model.getTitle());
        modelAdapter.textbody.setText(model.getBody());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView textTitle, textbody;

        public MyViewHolder(View itemView) {
            super(itemView);

            textTitle = itemView.findViewById(R.id.title1);
            textbody = itemView.findViewById(R.id.body1);

        }
    }
}
