package com.example.android.myapplication;

import android.app.ListActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends ListActivity {

    ListView listView;
    List<String> list;
    ListAdapter adapter;

    // TODO I create the array of the club list
    public String[] club_list = {
            "Jolly Club",
            "Vanquish Lounge",
            "Gaslight Night Club",
            "Champion Lounge"
    };

    // Array of club description text
    public static String[] club_describe = {
            "This revamp of a club is the best in town and covers all the DJs from Ethiopia, " +
            "Ibiza, Spai, Italy and far beyond your imagination my friend. You better come through " +
            "before you end up being the most outdated",


            "Vanquish vanquish vanquish Italy and far beyond your imagination my friend. " +
            "You better person alive! Italy and far beyond your imagination Vanquish vanquish " +
            "vanquish Italy and far beyond your imagination my friend.",

            "Gaslight Night Club",
            "Champion Lounge"
    };


    // Array of image list for clubs
    int[] image_list = {
            R.drawable.jolly,
            R.drawable.vanquish,
            R.drawable.jolly,
            R.drawable.vanquish,

    };



    public static String clicked_item;
    public static String clicked;
    public static String change_club_description;
    public static int club_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.textView);



        //TODO this is where I create an arraylist in which ill save the club list strings
        list = new ArrayList<>();

        // TODO I'll take your list, give it a layout, and connect it to your listView
        adapter = new ArrayAdapter<>(this, R.layout.list_item_white, android.R.id.text1, club_list);

        // TODO Iterate through each item in your club_list and add them inside your ArrayList
        //for (int i = 0; i < club_list.length; i++) {
        //    list.add(club_list[i]);
        //}

        // TODO Then connect your adapter to your listView which grabs elements from your ArrayList
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                clicked = listView.getItemAtPosition(position).toString();
                change_club_description = club_describe[position];
                club_image = image_list[position];

                //adapter.getItem(position);
                //for (int i=0; i<club_list.length; i++) {
                    //clicked_item = club_list[i];


            Intent i = new Intent(MainActivity.this, Profile.class);
                startActivity(i);

            }
        });

    }
}
