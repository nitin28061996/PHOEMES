package com.example.nitin.telephony;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

public class login extends AppCompatActivity {
    LoginButton lb;
    CallbackManager cbm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());
        cbm=CallbackManager.Factory.create();
        setContentView(R.layout.activity_login);
        lb=(LoginButton)findViewById(R.id.fb_login_bn);
        lb.registerCallback(cbm, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                startActivity(new Intent(login.this,HomeAcitivty2.class));

            }

            @Override
            public void onCancel() {
                Toast.makeText(getApplicationContext(),"Login Cancel",Toast.LENGTH_LONG).show();

            }

            @Override
            public void onError(FacebookException error) {

            }
        });





    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        cbm.onActivityResult(requestCode,resultCode,data);
    }
}
