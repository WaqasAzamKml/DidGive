package com.example.approsoft.didgive;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Approsoft on 2/20/2017.
 */

public class DonatedDonateSc10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.donated_donate_sc10);


        Button donateStuff2nd = (Button) findViewById(R.id.btndonatestuffallitems);
        donateStuff2nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(DonatedDonateSc10.this, ClickedItemSc11.class);
                startActivity(myIntent);
            }
        });
    }
}