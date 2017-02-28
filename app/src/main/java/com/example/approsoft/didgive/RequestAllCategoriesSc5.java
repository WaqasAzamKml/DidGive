package com.example.approsoft.didgive;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Approsoft on 2/20/2017.
 */

public class RequestAllCategoriesSc5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.request_all_categories_sc5);

        Button btnMakeReq = (Button) findViewById(R.id.btnmakereq);
        btnMakeReq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(RequestAllCategoriesSc5.this, CaptionDescriptionSc6.class);
                startActivity(myIntent);
            }
        });

        Button btnAllItems = (Button) findViewById(R.id.btnseeallitems);
        btnAllItems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(RequestAllCategoriesSc5.this, DonatedDonateSc10.class);
                startActivity(myIntent);
            }
        });

        Button btnCatgoryfromStuff = (Button) findViewById(R.id.btncategories);
        btnCatgoryfromStuff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(RequestAllCategoriesSc5.this, CategoriesSc13.class);
                startActivity(myIntent);
            }
        });
    }
}
