package com.example.gowtham.multiplescreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by gowtham on 18-08-2015.
 */
public class Detailsactivity extends AppCompatActivity{

    String username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_fragment);
        Intent intent=getIntent();
        username=intent.getStringExtra("Username");
        DetailsFragment detailsFragment=(DetailsFragment)getFragmentManager().findFragmentById(R.id.detail_frgment);
        detailsFragment.copyname(username);
    }
}
