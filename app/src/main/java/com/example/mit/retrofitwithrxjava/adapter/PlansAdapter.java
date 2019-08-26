package com.example.mit.retrofitwithrxjava.adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mit.retrofitwithrxjava.R;
import com.example.mit.retrofitwithrxjava.models.Datum;

import java.util.List;

public class PlansAdapter extends RecyclerView.Adapter<PlansAdapter.MyViewHolder>  {

    private Activity activity;
    private List<Datum> planList;


    public PlansAdapter(Activity activity, List<Datum> value) {
        this.activity=activity;
        this.planList=value;
    }

    @NonNull
    @Override
    public PlansAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View  view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adapter_plans,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlansAdapter.MyViewHolder myViewHolder, int i) {

        myViewHolder.planName.setText(""+planList.get(i).getName());
    }

    @Override
    public int getItemCount() {
        return planList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView planName;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            planName=itemView.findViewById(R.id.planName);
        }

    }
}
