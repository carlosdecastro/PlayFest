package com.example.android.playfest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        Artist artist = (Artist) getIntent().getExtras().getSerializable("artist");

        Song[] songs = artist.getSongs();

        // Calculate a random song
        double randomSong = Math.random() * (songs.length);

        ImageView albumImageView = findViewById(R.id.album_image_view);
        albumImageView.setImageResource(songs[(int)randomSong].getImageResourceId());

        TextView artistNameTextView = findViewById(R.id.artist_name_text_view);
        artistNameTextView.setText(artist.getName());

        TextView songTitleTextView = findViewById(R.id.song_title_text_view);

        songTitleTextView.setText(songs[(int)randomSong].getName());


    }
}
