package interfaces;

import java.util.List;

import models.Vehicle;
import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonVehicleDataHolderApi {

    @GET("users")
    Call<List<Vehicle>> getVehicles();

}
