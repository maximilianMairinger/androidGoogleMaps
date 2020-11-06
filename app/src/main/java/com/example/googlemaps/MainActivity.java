package com.example.googlemaps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<ListItem> image_details = getListData();
        final ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new CustomListAdapter(this, image_details));

        // When the user clicks on the ListItem
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = listView.getItemAtPosition(position);
                ListItem country = (ListItem) o;
                Toast.makeText(MainActivity.this, "Selected :" + " " + country, Toast.LENGTH_LONG).show();
            }
        });
    }

    private  List<ListItem> getListData() {
        List<ListItem> list = new ArrayList();
        ListItem max = new ListItem("Maximilian Mairinger", "Super cool and stuff");
        ListItem dan = new ListItem("Daniel Zimmermann", "Super cool and stuff");
        ListItem rap = new ListItem("Raphael Schlager", "Super cool and stuff");
        ListItem far = new ListItem("Farid Goldmann", "Super cool and stuff");
        ListItem mor = new ListItem("Moritz Meier", "Super cool and stuff");
        ListItem geo = new ListItem("Georg Felber", "Super cool and stuff");


        list.add(max);
        list.add(dan);
        list.add(rap);
        list.add(far);
        list.add(mor);
        list.add(geo);

        return list;
    }
}