package com.example.apicalljava.connectors;

import com.example.apicalljava.model.GameModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("games")
    Call<List<GameModel>> getGames();

}
