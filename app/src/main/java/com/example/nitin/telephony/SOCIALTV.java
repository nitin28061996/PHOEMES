package com.example.nitin.telephony;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ToggleButton;

public class SOCIALTV extends AppCompatActivity {
    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_socialtv);
        wv=(WebView)findViewById(R.id.webView);
        wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);

    }

    public void fb(View view) {
        wv.loadUrl("http://www.facebook.com");

    }

    public void twitter(View view) {
        wv.loadUrl("http://www.twitter.com");

    }

    public void google(View view) {
        wv.loadUrl("http://www.plus.google.com");

    }

    public void youtube(View view) {
        wv.loadUrl("http://m.youtube.in");


    }

    public void linkedin(View view) {
        wv.loadUrl("http://www.linkedin.com");

    }
}

