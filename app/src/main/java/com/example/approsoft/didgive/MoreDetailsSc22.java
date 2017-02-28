package com.example.approsoft.didgive;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Approsoft on 2/21/2017.
 */

public class MoreDetailsSc22 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.more_details_sc22);

        Button otry2 = (Button) findViewById(R.id.btnmyprofile);
        otry2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MoreDetailsSc22.this, MyProfileSc24.class);
                startActivity(myIntent);
            }
        });

        Button btntoChatDet = (Button) findViewById(R.id.btncategomoredet);
        btntoChatDet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MoreDetailsSc22.this, CategoriesSc13.class);
                startActivity(myIntent);
            }
        });

        Button btnGetStufto5 = (Button) findViewById(R.id.btngetmoredet);
        btnGetStufto5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MoreDetailsSc22.this, RequestAllCategoriesSc5.class);
                startActivity(myIntent);
            }
        });

        Button btnChat22 = (Button) findViewById(R.id.btnchatmoredet);
        btnChat22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MoreDetailsSc22.this, ChatDetailsSc23.class);
                startActivity(myIntent);
            }
        });

    }
}