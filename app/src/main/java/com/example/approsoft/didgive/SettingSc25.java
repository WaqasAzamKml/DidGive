package com.example.approsoft.didgive;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Approsoft on 2/21/2017.
 */

public class SettingSc25 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_sc25);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);




        Button btnPassto31 = (Button) findViewById(R.id.btnpasspset);
        btnPassto31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(SettingSc25.this, ChangePasswordSc31.class);
                startActivity(myIntent);
            }
        });

        Button btntoChangLoc = (Button) findViewById(R.id.btnlocationprofileset);
        btntoChangLoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(SettingSc25.this, LocationSc29.class);
                startActivity(myIntent);
            }
        });

        Button btntoCam26 = (Button) findViewById(R.id.btnphotosett);
        btntoCam26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(SettingSc25.this, CameraGalleryCancelSc26.class);
                startActivity(myIntent);
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                //Write your logic here
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);

    }

}