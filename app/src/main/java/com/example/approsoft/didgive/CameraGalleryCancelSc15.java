package com.example.approsoft.didgive;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Approsoft on 2/21/2017.
 */

public class CameraGalleryCancelSc15 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.camera_gallery_cancel_sc15);


        Button btnCancel2nd = (Button) findViewById(R.id.btncancel2nd);
        btnCancel2nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(CameraGalleryCancelSc15.this, HomePageSc14.class);
                startActivity(myIntent);
            }
        });

        Button btnGall2nd = (Button) findViewById(R.id.btngallery2nd);
        btnGall2nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(CameraGalleryCancelSc15.this, RetakeContinueSc16.class);
                startActivity(myIntent);
            }
        });

        Button btnCancel14 = (Button) findViewById(R.id.btncancel2nd);
        btnCancel14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(CameraGalleryCancelSc15.this, HomePageSc14.class);
                startActivity(myIntent);
            }
        });

    }
}