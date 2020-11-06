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


        List<ListItemLayout> image_details = getListData();
        final ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new CustomListAdapter(this, image_details));

        // When the user clicks on the ListItem
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = listView.getItemAtPosition(position);
                ListItemLayout country = (ListItemLayout) o;
                Toast.makeText(MainActivity.this, "Selected :" + " " + country, Toast.LENGTH_LONG).show();
            }
        });
    }

    private  List<ListItemLayout> getListData() {
        List<ListItemLayout> list = new ArrayList();
        ListItemLayout max = new ListItemLayout("Maximilian Mairinger", "Super cool and stuff");
        ListItemLayout dan = new ListItemLayout("Daniel Zimmermann", "Super cool and stuff");
        ListItemLayout rap = new ListItemLayout("Raphael Schlager", "Super cool and stuff");
        ListItemLayout far = new ListItemLayout("Farid Goldmann", "Super cool and stuff");
        ListItemLayout mor = new ListItemLayout("Moritz Meier", "Super cool and stuff");
        ListItemLayout geo = new ListItemLayout("Georg Felber", "Super cool and stuff");


        list.add(max);
        list.add(dan);
        list.add(rap);
        list.add(far);
        list.add(mor);
        list.add(geo);

        return list;
    }
}