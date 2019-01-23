package org.pursuit.dogbreeds.network;

import org.pursuit.dogbreeds.model.Breeds;
import org.pursuit.dogbreeds.model.Dog;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface DogService {
    @GET()
    Call<Breeds> getDogBreeds();

    @GET()
    Call<Dog> getDogImage(@Path("type") String breed);
}
