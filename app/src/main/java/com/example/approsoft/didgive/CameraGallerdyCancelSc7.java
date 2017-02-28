package com.example.approsoft.didgive;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Approsoft on 2/20/2017.
 */

public class CameraGallerdyCancelSc7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.camera_gallery_cancel_sc7);

        Button btnGallery = (Button) findViewById(R.id.btngallery);
        btnGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(CameraGallerdyCancelSc7.this, RetakePostSc8.class);
                startActivity(myIntent);
            }
        });

        Button btnCancel = (Button) findViewById(R.id.btncancel);
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(CameraGallerdyCancelSc7.this, CaptionDescriptionSc6.class);
                startActivity(myIntent);
            }
        });
        

    }
}