package com.example.approsoft.didgive;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Approsoft on 2/21/2017.
 */

public class AddetailPostSc17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addetail_post_sc17);

        Button btnAddDetail = (Button) findViewById(R.id.btnadddetails);
        btnAddDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(AddetailPostSc17.this, AddDescriptionSc18.class);
                startActivity(myIntent);
            }
        });
    }
}