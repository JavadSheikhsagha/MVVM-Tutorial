package jvd.ir.mvvm_tutorial.repo;

import java.util.List;

import jvd.ir.mvvm_tutorial.models.LocationModel;
import jvd.ir.mvvm_tutorial.api.MainApiService;
import retrofit2.Call;

public class MainRepository {

    private MainApiService mainApiService;

    public MainRepository(){
        mainApiService = new MainApiService();
    }

    public Call<List<LocationModel>> getLocation(Boolean farsi){
        return mainApiService.getLocation(farsi);
    }
}
