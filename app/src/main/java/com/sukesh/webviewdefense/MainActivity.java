package com.sukesh.webviewdefense;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class MainActivity extends AppCompatActivity {

    private WebView webview;
    private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    @Override
    public void onBackPressed() {if (webview.canGoBack()){
        webview.goBack();

    }
        super.onBackPressed();

    }


    public void GoTo(View view) {

        webview = findViewById(R.id.webview);

        textview=findViewById(R.id.ulrtextbox);
        String url=textview.getText().toString();
        webview.setWebViewClient(new WebViewClient());
       // String decodedUrl = EncodeURL(url);
        if (!url.startsWith("https")){

            url="about:blank";
            Toast.makeText(this, "Please enter the URl that starts with https", Toast.LENGTH_LONG).show();
        }
        else{
            webview.loadUrl(url);


        }


    }

    public static String EncodeURL(String aURL){
        return aURL.replace("&", "&amp;");
    }

    public void GotoNextAcivity(View view){
        Button btn=findViewById(R.id.btnNext);
        startActivity(new Intent(this,ChecckBody.class));
    }



}



