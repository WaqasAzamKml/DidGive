package com.example.approsoft.didgive;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Approsoft on 2/20/2017.
 */

public class SignupSc2 extends AppCompatActivity {

    EditText et_mail, et_password , et_name;
    String email, password, name;
    Button btnSignup, btnlogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_sc2);

        et_mail = (EditText) findViewById(R.id.etEmailAddress);
        et_password = (EditText) findViewById(R.id.etpassword);
        et_name = (EditText) findViewById(R.id.etname);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        btnSignup = (Button) findViewById(R.id.btnsignbotom);
        btnlogin = (Button) findViewById(R.id.btnlogin);
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email = et_mail.getText().toString();
                password = et_password.getText().toString();
                name = et_name.getText().toString();
                String method = "register";
                BackgroundTask backgroundTask = new BackgroundTask(SignupSc2.this);
                backgroundTask.execute(method,email,password,name);
                finish();

                Intent myIntent = new Intent(SignupSc2.this, GetDonateLaterSc3.class);
                startActivity(myIntent);
            }
        });

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(SignupSc2.this, LoginSc4.class);
                startActivity(myIntent);
            }
        });
    }


}
