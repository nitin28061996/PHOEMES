package com.example.nitin.telephony;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.EditText;

public class EMAIL extends AppCompatActivity {
    EditText et3, et4, et5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((int) (width * .8), (int) (height * .8));
        et3 = (EditText) findViewById(R.id.editText3);
        et4 = (EditText) findViewById(R.id.editText6);
        et5 = (EditText) findViewById(R.id.editText2);
    }

    public void email(View view) {
        Intent i1 = new Intent();
        i1.setAction(Intent.ACTION_SEND);
        i1.putExtra(Intent.EXTRA_EMAIL, new String[]{et3.getText().toString()});
        i1.putExtra(Intent.EXTRA_SUBJECT, et4.getText().toString());
        i1.setType("message/rfc822");
        i1.putExtra(Intent.EXTRA_TEXT, et5.getText().toString());
        startActivity(Intent.createChooser(i1, "Select any Email Client"));
    }
}
