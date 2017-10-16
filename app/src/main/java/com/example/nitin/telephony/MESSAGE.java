package com.example.nitin.telephony;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.EditText;

public class MESSAGE extends AppCompatActivity {
    EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((int) (width * .8), (int) (height * .8));
        et1=(EditText) findViewById(R.id.editText4);
        et2= (EditText) findViewById(R.id.editText5);
    }

    public void message(View view) {
        Intent sendIntent=new Intent(Intent.ACTION_VIEW);
        sendIntent.setData(Uri.parse("smsto:"));
        sendIntent.putExtra("address",et1.getText().toString());
        sendIntent.putExtra("sms_body",et2.getText().toString());
        sendIntent.setType("vnd.android-dir/mms-sms");
        startActivity(sendIntent);
    }
}
