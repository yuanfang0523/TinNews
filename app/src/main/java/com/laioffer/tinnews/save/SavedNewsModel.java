package com.laioffer.tinnews.save;

import android.annotation.SuppressLint;

import com.laioffer.tinnews.TinApplication;
import com.laioffer.tinnews.database.AppDatabase;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class SavedNewsModel implements SavedNewsContract.Model {

    private final AppDatabase db;

    SavedNewsModel() {
        db = TinApplication.getDatabase();
    }

    private SavedNewsContract.Presenter presenter;

    @Override
    public void setPresenter(SavedNewsContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @SuppressLint("CheckResult")
    @Override
    public void fetchData() {
        db.newsDao().getAll().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(presenter::loadSavedNews, error -> {
                    System.out.print("error");
                }, () -> {
                    System.out.println("complete");
                });
    }
}
