package jvd.ir.mvvm_tutorial.local;

import android.content.Context;
import android.content.UriMatcher;

import androidx.room.Room;

import java.util.List;

import jvd.ir.mvvm_tutorial.models.UserModel;

public class LocalApiService {

    LocalDatabaseProvider databaseProvider;


    public LocalApiService(Context context){
        databaseProvider = Room.databaseBuilder(context,LocalDatabaseProvider.class,"database-name").build();
    }

    public List<UserModel> getUsers(){
        return databaseProvider.userDao().getAll();
    }
}
