package com.example.approsoft.didgive;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Approsoft on 2/21/2017.
 */

public class HomePageSc14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page_sc14);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        ImageView imagClicked = (ImageView) findViewById(R.id.ivclick);
        imagClicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(HomePageSc14.this, MoreDetailsSc22.class);
                startActivity(myIntent);
            }
        });

        ImageView imgfilters = (ImageView) findViewById(R.id.ivfilters);
        imgfilters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(HomePageSc14.this, ChangeLocationSc33.class);
                startActivity(myIntent);
            }
        });


        Button btnGetStufHome = (Button) findViewById(R.id.btngetstuffhome);
        btnGetStufHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(HomePageSc14.this, RequestAllCategoriesSc5.class);
                startActivity(myIntent);
            }
        });

        Button btnDonateStHome = (Button) findViewById(R.id.btndonatehome);
        btnDonateStHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(HomePageSc14.this, CameraGalleryCancelSc15.class);
                startActivity(myIntent);
            }
        });

    }
}