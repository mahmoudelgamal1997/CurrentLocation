package com.example2017.android.currentlocation;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class Date_Time extends AppCompatActivity implements DatePickerDialog.OnDateSetListener,TimePickerDialog.OnTimeSetListener {

    Button but_picktime;
    TextView textView;
    int year,month,day,yearfinal,monthfinal,dayfinal,hour,minute,hourfinal,minutefinal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date__time);

        but_picktime=(Button)findViewById(R.id.DatePicker);
        textView=(TextView)findViewById(R.id.textview);

        but_picktime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar c=Calendar.getInstance();
                year=c.get(Calendar.YEAR);
                month=c.get(Calendar.MONTH);
                day=c.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePicker=new DatePickerDialog(Date_Time.this,Date_Time.this,
                        year,
                        month,
                        day
                        );
                datePicker.show();
            }
        });



    }

    @Override
    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {

        yearfinal=i;
        monthfinal=i1+1;
        dayfinal=i2;



        Calendar c=Calendar.getInstance();
        hour=c.get(Calendar.HOUR_OF_DAY);
        minute=c.get(Calendar.MINUTE);


        TimePickerDialog timePickerDialog=new TimePickerDialog(Date_Time.this, Date_Time.this,
                hour,
                minute,false

                );

        timePickerDialog.show();

    }

    @Override
    public void onTimeSet(TimePicker timePicker, int i, int i1) {

        hourfinal=i;
        minutefinal=i1;

        textView.setText("year : "+yearfinal+"\n"
        +"month: "+ monthfinal+"\n"
                +"day : "+dayfinal+"\n"+
                "hour :"+hourfinal+"\n" +
                "minute: "+minutefinal
        );

    }
}
