package com.example.nitin.telephony;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.facebook.AccessToken;
import com.facebook.login.LoginManager;

public class HomeAcitivty2 extends AppCompatActivity {
    private static final int MY_PERMISSIONS_REQUEST_READ_CONTACTS = 10;
    private SparseIntArray mErrorString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_acitivty2);



    }



    public void call(View view) {
        Intent intent=new Intent(HomeAcitivty2.this,CALL.class);
        intent.putExtra("xxx"," ");
        startActivity(intent);
    }


    public void message(View view) {
        startActivity(new Intent(HomeAcitivty2.this,MESSAGE.class));
    }

    public void email(View view) {
        startActivity(new Intent(HomeAcitivty2.this,EMAIL.class));

    }
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if(keyCode == KeyEvent.KEYCODE_BACK)
        {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            return true;
        }
        return false;
    }

    public void contacts(View view) {
        startActivity(new Intent(HomeAcitivty2.this,CONTACTS.class));
    }

    public void whatsapp(View view) {
        Intent e=new Intent(HomeAcitivty2.this,WHATSAPP.class);
            startActivity(e);
    }

    public void socialtv(View view) {
        Intent e=new Intent(HomeAcitivty2.this,SOCIALTV.class);
        startActivity(e);

    }

    public void googlesearch(View view) {
        Intent e=new Intent(HomeAcitivty2.this,googlesearch.class);
        startActivity(e);
    }

    public void login(View view) {
        AccessToken A=AccessToken.getCurrentAccessToken();
        if(A!=null)
        {
            LoginManager.getInstance().logOut();
        }



    }
}