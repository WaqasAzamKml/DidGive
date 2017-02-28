package com.example.approsoft.didgive;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Approsoft on 2/21/2017.
 */

public class HomeItemSelectedSc19 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_item_selected_sc19);

        Button btnHomeSelect = (Button) findViewById(R.id.btnchatfromselect);
        btnHomeSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(HomeItemSelectedSc19.this, ChatWithHomeiSc20.class);
                startActivity(myIntent);
            }
        });
    }
}