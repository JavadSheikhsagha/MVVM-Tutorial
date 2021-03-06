package jvd.ir.mvvm_tutorial.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import jvd.ir.mvvm_tutorial.models.LocationModel;
import jvd.ir.mvvm_tutorial.R;
import jvd.ir.mvvm_tutorial.models.UserModel;

public class MainActivity extends AppCompatActivity {

    private MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModel = new ViewModelProvider(this).get(MainViewModel.class);

        getLocation();

        getUsers();
    }

    private void getUsers() {

        viewModel.getUsers().observe(this, new Observer<List<UserModel>>() {
            @Override
            public void onChanged(List<UserModel> userModels) {
                Log.i("LOG10", "onChanged: ");
            }
        });
    }

    private void getLocation() {

        viewModel.getLocation(true).observe(this, new Observer<List<LocationModel>>() {
            @Override
            public void onChanged(List<LocationModel> locationModels) {
                Log.i("LOG10", "onChanged: "+ locationModels.toString());
            }
        });
    }
}