package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private WebView webView;
    private String url = "https://lmsh.github.io/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webview);

       loadWebView();

    }

    private void loadWebView() {
        final WebSettings ajustesVisorWeb = webView.getSettings();
        ((WebSettings) ajustesVisorWeb).setJavaScriptEnabled(true);

        webView.loadUrl(url);
    }
}
