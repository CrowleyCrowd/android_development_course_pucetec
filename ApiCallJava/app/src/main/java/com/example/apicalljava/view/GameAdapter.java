package com.example.apicalljava.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apicalljava.R;
import com.example.apicalljava.model.GameModel;
import com.squareup.picasso.Picasso;

import java.util.List;

public class GameAdapter extends RecyclerView.Adapter<GameHolder> {

    private Context context;
    private List<GameModel> games;

    public GameAdapter(Context context, List<GameModel> games) {
        this.context = context;
        this.games = games;
    }

    @NonNull
    @Override
    public GameHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GameHolder(LayoutInflater.from(context).inflate(R.layout.item_game, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull GameHolder holder, int position) {
        holder.getTitle().setText(games.get(position).getTitle());
        holder.getDescription().setText(games.get(position).getShortDescription());
        Picasso.get().load(games.get(position).getThumbnailUrl()).into(holder.getImage());
    }

    @Override
    public int getItemCount() {
        return games.size();
    }

}
