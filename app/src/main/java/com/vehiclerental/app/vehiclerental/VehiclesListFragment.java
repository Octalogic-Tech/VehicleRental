package com.vehiclerental.app.vehiclerental;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

import models.Vehicle;
import interfaces.JsonVehicleDataHolderApi;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class VehiclesListFragment extends Fragment {

    RecyclerView recyclerView;
    VehicleAdapter vehicleAdapter;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_vehicles_list, container, false);

        BottomNavigationView bottomNavigationView = view.findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);

        recyclerView = view.findViewById(R.id.rv_vehicles_list);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        JsonVehicleDataHolderApi vehicleDataHolderApi = retrofit.create(JsonVehicleDataHolderApi.class);

        Call<List<Vehicle>> call = vehicleDataHolderApi.getVehicles();
        call.enqueue(new Callback<List<Vehicle>>() {
            @Override
            public void onResponse(Call<List<Vehicle>> call, Response<List<Vehicle>> response) {
                if (!response.isSuccessful()){
                    Toast.makeText(getActivity(), "Code: "+ response.code(), Toast.LENGTH_SHORT).show();
                    return;
                }

                List<Vehicle> vehicles = response.body();

                vehicleAdapter = new VehicleAdapter(getContext(), vehicles);

                recyclerView.setAdapter(vehicleAdapter);

            }

            @Override
            public void onFailure(Call<List<Vehicle>> call, Throwable t) {
                Toast.makeText(getActivity(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        return view;

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    switch (menuItem.getItemId()) {
                        case R.id.item_bottomnav_sort:
                            SortBottomSheetFragment bottomSheetFragment = new SortBottomSheetFragment();
                            bottomSheetFragment.show(getFragmentManager(), "Sort Bottom Sheet");
                            break;
                        case R.id.item_bottomnav_filter:
                            // TODO: Connect to Filter Activity
                            Toast.makeText(getActivity(), "To the filter Page", Toast.LENGTH_SHORT).show();
                            break;
                    }
                    return true;
                }
            };
}
