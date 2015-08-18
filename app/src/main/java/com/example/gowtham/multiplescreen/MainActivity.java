package com.example.gowtham.multiplescreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements MenuFragment.Personselected {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void selectedcandidate(String candidatename) {
        DetailsFragment detailsFragment = (DetailsFragment) getFragmentManager().findFragmentById(R.id.detail_frgment);
        if (detailsFragment == null) {
            Intent intent = new Intent(this, Detailsactivity.class);
            intent.putExtra("Username", candidatename);
            startActivity(intent);
        } else {
            detailsFragment.copyname(candidatename);
        }

    }
}
