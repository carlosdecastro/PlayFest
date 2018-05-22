package com.example.android.playfest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class FestivalAdapter extends ArrayAdapter<Festival> {

    public FestivalAdapter(@NonNull Context context, ArrayList<Festival> festivals) {
        super(context, 0, festivals);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.festival_item, parent, false);
        }

        final Festival currentFestival = getItem(position);

        TextView festivalNameTextView = listItemView.findViewById(R.id.festival_name_text_view);

        if (currentFestival != null)
            festivalNameTextView.setText(currentFestival.getName());


        return listItemView;
    }
}