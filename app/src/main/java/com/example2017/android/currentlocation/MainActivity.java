package com.example2017.android.currentlocation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void client(View v){
        Intent intent=new Intent(MainActivity.this,ClientLogin.class);
        startActivity(intent);
    }

    public void admin(View v){
        Intent intent=new Intent(MainActivity.this,Admin.class);
        startActivity(intent);
    }


}
