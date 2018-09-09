package com.laioffer.tinnews;

import android.app.Application;
import android.arch.persistence.room.Room;

import com.facebook.stetho.Stetho;
import com.laioffer.tinnews.database.AppDatabase;

public class TinApplication extends Application {
    public static AppDatabase database;
    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
        //init the Room
        database = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "tin_db").build();
    }

    //init the Room
    public static AppDatabase getDatabase() {
        return database;
    }

}


