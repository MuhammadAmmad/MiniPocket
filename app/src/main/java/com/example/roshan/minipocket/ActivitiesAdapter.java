package com.example.roshan.minipocket;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.roshan.minipocket.Zodiac.Zodiac;

import java.util.ArrayList;

/**
 * Created by roshan on 1/5/17.
 */

public class ActivitiesAdapter extends RecyclerView.Adapter<ActivitiesAdapter.MyViewHolder>{
    private ArrayList<Destination_Model> destination_detail;
    private Context context;


    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView spot_image;
        private TextView spot_text;

        public MyViewHolder(View view) {
            super(view);
            spot_text = (TextView)view.findViewById(R.id.txt_spot_name);
            spot_image = (ImageView) view.findViewById(R.id.spot_image);
            context = view.getContext();
            view.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            final Intent intent;
            //  Toast.makeText(view.getContext(), DataProvider.JAVA_BOOKS[getAdapterPosition()], Toast.LENGTH_SHORT).show();
//            String item= txt_spot.getText().toString();
//            Toast.makeText(view.getContext(),"You Clicked : "+item,Toast.LENGTH_SHORT).show();
//
            switch (getAdapterPosition()){
                case 0:
                    intent =  new Intent(context, Age_Calculator.class);
                    break;
                case 1:
                    intent =  new Intent(context, BMI_Calculator.class);
                    break;
                case 2:
                    intent =  new Intent(context, Zodiac.class);
                    break;
                case 3:
                    intent =  new Intent(context, Unit_Exchange.class);
                    break;

                default:
                    intent =  new Intent(context, MainActivity.class);
                    break;
            }
            context.startActivity(intent);
        }
    }


    public ActivitiesAdapter(Context context, ArrayList<Destination_Model> destination_details) {
        this.destination_detail= destination_details;
        this.context =context;

    }



    @Override
    public ActivitiesAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_view, parent, false);
        return new MyViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(ActivitiesAdapter.MyViewHolder holder, int position) {

        holder.spot_text.setText(destination_detail.get(position).getTitle());
//        ImageLoader.getInstance().displayImage(spotsList.get(position).getImage(), holder.spot_image);
        holder.spot_image.setImageResource(destination_detail.get(position).getImage());
    }



    @Override
    public int getItemCount() {
        return destination_detail.size();
    }



}
