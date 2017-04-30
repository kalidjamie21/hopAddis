package com.example.android.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by User on 2017-04-29.
 */

public class Profile extends AppCompatActivity {




    TextView club_name;
    TextView club_description;
    ImageView club_gallery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        club_name = (TextView) findViewById(R.id.tvClubName);
        club_description = (TextView) findViewById(R.id.tvDescription);
        club_gallery = (ImageView) findViewById(R.id.ivGallery);

        club_name.setText(MainActivity.clicked);
        club_description.setText(MainActivity.change_club_description);
        club_gallery.setImageResource(MainActivity.club_image);


    }
}
