package com.example.apicalljava.connectors;

import static com.example.apicalljava.MainActivity.apiUrl;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroFitInstance {

    public static RetroFitInstance instance;
    private ApiInterface apiInterface;

    RetroFitInstance() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(apiUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apiInterface = retrofit.create(ApiInterface.class);
    }

    public static RetroFitInstance getInstance() {
        if (instance == null) {
            instance = new RetroFitInstance();
        }
        return instance;
    }

    public ApiInterface getApiInterface() {
        return apiInterface;
    }
}
