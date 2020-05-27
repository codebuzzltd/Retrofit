package com.example.checklink;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    private VideoApi videoApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoApi = VideoApi.retrofit.create(VideoApi.class);
        Call<List<ModelClass>> call = videoApi.getVideoLink();
        call.enqueue(new Callback<List<ModelClass>>() {
            @Override
            public void onResponse(Call<List<ModelClass>> call, Response<List<ModelClass>> response) {
                if (response.isSuccessful()){
                    for (ModelClass modelClass : response.body()){
                        String link = modelClass.getPathToFile();
                        Log.d("LINK", "onResponse: "+link);
                    }
                }else {
                    Log.d("LINK", "onResponse: "+"FAILED");
                }
            }

            @Override
            public void onFailure(Call<List<ModelClass>> call, Throwable t) {

                Log.d("LINK", "onResponse: "+t.getLocalizedMessage());
            }
        });

    }
}
