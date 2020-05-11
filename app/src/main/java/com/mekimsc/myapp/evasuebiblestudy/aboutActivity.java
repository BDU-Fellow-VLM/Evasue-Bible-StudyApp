package com.mekimsc.myapp.evasuebiblestudy;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;


public class aboutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        TextView textView=findViewById(R.id.youtubeid);
        textView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view)
            {
                Intent browser= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCbnR6qFRgmTCKYYcxYIAP2A"));
                startActivity(browser);
            }

        });

        TextView textView1=findViewById(R.id.fb_url);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browser= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/BDU-Fellowship-VLM-180332802610812"));
                startActivity(browser);
            }
        });
    }


}
