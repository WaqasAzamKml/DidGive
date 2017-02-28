package com.example.approsoft.didgive;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Approsoft on 2/20/2017.
 */

public class CaptionDescriptionSc6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.caption_description_sc6);

        Button getPic = (Button) findViewById(R.id.btngetpic);
        getPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(CaptionDescriptionSc6.this, CameraGallerdyCancelSc7.class);
                startActivity(myIntent);
            }
        });

    }
}