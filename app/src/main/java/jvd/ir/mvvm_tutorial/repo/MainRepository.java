package jvd.ir.mvvm_tutorial.repo;

import android.content.Context;

import androidx.room.Room;

import java.util.List;

import jvd.ir.mvvm_tutorial.local.LocalApiService;
import jvd.ir.mvvm_tutorial.local.LocalDatabaseProvider;
import jvd.ir.mvvm_tutorial.models.LocationModel;
import jvd.ir.mvvm_tutorial.api.MainApiService;
import jvd.ir.mvvm_tutorial.models.UserModel;
import retrofit2.Call;

public class MainRepository {

    private MainApiService mainApiService;
    private LocalApiService localApiService;

    public MainRepository(Context context){
        localApiService = new LocalApiService(context);
        mainApiService = new MainApiService();
    }

    public Call<List<LocationModel>> getLocation(Boolean farsi){
        return mainApiService.getLocation(farsi);
    }

    public List<UserModel> getUsers(){
        return localApiService.getUsers();
    }

}
