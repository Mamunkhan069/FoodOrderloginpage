package com.example.foodorder.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foodorder.R;
import com.example.foodorder.models.mainmodel;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class mainadapter extends RecyclerView.Adapter<com.example.foodorder.adapters.mainadapter.viewholder> {
    ArrayList<mainmodel> list;
    Context context;

    public mainadapter(ArrayList<mainmodel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.simple_foodorder,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        final mainmodel model= list.get(position);
        holder.itemmage.setImageResource(model.getImage());
        holder.itemnametext.setText(model.getName());
        holder.pricetext.setText(model.getPrice());
        holder.descriptiontext.setText(model.getDescription());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class viewholder extends RecyclerView.ViewHolder {
        ImageView itemmage;
        TextView itemnametext,pricetext,descriptiontext;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            itemmage=itemView.findViewById(R.id.itemimageview);
            itemnametext=itemView.findViewById(R.id.itemtextview);
            pricetext=itemView.findViewById(R.id.pricetextview);
            descriptiontext=itemView.findViewById(R.id.descriptiontextview);

        }
    }


}
