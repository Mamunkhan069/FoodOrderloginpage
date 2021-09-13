package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.example.foodorder.models.mainmodel;
import com.example.foodorder.adapters.mainadapter;

import com.example.foodorder.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        binding=ActivityMainBinding.inflate(getLayoutInflater());


        ArrayList<mainmodel> list = new ArrayList<>();
        list.add(new mainmodel(R.drawable.burger, "Burger", "5", "beef burger"));
        list.add(new mainmodel(R.drawable.pizza, "Pizza", "5", "beef burger"));

        mainadapter adapter=new mainadapter(list, this);
        binding.recyclerview.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        binding.recyclerview.setLayoutManager(linearLayoutManager);

    }
}
