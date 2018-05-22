package com.example.android.playfest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FestivalAdapter adapter = new FestivalAdapter(this, initData());
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new ListView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Festival currentFestival = (Festival) parent.getItemAtPosition(position);

                Intent festivalIntent = new Intent(MainActivity.this, ArtistActivity.class);
                festivalIntent.putExtra("artists", currentFestival.getnArtists());

                startActivity(festivalIntent);
            }
        });
    }

    public ArrayList<Festival> initData() {

        //songs

        Song songSonicYouth1 = new Song("Kool Thing", "Goo", 1990, R.drawable.goo);
        Song songSonicYouth2 = new Song("Bubble Gum", "Sister", 1986, R.drawable.sister);

        Song songDeerHunter1 = new Song("Memory Boy", "Halcyon Digest", 2010, R.drawable.halcyon_digest);
        Song songDeerHunter2 = new Song("twilight at Carbon Lake", "Weird Era Cont.", 2008, R.drawable.weird_era_cont);

        Song songAphexTwin1 = new Song("Polynomial C", "Xylem Tube EP", 1992, R.drawable.xylem_tube_ep);
        Song songAphexTwin2 = new Song("Laughable Butane Bob", "Hangable Auto Bulb", 1995, R.drawable.hangable_auto_bulb);

        Song songTelevision1 = new Song("Venus", "Marquee Moon", 1977, R.drawable.marquee_moon);
        Song songTelevision2 = new Song("Prove it", "The Blow-Up", 1977, R.drawable.the_blow_up);

        Song songAmenDunes1 = new Song("Bedroom Drum", "Through Donkey Jaw", 2011, R.drawable.through_donkey_jaw);
        Song songAmenDunes2 = new Song("Bedroom Drum", "Through Donkey Jaw", 2011, R.drawable.through_donkey_jaw);

        Song songFuzz1 = new Song("Earthen Gate", "Fuzz", 2013, R.drawable.fuzz);
        Song songFuzz2 = new Song("Say Hello", "II", 2015, R.drawable.ii);

        Song songBoardsOfCanada1 = new Song("Bocuma", "Music Has the Right to Children", 1998, R.drawable.music_has_the_right_to_children);
        Song songBoardsOfCanada2 = new Song("Amo Bishop Roden", "In A Beautiful Place Out In The Country", 2000,R.drawable.in_a_beautiful_place_out_in_the_country);

        Song songYoLaTengo1 = new Song("Tom Courtenay", "Electr-O-Pura", 1995, R.drawable.electr_o_pura);
        Song songYoLaTengo2 = new Song("Sugarcube", "I Can Hear the Heart Beating as One", 1997, R.drawable.i_can_hear_the_heart_beating_as_one);

        //lists of song

        Song[] songsSonicYouth = {songSonicYouth1, songSonicYouth2};
        Song[] songsDeerhunter = {songDeerHunter1, songDeerHunter2};
        Song[] songsAphexTwin = {songAphexTwin1, songAphexTwin2};
        Song[] songsTelevision = {songTelevision1, songTelevision2};
        Song[] songsAmenDunes = {songAmenDunes1, songAmenDunes2};
        Song[] songsFuzz = {songFuzz1, songFuzz2};
        Song[] songsBoardsOfCanada = {songBoardsOfCanada1, songBoardsOfCanada2};
        Song[] songsYoLaTengo = {songYoLaTengo1, songYoLaTengo2};

        //artists with songs

        Artist artist1 = new Artist("Sonic Youth", songsSonicYouth, R.drawable.sonic_youth);
        Artist artist2 = new Artist("Yo la Tengo", songsYoLaTengo, R.drawable.yo_la_tengo);
        Artist artist4 = new Artist("Deerhunter", songsDeerhunter, R.drawable.deerhunter);
        Artist artist5 = new Artist("Aphex Twin", songsAphexTwin, R.drawable.aphex_twin);
        Artist artist6 = new Artist("Television", songsTelevision, R.drawable.television);
        Artist artist7 = new Artist("Amen Dunes", songsAmenDunes, R.drawable.amen_dunes);
        Artist artist8 = new Artist("Fuzz", songsFuzz, R.drawable.fuzz1);
        Artist artist9 = new Artist("Boards of Canada", songsBoardsOfCanada, R.drawable.boards_of_canada);

        Artist[] artistsPura = {artist1, artist2, artist4, artist5, artist6, artist7, artist8, artist9};
        Artist[] artistsLev = {artist9,artist4,artist7,artist2,artist1,artist5,artist6, artist8};
        Artist[] artistsWos = {artist5,artist6,artist8,artist2,artist9,artist4};
        Artist[] artistsPrimavera = {artist2,artist5,artist8,artist1,artist7};
        Artist[] artistsMelona = {artist5,artist1,artist9,artist7, artist2};
        Artist[] artistsResu = {artist5,artist2,artist6,artist8,artist4};
        Artist[] artistsParedes = {artist4,artist9,artist6,artist7};

        //list of festivals and populating it with artists

        ArrayList<Festival> festivals = new ArrayList<Festival>();
        festivals.add(new Festival("Electronic Visual Laboratory", artistsLev));
        festivals.add(new Festival("Works on Sundays", artistsWos));
        festivals.add(new Festival("Primavera Sound", artistsPrimavera));
        festivals.add(new Festival("Melona Fest", artistsMelona));
        festivals.add(new Festival("Paredes de Coura", artistsParedes));
        festivals.add(new Festival("Electr-O-Pura", artistsPura));
        festivals.add(new Festival("Resurrection Fest", artistsResu));

        return festivals;
    }
}
