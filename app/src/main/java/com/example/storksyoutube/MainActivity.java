package com.example.storksyoutube;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.getWindow().getDecorView().setSystemUiVisibility(

                View.SYSTEM_UI_FLAG_LAYOUT_STABLE

                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION

                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN

                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION

                        | View.SYSTEM_UI_FLAG_FULLSCREEN);


        WebView webView = findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        //webView.loadUrl("https://www.youtube.com/watch?v=5kZ5X36_p3o"); кормушка
        //https://www.youtube.com/watch?v=nEP4FPfdMQo гнездо аиста
        webView.loadUrl("https://www.youtube.com/watch?v=nEP4FPfdMQo");
        WebViewClient webViewClient = new WebViewClient() {

            @SuppressWarnings("deprecation") @Override

            public boolean shouldOverrideUrlLoading(WebView view, String url) {

                view.loadUrl(url);

                return true;

            }



            @TargetApi(Build.VERSION_CODES.N) @Override

            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {

                view.loadUrl(request.getUrl().toString());

                return true;

            }

        };
        webView.setWebViewClient(webViewClient);
    }
}