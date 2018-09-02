package com.laioffer.tinnews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.laioffer.tinnews.common.TinBasicActivity;

public class MainActivity extends TinBasicActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //add click listener here
    }


    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void showSnackBar(String message) {

    }
}
