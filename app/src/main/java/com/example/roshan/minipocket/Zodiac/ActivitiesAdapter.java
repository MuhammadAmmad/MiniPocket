package com.example.roshan.minipocket.Zodiac;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.roshan.minipocket.Destination_Model;
import com.example.roshan.minipocket.MainActivity;
import com.example.roshan.minipocket.R;

import java.util.ArrayList;

/**
 * Created by roshan on 1/5/17.
 */

public class ActivitiesAdapter extends RecyclerView.Adapter<ActivitiesAdapter.MyViewHolder>{
    private ArrayList<Destination_Model> destination_detail;
    private Context context;


    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView spot_image;
        private TextView spot_text,desc;

        public MyViewHolder(View view) {
            super(view);
            spot_text = (TextView)view.findViewById(R.id.txt_spot_name);
            spot_image = (ImageView) view.findViewById(R.id.spot_image);
            desc = (TextView)view.findViewById(R.id.txt_description);
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
                    intent =  new Intent(context, Aries.class);
                    break;
                case 1:
                    intent =  new Intent(context, Taurus.class);
                    break;
                case 2:
                    intent =  new Intent(context, Gemini.class);
                    break;
                case 3:
                    intent =  new Intent(context, Cancer.class);
                    break;
                case 4:
                    intent =  new Intent(context, Leo.class);
                    break;
                case 5:
                    intent =  new Intent(context, Virgo.class);
                    break;
                case 6:
                    intent =  new Intent(context, Libra.class);
                    break;
                case 7:
                    intent =  new Intent(context, Scorpio.class);
                    break;
                case 8:
                    intent =  new Intent(context, Sagittarius.class);
                    break;
                case 9:
                    intent =  new Intent(context, Capricon.class);
                    break;
                case 10:
                    intent =  new Intent(context, Aquarius.class);
                    break;
                case 11:
                    intent =  new Intent(context, Pieces.class);
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
                .inflate(R.layout.activity_zodiac, parent, false);
        return new MyViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(ActivitiesAdapter.MyViewHolder holder, int position) {

        holder.spot_text.setText(destination_detail.get(position).getTitle());
//        ImageLoader.getInstance().displayImage(spotsList.get(position).getImage(), holder.spot_image);
        holder.spot_image.setImageResource(destination_detail.get(position).getImage());
        holder.desc.setText(destination_detail.get(position).getDescription());
    }



    @Override
    public int getItemCount() {
        return destination_detail.size();
    }



}
