package com.example.approsoft.didgive;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Approsoft on 2/20/2017.
 */

public class GetDonateLaterSc3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.get_donate_later_sc3);

        Button getStuff = (Button) findViewById(R.id.btngetstuff);
        getStuff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(GetDonateLaterSc3.this, RequestAllCategoriesSc5.class);
                startActivity(myIntent);
            }
        });

        Button donateStuff = (Button) findViewById(R.id.btndonatestuff);
        donateStuff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(GetDonateLaterSc3.this, CameraGalleryCancelSc15.class);
                startActivity(myIntent);
            }
        });

        Button mayBeLater = (Button) findViewById(R.id.btnmblater);
        mayBeLater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(GetDonateLaterSc3.this, HomePageSc14.class);
                startActivity(myIntent);
            }
        });

    }
}