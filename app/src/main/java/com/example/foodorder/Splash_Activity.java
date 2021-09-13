package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class Splash_Activity extends AppCompatActivity {

    private ProgressBar progressBar;
    private int progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        progressBar=findViewById(R.id.progressbarid);
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                dowork();
                startApp();

            }
        });
        thread.start();
    }
    public void dowork(){
        for(progress=20;progress <=100;progress=progress+20) {
            try {
                Thread.sleep(500);
                progressBar.setProgress(progress);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


    }
    public void startApp(){
        Intent intent=new Intent(Splash_Activity.this,FirstActivity.class);
        startActivity(intent);
        finish();

    }

}