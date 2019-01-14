package com.vehiclerental.app.vehiclerental;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import models.Vehicle;

public class VehicleAdapter extends RecyclerView.Adapter<VehicleAdapter.VehicleViewHolder> {

    private Context mContext;

    /*Using List<Vehicle>...........................................................................................................*/
    private List<Vehicle> vehicleList;

    public VehicleAdapter(Context mContext, List<Vehicle> vehicleList) {
        this.mContext = mContext;
        this.vehicleList = vehicleList;
    }

    @NonNull
    @Override
    public VehicleViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.card_list_item, null);

        return new VehicleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VehicleViewHolder vehicleViewHolder, int i) {

        final Vehicle vehicle = vehicleList.get(i);

        vehicleViewHolder.tvVehicleName.setText(vehicle.getVendorName());
        vehicleViewHolder.tvRate.setText(vehicle.getVehicleName());
        vehicleViewHolder.tvLocality.setText(vehicle.getLocality());

    }

    @Override
    public int getItemCount() {
        return vehicleList.size();
    }

    class VehicleViewHolder extends RecyclerView.ViewHolder {

        private ImageView ivImage;
        private TextView tvVehicleName, tvLocality, tvRate;
        private CardView cardView;

        public VehicleViewHolder(@NonNull View itemView) {
            super(itemView);

            cardView = itemView.findViewById(R.id.card_view);
            ivImage = itemView.findViewById(R.id.iv_card_image);
            tvVehicleName = itemView.findViewById(R.id.tv_card_vehicle_name);
            tvLocality = itemView.findViewById(R.id.tv_card_locality);
            tvRate = itemView.findViewById(R.id.tv_card_rate);

        }
    }

}
