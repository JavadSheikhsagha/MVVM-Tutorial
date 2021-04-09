package jvd.ir.mvvm_tutorial.local;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import jvd.ir.mvvm_tutorial.models.UserModel;

@Database(entities = {UserModel.class}, version = 1)
public abstract class LocalDatabaseProvider extends RoomDatabase {

    public abstract UserDao userDao();
}
