package jvd.ir.mvvm_tutorial.ui;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import jvd.ir.mvvm_tutorial.models.LocationModel;
import jvd.ir.mvvm_tutorial.models.UserModel;
import jvd.ir.mvvm_tutorial.repo.MainRepository;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainViewModel extends AndroidViewModel {

    private MainRepository repository;

    public MainViewModel(@NonNull Application application) {
        super(application);
        repository = new MainRepository(application);

    }

    public LiveData<List<LocationModel>> getLocation(Boolean farsi){
        MutableLiveData<List<LocationModel>> mutableLiveData = new MutableLiveData<>();

        repository.getLocation(farsi).enqueue(new Callback<List<LocationModel>>() {
            @Override
            public void onResponse(Call<List<LocationModel>> call, Response<List<LocationModel>> response) {
                mutableLiveData.setValue(response.body());
            }

            @Override
            public void onFailure(Call<List<LocationModel>> call, Throwable t) {

            }
        });

        return mutableLiveData;
    }

    public LiveData<List<UserModel>> getUsers(){
        MutableLiveData<List<UserModel>> liveData = new MutableLiveData<List<UserModel>>();

        liveData.setValue(repository.getUsers());
        return liveData;
    }
}
