package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.example.foodorder.models.mainmodel;


public class FirstActivity extends AppCompatActivity implements View.OnClickListener{
    private Button login,register;
    private TextView skiptext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );
        getSupportActionBar().hide();
        login=findViewById(R.id.loginbtn);
        register=findViewById(R.id.registerbtn);
        skiptext=findViewById(R.id.skip);
        login.setOnClickListener(this);
        register.setOnClickListener(this);
        skiptext.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.loginbtn){
            Toast.makeText(getApplicationContext(), "Login button is clicked", Toast.LENGTH_SHORT).show();
            Intent intent1=new Intent(FirstActivity.this,SignIn.class);
            startActivity(intent1);
        }
        if(view.getId()==R.id.registerbtn){
            Toast.makeText(getApplicationContext(), "Register button is clicked", Toast.LENGTH_SHORT).show();
            Intent intent2=new Intent(FirstActivity.this,SignUp.class);
            startActivity(intent2);
        }
        if(view.getId()==R.id.skip){
            Toast.makeText(getApplicationContext(), "skip button is clicked", Toast.LENGTH_SHORT).show();
            Intent intent3=new Intent(FirstActivity.this,MainActivity.class);
            startActivity(intent3);
        }

    }
}