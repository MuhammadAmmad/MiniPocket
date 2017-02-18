package com.example.roshan.minipocket;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Destination_Model> destination_models = new ArrayList<>();
    private RecyclerView recyclerView;
    private ActivitiesAdapter pAdapter;
    private View view;
    private ActionBar actionBar;
    final private  int ArrayImage[] = {R.drawable.images,R.drawable.images,R.drawable.images,R.drawable.images};
    final private    int Place[] = {R.id.agecalculator,R.id.bmi,R.id.horoscope,R.id.converter};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        ArrayList destination_model_detail = prepareData();
        pAdapter = new ActivitiesAdapter(getApplicationContext(),destination_model_detail);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(pAdapter);
        pAdapter.notifyDataSetChanged();
    }



    private ArrayList prepareData(){

        ArrayList destination_detail = new ArrayList<>();
        for(int i = 0; i< ArrayImage.length; i++){
            Destination_Model destination_model = new Destination_Model();
            destination_model.setImage(ArrayImage[i]);
            destination_model.setTitle(Place[i]);
            destination_detail.add(destination_model);
        }
        return destination_detail;
    }
}
