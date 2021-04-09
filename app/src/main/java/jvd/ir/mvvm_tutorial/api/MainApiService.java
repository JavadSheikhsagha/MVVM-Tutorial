package jvd.ir.mvvm_tutorial.api;

import java.util.List;

import jvd.ir.mvvm_tutorial.models.LocationModel;
import retrofit2.Call;

public class MainApiService {

    private ApiService apiService;

    public MainApiService(){
        apiService = ApiClient.getClient().create(ApiService.class);
    }

    public Call<List<LocationModel>> getLocation(Boolean farsi){
        return apiService.getLocation(farsi);
    }
}
