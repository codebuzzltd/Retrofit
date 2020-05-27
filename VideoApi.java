package com.example.checklink;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface VideoApi {
    String BASE_URL = "https://mozeloapp.in/viddo/retrivevideo.php/";

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    @GET(BASE_URL)
    Call<List<ModelClass>> getVideoLink();

}
