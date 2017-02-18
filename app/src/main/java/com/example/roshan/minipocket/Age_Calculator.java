package com.example.roshan.minipocket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;

public class Age_Calculator extends AppCompatActivity {

    private TextView txt_year,txt_day,txt_month,result;
    private EditText txt_month1,txt_day1,txt_year1;
    private Button btn_calculate_age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age__calculator);
        txt_month = (TextView)findViewById(R.id.edit_month);
        txt_month1=(EditText) findViewById(R.id.edit_month1);
        txt_day=(TextView)findViewById(R.id.edit_day);
        txt_day1=(EditText) findViewById(R.id.edit_day1);
        txt_year=(TextView)findViewById(R.id.edit_year);
        txt_year1=(EditText) findViewById(R.id.edit_year1);
        result=(TextView)findViewById(R.id.txt_result);
        btn_calculate_age=(Button)findViewById(R.id.btn_calculate_age);
        final long date = System.currentTimeMillis();
        SimpleDateFormat sdf_year = new SimpleDateFormat("yyyy");
        final String[] dateString_year = {sdf_year.format(date)};
        txt_year.setText(dateString_year[0]);
        SimpleDateFormat sdf_month = new SimpleDateFormat("MM");
        final String[] dateString_month = {sdf_month.format(date)};
        txt_month.setText(dateString_month[0]);
        SimpleDateFormat sdf_day = new SimpleDateFormat("dd");
        final String[] dateString_day = {sdf_day.format(date)};
        txt_day.setText(dateString_day[0]);
        btn_calculate_age.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             String old_day = txt_day1.getText().toString();
             String old_month = txt_month1.getText().toString();
             String old_year = txt_year1.getText().toString();

             //you can use Integer.parseInt() instead of Long.parseLong

             if (Long.parseLong(String.valueOf(dateString_day[0])) < Long.parseLong(String.valueOf(old_day))) {
                 dateString_day[0] = String.valueOf(Long.parseLong(String.valueOf(dateString_day[0])) + 30);
                 dateString_month[0] = String.valueOf(Long.parseLong(String.valueOf(dateString_month[0])) - 1);
             }
                 if (Long.parseLong(String.valueOf(dateString_month[0])) < Long.parseLong(String.valueOf(old_month))) {
                     dateString_month[0] = String.valueOf(Long.parseLong(String.valueOf(dateString_month[0])) + 12);
                     dateString_year[0] = String.valueOf(Long.parseLong(String.valueOf(dateString_year[0])) - 1);

                 }
                     long year = Long.parseLong(String.valueOf(dateString_year[0])) - Long.parseLong(String.valueOf(old_year));
                     long month = Long.parseLong(String.valueOf(dateString_month[0])) - Long.parseLong(String.valueOf(old_month));
                     long day = Long.parseLong(String.valueOf(dateString_day[0])) - Long.parseLong(String.valueOf(old_day));
                     result.setText(year + " years " + month + " month " + day + " day ");
                 }
     });
    }

}
