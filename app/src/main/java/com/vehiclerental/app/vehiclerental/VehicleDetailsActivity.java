package com.vehiclerental.app.vehiclerental;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import models.Vehicle;
import interfaces.JsonVehicleDataHolderApi;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class VehicleDetailsActivity extends AppCompatActivity {

    private TextView mTv_vehicle_name,mTv_vendor_name,mTv_locality;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle_details);

        mTv_vehicle_name = findViewById(R.id.tv_vehicle_name);
        mTv_vendor_name = findViewById(R.id.tv_vendor_name);
        mTv_locality = findViewById(R.id.tv_locality);

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
                    Toast.makeText(VehicleDetailsActivity.this, "Code: "+ response.code(), Toast.LENGTH_SHORT).show();
                    return;
                }

                List<Vehicle> vehicles = response.body();

                for (Vehicle vehicle : vehicles){

                    if (vehicle.getId()== 3){
                        mTv_vehicle_name.setText(vehicle.getVehicleName());
                        mTv_vendor_name.setText(vehicle.getVendorName());
                        mTv_locality.setText(vehicle.getLocality());
                    }

                }

            }

            @Override
            public void onFailure(Call<List<Vehicle>> call, Throwable t) {
                Toast.makeText(VehicleDetailsActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
