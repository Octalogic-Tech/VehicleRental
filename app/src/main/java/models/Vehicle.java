package models;

public class Vehicle {

    private int mVehicleId;
    private String mVehicleBrand, mVehicleName, mLocality;
    private int mVehicleRate;
    private int mVehicleImgLink;


    public Vehicle(int mVehicleId, String mVehicleBrand, String mVehicleName, int mVehicleRate, int mVehicleImgLink, String mLocality) {
        this.mVehicleId = mVehicleId;
        this.mVehicleBrand = mVehicleBrand;
        this.mVehicleName = mVehicleName;
        this.mVehicleRate = mVehicleRate;
        this.mVehicleImgLink = mVehicleImgLink;
        this.mLocality = mLocality;
    }

    public int getmVehicleId() {
        return mVehicleId;
    }

    public String getmVehicleBrand() {
        return mVehicleBrand;
    }

    public String getmVehicleName() {
        return mVehicleName;
    }

    public int getmVehicleRate() {
        return mVehicleRate;
    }

    public int getmVehicleImgLink() {
        return mVehicleImgLink;
    }

    public String getmLocality() {
        return mLocality;
    }
}
