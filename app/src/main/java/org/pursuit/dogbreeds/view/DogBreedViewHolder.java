package org.pursuit.dogbreeds.view;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.pursuit.dogbreeds.DisplayActivity;
import org.pursuit.dogbreeds.R;
import org.pursuit.dogbreeds.model.Dog;
import org.pursuit.dogbreeds.network.DogService;
import org.pursuit.dogbreeds.network.RetrofitSingleton;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class DogBreedViewHolder extends RecyclerView.ViewHolder {
    private static final String TAG = "image_call";
    private SharedPreferences sharedPreferences;
    private TextView breedTextView;
    private Intent intent;

    public DogBreedViewHolder(@NonNull View itemView) {
        super(itemView);
        breedTextView = itemView.findViewById(R.id.breed_textview);
        sharedPreferences = itemView.getContext().getApplicationContext().getSharedPreferences(TAG, Context.MODE_PRIVATE);
    }

    public void onBind(final String breed) {

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d(TAG, String.valueOf(sharedPreferences.contains((breed + "_image"))));
                if (sharedPreferences.contains((breed + "_image"))) {
                    // TODO if shared preferences contains dog breed image
                    // TODO create intent and send breed image_url to DisplayActivity
                } else {
                    Retrofit retrofit = RetrofitSingleton.getInstance();
                    DogService dogService = retrofit.create(DogService.class);
                    Call<Dog> puppy = dogService.getDogImage(breed);
                    puppy.enqueue(new Callback<Dog>() {
                        @Override
                        public void onResponse(Call<Dog> call, Response<Dog> response) {
                            Log.d(TAG, "onResponse: " + response.body().getMessage());
                            //TODO add the image url to shared preferences with the key breed_name + image
                            //TODO add url to intent and start display activity
                        }

                        @Override
                        public void onFailure(Call<Dog> call, Throwable t) {
                            Log.d(TAG, "onResponse: " + t.toString());
                        }
                    });
                }
            }
        });
    }
}
