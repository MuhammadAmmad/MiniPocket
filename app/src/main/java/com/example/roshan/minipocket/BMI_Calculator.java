package com.example.roshan.minipocket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMI_Calculator extends AppCompatActivity {
    private EditText feet,inch,weight;
    private TextView result,description;
    private Button btn_calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi__calculator);
        feet=(EditText)findViewById(R.id.edit_feet);
        inch=(EditText)findViewById(R.id.edit_inch);
        weight=(EditText)findViewById(R.id.edit_weight);
        btn_calculate=(Button)findViewById(R.id.btn_calculate_bmi);
        result=(TextView)findViewById(R.id.txt_result);
        description=(TextView)findViewById(R.id.txt_decision);
        btn_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int feets= Integer.parseInt(feet.getText().toString());
                int inches= Integer.parseInt(inch.getText().toString());
                float weigh= Float.parseFloat(weight.getText().toString());
                float height= (float) ((feets*12+inches)*0.025);
                float total_height=height*height;
                float bmi_result=(weigh/total_height);
                result.setText ( String.format( "Result: %.2f", bmi_result ));

                if (Float.parseFloat(String.valueOf(bmi_result))<18.50) {
                    description.setText("UnderWeight");
                }
                else  if (Float.parseFloat(String.valueOf(bmi_result))>18.50 && Float.parseFloat(String.valueOf(bmi_result))<24.99){
                    description.setText("Healthy Weight");
                }else  if (Float.parseFloat(String.valueOf(bmi_result))>24.99 && Float.parseFloat(String.valueOf(bmi_result))<29.99){
                    description.setText("Over Weight");
                }else {
                    description.setText("Obese");
                }
          }
        });

    }
}
