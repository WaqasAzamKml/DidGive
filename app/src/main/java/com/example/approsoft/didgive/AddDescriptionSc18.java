package com.example.approsoft.didgive;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Approsoft on 2/21/2017.
 */

public class AddDescriptionSc18 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_description_sc18);

        Button btnAddDes = (Button) findViewById(R.id.btndescpost);
        btnAddDes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(AddDescriptionSc18.this, HomeItemSelectedSc19.class);
                startActivity(myIntent);
            }
        });
    }
}