package com.example2017.android.currentlocation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Admin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
    }

    public void show (View v)
    {
        Intent intent=new Intent(Admin.this,AdminMap.class);
        startActivity(intent);
    }

    public void time (View v)
    {
        Intent intent=new Intent(Admin.this,TimeMangement.class);
        startActivity(intent);
    }

}
