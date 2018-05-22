package com.example.android.playfest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ArtistAdapter extends ArrayAdapter<Artist> {

    public ArtistAdapter(@NonNull Context context, ArrayList<Artist> artists) {
        super(context, 0, artists);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.artist_item, parent, false);
        }

        final Artist currentArtist = getItem(position);

       TextView artistTextView = listItemView.findViewById(R.id.artist_text_view);

        if (currentArtist != null)
            artistTextView.setText(currentArtist.getName());

        ImageView bandImageView = listItemView.findViewById(R.id.band_image_view);

        bandImageView.setImageResource(currentArtist.getImageResourceId());


        return listItemView;
    }
}