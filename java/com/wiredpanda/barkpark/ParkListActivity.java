package com.wiredpanda.barkpark;


import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class ParkListActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        //Load the data we want to display. Usually a fetch from the DB
        //or some Array of data as shown below.
        String[] values = new String[]{
                "Armando",
                "Alba",
                "Amanda",
                "Andres"
        };

        //In this case we are using dummy data as shownbelow.
        ArrayList parks = new ArrayList();
        Park p1 = new Park();
        p1.name = "Armando Padilla";
        p1.adress = "6410 Haas Avenue";
        p1.distance = "3 miles";
        parks.add(p1);

        //Instantiate the adapter to connect the data to the view.  Passing in the context
        //and the data.
        ParkListAdapter adapter = new ParkListAdapter(this, parks);

        //Bind it! Aaaaaand Done.
        setListAdapter(adapter);

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id){
        String item = (String) getListAdapter().getItem(position);
        Toast.makeText(this, item+" selected", Toast.LENGTH_LONG).show();
    }


}
