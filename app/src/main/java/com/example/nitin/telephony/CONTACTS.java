package com.example.nitin.telephony;

import android.content.Intent;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class CONTACTS extends AppCompatActivity {
    String namecsv="";
    String phonecsv="";
    String namearray[];
    String phonearray[];
    ListView lv1;
    ArrayAdapter<String> adapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        lv1 = (ListView) findViewById(R.id.lv1);

        Cursor phones = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
        while (phones.moveToNext()) {
            String name = phones.getString(phones.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));
            String phonenumber = phones.getString(phones.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
            if (name != null) {
                namecsv += name + ",";
                phonecsv += phonenumber + ",";
            }

        }
        phones.close();
        namearray = namecsv.split(",");
        phonearray = phonecsv.split(",");
         adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, namearray);
        lv1.setAdapter(adapter);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                String msg = phonearray[arg2];

                Intent i=new Intent(CONTACTS.this,CALL.class);
                i.putExtra("phonenumber",phonearray[arg2]);
                startActivity(i);

            }
        });
    }






}



