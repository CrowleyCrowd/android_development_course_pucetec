package com.example.apicalljava.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apicalljava.R;

public class GameHolder extends RecyclerView.ViewHolder {
    private TextView title;
    private TextView description;
    private ImageView image;


    public GameHolder(@NonNull View viewItem) {
        super(viewItem);
        title = viewItem.findViewById(R.id.title);
        description = viewItem.findViewById(R.id.description);
        image = viewItem.findViewById(R.id.imageView);
    }

    public TextView getTitle() {
        return title;
    }

    public TextView getDescription() {
        return description;
    }

    public ImageView getImage() {
        return image;
    }

}
