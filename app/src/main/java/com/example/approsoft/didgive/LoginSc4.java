package com.example.approsoft.didgive;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Approsoft on 2/20/2017.
 */

public class LoginSc4 extends AppCompatActivity {

    EditText et_email, et_password;
    String email, password;
    Button btnLogInB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_sc4);

        et_email = (EditText) findViewById(R.id.etEmailAddresslgin);
        et_password = (EditText) findViewById(R.id.etpasswordlgin);

        btnLogInB = (Button) findViewById(R.id.btnloginbotom);
        btnLogInB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email = et_email.getText().toString();
                password = et_password.getText().toString();

                String method = "login";
                BackgroundTask backgroundTask = new BackgroundTask(LoginSc4.this);
                backgroundTask.execute(method,email,password);
                finish();

                Intent myIntent = new Intent(LoginSc4.this, HomePageSc14.class);
                startActivity(myIntent);
            }
        });
    }
}