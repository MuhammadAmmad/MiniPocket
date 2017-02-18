package com.example.roshan.minipocket;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Unit_Exchange extends AppCompatActivity {
    private ProgressDialog pDialog;
    private static String url = "http://10.42.0.1/Horoscope/rate_exchange.php";
    private EditText edit_nepali,edit_usd;
    private Button btn_rate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit__exchange);
        edit_nepali=(EditText)findViewById(R.id.edit_nepali);
        edit_usd=(EditText)findViewById(R.id.edit_usd);
        btn_rate=(Button)findViewById(R.id.btn_calculate_unit);
        new GetContacts().execute();

    }

    private class GetContacts extends AsyncTask<String, Void, String> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
//            pDialog=new ProgressDialog(getApplicationContext());
//            pDialog.setMessage("Please Wait..");
//            pDialog.setCancelable(false);
//            pDialog.show();
        }

        @Override
        protected String doInBackground(String... strings) {

            HttpHandler sh = new HttpHandler();

            String jsonStr = sh.makeServiceCall(url);
            return jsonStr;
        }

        @Override
        protected void onPostExecute(String jsonStr) {
            super.onPostExecute(jsonStr);

            if (jsonStr != null) {
                try {


                    // Getting JSON Array node
                    JSONArray user_detail = new JSONArray(jsonStr);

                    // looping through All Contacts
                    for (int i = 0; i < user_detail.length(); i++) {
                        JSONObject c = user_detail.getJSONObject(i);

                        String Id = c.getString("Id");
                        final String[] Usd_Dollar = {c.getString("Usd_Dollar")};
                      //  username.setText(name);
                        String Aus_Dollar = c.getString("Aus_Dollar");
                        String Indian =c.getString("Indian");
                     //   user_number.setText(phone);
                        btn_rate.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                String nepali= edit_nepali.getText().toString();
                                float rate= Float.parseFloat(String.valueOf(Usd_Dollar[0])) * Float.parseFloat(String.valueOf(nepali));
                                 edit_usd.setText ( String.format( "Rs. %.2f", rate ));
                            }
                        });

                    }
                } catch (final JSONException e) {


                }
            }

//            if (pDialog.isShowing())
//                pDialog.dismiss();
        }

    }



}
