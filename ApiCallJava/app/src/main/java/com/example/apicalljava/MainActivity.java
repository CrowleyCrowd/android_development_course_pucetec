package com.example.apicalljava;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;

import com.example.apicalljava.connectors.RetroFitInstance;
import com.example.apicalljava.view.GameAdapter;
import com.example.apicalljava.model.GameModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcvMain;

    private List<GameModel> games;

    public static String apiUrl = "https://www.freetogame.com/api/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcvMain = findViewById(R.id.rcvMain);
        rcvMain.setLayoutManager(new LinearLayoutManager(this));
        RetroFitInstance.getInstance().getApiInterface().getGames().enqueue(new Callback<List<GameModel>>() {
            @Override
            public void onResponse(Call<List<GameModel>> call, Response<List<GameModel>> response) {
                games = response.body();
                rcvMain.setAdapter(new GameAdapter(getApplicationContext(),games));
            }

            @Override
            public void onFailure(Call<List<GameModel>> call, Throwable t) {
                Log.e("API", "onFailure:" + t.getLocalizedMessage());
            }
        });

    }
}