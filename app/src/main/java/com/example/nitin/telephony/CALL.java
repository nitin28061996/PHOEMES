package com.example.nitin.telephony;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.EditText;

public class CALL extends AppCompatActivity {
EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((int) (width * .8), (int) (height * .8));
        et1=(EditText)findViewById(R.id.editText4);
        et1.setText(getIntent().getExtras().getString("phonenumber"));

    }

    public void call(View view) {
            Intent i=new Intent();
            i.setAction(Intent.ACTION_CALL);
            i.setData(Uri.parse("tel:"+et1.getText().toString()));
            startActivity(i);
        }
    }


