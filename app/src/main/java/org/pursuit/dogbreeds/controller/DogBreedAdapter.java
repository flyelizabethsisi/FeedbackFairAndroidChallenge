package org.pursuit.dogbreeds.controller;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.pursuit.dogbreeds.R;
import org.pursuit.dogbreeds.view.DogBreedViewHolder;

import java.util.List;

public class DogBreedAdapter extends RecyclerView.Adapter<DogBreedViewHolder> {
    private List<String> breedsList;

    public DogBreedAdapter(List<String> breedsList) {
        this.breedsList = breedsList;
    }

    @NonNull
    @Override
    public DogBreedViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

    }

    @Override
    public void onBindViewHolder(@NonNull DogBreedViewHolder dogBreedViewHolder, int i) {
        dogBreedViewHolder
    }

    @Override
    public int getItemCount() {

    }
}
