package jvd.ir.mvvm_tutorial.api;

import java.util.List;

import jvd.ir.mvvm_tutorial.models.LocationModel;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("getlocation.php")
    Call<List<LocationModel>> getLocation(@Query("farsi")Boolean farsi);

}
