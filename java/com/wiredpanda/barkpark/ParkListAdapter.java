package com.wiredpanda.barkpark;

import android.content.Context;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ParkListAdapter extends ArrayAdapter {

    private final Context context;
    private final ArrayList<Park> data;


    public ParkListAdapter(Context context, ArrayList<Park> data){

        super(context, R.layout.parklist_item,  data);
        this.context = context;
        this.data = data;

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.parklist_item, parent, false);

        //Set the element data.)
        TextView parkName = (TextView)rowView.findViewById(R.id.lblParkName);
        TextView location = (TextView)rowView.findViewById(R.id.lblAddress);
        TextView distance = (TextView)rowView.findViewById(R.id.lblDistance);

        Park park = data.get(position);
        parkName.setText(park.name);
        location.setText(park.adress);
        distance.setText(park.distance);


        return rowView;

    }



}
