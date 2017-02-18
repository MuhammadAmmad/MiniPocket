package com.example.roshan.minipocket.Scorpio;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.example.roshan.minipocket.HttpHandler;
import com.example.roshan.minipocket.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;

public class Yesterday extends Fragment {

    private ProgressDialog pDialog;
    private ListView lv;
    private View myView;

    // URL to get contacts JSON
    private static String url = "http://10.42.0.1/Horoscope/api.php";

    ArrayList<HashMap<String, String>> absentlist;
    private TextView txt_date;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myView= inflater.inflate(R.layout.activity_libra, container, false);
        absentlist = new ArrayList<>();
        lv = (ListView) myView.findViewById(R.id.detail_list_view);
        new GetContacts().execute();
        //long date = System.currentTimeMillis();

        lv.setOverScrollMode(View.OVER_SCROLL_NEVER);
        return myView;
    }
    private class GetContacts extends AsyncTask<String, Object, String> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            // Showing progress dialog
            pDialog = new ProgressDialog(getActivity());
            pDialog.setMessage("Please wait...");
            pDialog.setCancelable(false);
            pDialog.show();

        }

        @Override
        protected String doInBackground(String... arg0) {
            HttpHandler sh = new HttpHandler();

            // Making a request to url and getting response
            String jsonStr = sh.makeServiceCall(url);


            if (jsonStr != null) {
                try {
                    JSONArray jsonArray = new JSONArray(jsonStr);
                    System.out.println(jsonArray);
                    // looping through All Contacts
                    for (int i = 0; i < jsonArray.length(); i++) {
                        JSONObject c = jsonArray.getJSONObject(i);
                        String Id = c.optString("Id");
                        String Yesterday = c.optString("Yesterday");
                        String Today = c.optString("Today");
                        String Tomorrow = c.optString("Tomorrow");
                        String This_Week = c.optString("This_Week");
                        String This_Month = c.optString("This_Month");
                        String This_Year=c.optString("This_Year");
                        String Week_Date=c.optString("Week_Date");


                        // tmp hash map for single student_info
                        HashMap<String, String> student = new HashMap<>();
                        long date = System.currentTimeMillis()  - (1000 * 60 * 60 * 24);
                        SimpleDateFormat sdf = new SimpleDateFormat(" EEEE - MMM MM dd, yyyy");
                        String dateString = sdf.format(date);


                        // adding each child node to HashMap key => value
                        student.put("Yesterday", Yesterday);
                        student.put("Week_Date",dateString);
                        // adding student_info to student list
                        absentlist.add(student);
                    }
                } catch (final JSONException e) {


                }
            } else {


            }

            return jsonStr;
        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);
            // Dismiss the progress dialog
            if (pDialog.isShowing())
                pDialog.dismiss();
            /**
             * Updating parsed JSON data into ListView
             * */
            ListAdapter adapter = new SimpleAdapter(
                    getActivity(), absentlist,
                    R.layout.fragment_yesterday, new String[]{ "Yesterday","Week_Date"}, new int[]{
                    R.id.txt_desc,R.id.txt_date});

            lv.setAdapter(adapter);
//            String count = ""+lv.getAdapter().getCount();
//            txt_count.setText(count);
        }

    }
}
