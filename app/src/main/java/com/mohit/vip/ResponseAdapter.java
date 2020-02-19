package com.mohit.vip;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ResponseAdapter extends RecyclerView.Adapter<ResponseAdapter.ResponseViewHolder> {

    ArrayList<in> response;
    Context context;

    public ResponseAdapter(Context context,ArrayList<in>respList){

        response = respList;
        this.context=context;


    }

    class ResponseViewHolder extends RecyclerView.ViewHolder {

        TextView name,mobile,email,gender,age,college,year,area,tech,working,link,fb,git,resume,why,share,any,ref;
        public ResponseViewHolder(@NonNull View itemView) {
            super(itemView);
            name = (TextView)itemView.findViewById(R.id.tv1);
            mobile = (TextView)itemView.findViewById(R.id.tv2);
            email = (TextView)itemView.findViewById(R.id.tv3);
            gender = (TextView)itemView.findViewById(R.id.tv4);
            age = (TextView)itemView.findViewById(R.id.tv5);
            college = (TextView)itemView.findViewById(R.id.tv6);
            year = (TextView)itemView.findViewById(R.id.tv7);
            area = (TextView)itemView.findViewById(R.id.tv8);
            tech = (TextView)itemView.findViewById(R.id.tv9);
            working = (TextView)itemView.findViewById(R.id.tv10);
            link = (TextView)itemView.findViewById(R.id.tv11);
            fb = (TextView) itemView.findViewById(R.id.tv12);
            git = (TextView) itemView.findViewById(R.id.tv13);
            resume = (TextView) itemView.findViewById(R.id.tv14);
            why = (TextView) itemView.findViewById(R.id.tv15);
            share = (TextView) itemView.findViewById(R.id.tv16);
            any = (TextView) itemView.findViewById(R.id.tv17);
            ref = (TextView) itemView.findViewById(R.id.tv18);

        }
    }


    @NonNull
    @Override
    public ResponseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent, false);
        return new ResponseViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ResponseViewHolder holder, int position) {

        in i = response.get(position);
        holder.name.setText(i.name);
        holder.mobile.setText(i.mob);
        holder.email.setText(i.email);
        holder.gender.setText(i.gender);
        holder.age.setText(i.age+"");
        holder.college.setText(i.college);
        holder.year.setText(i.year);
        holder.area.setText(i.area);
        holder.tech.setText(i.techs);
        holder.working.setText(i.working);
        holder.link.setText(i.link);
        holder.fb.setText(i.fb);
        holder.git.setText(i.git);
        holder.resume.setText(i.resume);
        holder.why.setText(i.why);
        holder.share.setText(i.share);
        holder.any.setText(i.any);
        holder.ref.setText(i.ref);


    }


    @Override
    public int getItemCount() {
        return response.size();
    }
}
