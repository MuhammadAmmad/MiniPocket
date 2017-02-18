package com.example.roshan.minipocket.Zodiac;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.roshan.minipocket.*;
import com.example.roshan.minipocket.ActivitiesAdapter;

import java.util.ArrayList;
import java.util.List;

public class Zodiac extends AppCompatActivity {
    private List<Destination_Model> destination_models = new ArrayList<>();
    private RecyclerView recyclerView;
    private com.example.roshan.minipocket.Zodiac.ActivitiesAdapter pAdapter;
    private View view;
    private ActionBar actionBar;
    final private  int ArrayImage[] = {R.drawable.aries,R.drawable.taurus,R.drawable.gemini1,R.drawable.cancer,R.drawable.leo,R.drawable.virgo,R.drawable.libra,R.drawable.scorpio,R.drawable.sagitarius,R.drawable.capricon,R.drawable.aquarius,R.drawable.pieces};
    final private    int Place[] = {R.id.aries,R.id.taurus,R.id.gemini,R.id.cancer,R.id.leo,R.id.virgo,R.id.libra,R.id.scorpio,R.id.sagitarrius,R.id.capricon,R.id.aquarius,R.id.pieces};
    final private int date[]={R.id.ariesdate,R.id.taurusdate,R.id.geminidate,R.id.cancerdate,R.id.leodate,R.id.virgodate,R.id.libradate,R.id.scorpiodate,R.id.sagitariusdate,R.id.capricondate,R.id.aquariusdate,R.id.piescesdate};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        ArrayList destination_model_detail = prepareData();
        pAdapter = new com.example.roshan.minipocket.Zodiac.ActivitiesAdapter(getApplicationContext(),destination_model_detail);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getApplicationContext(),2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(pAdapter);
        pAdapter.notifyDataSetChanged();
        Zodiac.this.setTitle("Horoscope");
    }
    private ArrayList prepareData(){

        ArrayList destination_detail = new ArrayList<>();
        for(int i = 0; i< ArrayImage.length; i++){
            Destination_Model destination_model = new Destination_Model();
            destination_model.setImage(ArrayImage[i]);
            destination_model.setTitle(Place[i]);
            destination_model.setDescription(date[i]);
            destination_detail.add(destination_model);
        }
        return destination_detail;
    }
}
