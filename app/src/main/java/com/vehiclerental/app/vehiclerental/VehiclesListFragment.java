package com.vehiclerental.app.vehiclerental;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import models.Vehicle;

public class VehiclesListFragment extends Fragment {

    RecyclerView recyclerView;
    VehicleAdapter vehicleAdapter;

    List<Vehicle> vehicleList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_vehicles_list, container, false);

        recyclerView = view.findViewById(R.id.rv_vehicles_list);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        vehicleList = new ArrayList<>();
        /*......................................... Adding inputs for list of vehicles ................................................*/

        vehicleList.add(
                new Vehicle(1, "Honda", "Dio", 250, R.drawable.image_honda_dio, "Mapusa"));

        vehicleList.add(
                new Vehicle(2, "Hero", "Splendor", 251, R.drawable.image_hero_splendor, "Mapusa"));

        vehicleList.add(
                new Vehicle(3, "Honda", "Dio", 252, R.drawable.image_honda_dio, "Mapusa"));

        vehicleList.add(
                new Vehicle(4, "Hero", "Splendor", 253, R.drawable.image_hero_splendor, "Mapusa"));

        vehicleList.add(
                new Vehicle(5, "Honda", "Dio", 254, R.drawable.image_honda_dio, "Mapusa"));

        vehicleList.add(
                new Vehicle(6, "Hero", "Splendor", 255, R.drawable.image_hero_splendor, "Mapusa"));

        vehicleList.add(
                new Vehicle(7, "Honda", "Dio", 256, R.drawable.image_honda_dio, "Mapusa"));

        vehicleList.add(
                new Vehicle(1, "Honda", "Dio", 257, R.drawable.image_honda_dio, "Mapusa"));

        vehicleList.add(
                new Vehicle(2, "Hero", "Splendor", 258, R.drawable.image_hero_splendor, "Mapusa"));

        vehicleList.add(
                new Vehicle(3, "Honda", "Dio", 259, R.drawable.image_honda_dio, "Mapusa"));

        vehicleList.add(
                new Vehicle(4, "Hero", "Splendor", 260, R.drawable.image_hero_splendor, "Mapusa"));

        vehicleList.add(
                new Vehicle(5, "Honda", "Dio", 261, R.drawable.image_honda_dio, "Mapusa"));

        vehicleList.add(
                new Vehicle(6, "Hero", "Splendor", 262, R.drawable.image_hero_splendor, "Mapusa"));

        vehicleList.add(
                new Vehicle(7, "Honda", "Dio", 263, R.drawable.image_honda_dio, "Mapusa"));

        vehicleList.add(
                new Vehicle(1, "Honda", "Dio", 264, R.drawable.image_honda_dio, "Mapusa"));

        vehicleList.add(
                new Vehicle(2, "Hero", "Splendor", 265, R.drawable.image_hero_splendor, "Mapusa"));

        vehicleList.add(
                new Vehicle(3, "Honda", "Dio", 266, R.drawable.image_honda_dio, "Mapusa"));

        vehicleList.add(
                new Vehicle(4, "Hero", "Splendor", 267, R.drawable.image_hero_splendor, "Mapusa"));

        vehicleList.add(
                new Vehicle(5, "Honda", "Dio", 268, R.drawable.image_honda_dio, "Mapusa"));

        vehicleList.add(
                new Vehicle(6, "Hero", "Splendor", 269, R.drawable.image_hero_splendor, "Mapusa"));

        vehicleList.add(
                new Vehicle(7, "Honda", "Dio", 270, R.drawable.image_honda_dio, "Mapusa"));
        /*...........................................................................................................................*/

        vehicleAdapter = new VehicleAdapter(getContext(), vehicleList);

        recyclerView.setAdapter(vehicleAdapter);

        return view;

    }
}
