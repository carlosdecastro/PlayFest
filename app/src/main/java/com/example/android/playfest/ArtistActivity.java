package com.example.android.playfest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Arrays;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        Artist[] artists = (Artist[])getIntent().getExtras().getSerializable("artists");

        ArtistAdapter adapter = new ArtistAdapter(this, new ArrayList<>(Arrays.asList(artists)));
        ListView listView = findViewById(R.id.artist_list_view);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new ListView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Artist currentArtist = (Artist) parent.getItemAtPosition(position);

                Intent playIntent = new Intent(ArtistActivity.this, PlayActivity.class);
                playIntent.putExtra("artist", currentArtist);
                startActivity(playIntent);
            }
        });
    }

}
