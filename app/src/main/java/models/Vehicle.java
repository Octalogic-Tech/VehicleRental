package models;

import com.google.gson.annotations.SerializedName;

public class Vehicle {

    private int id;

    @SerializedName("username")
    private String vehicleName;

    @SerializedName("name")
    private String vendorName;

    @SerializedName("street")
    private String locality;

    public int getId() {
        return id;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public String getVendorName() {
        return vendorName;
    }

    public String getLocality() {
        return locality;
    }
}
