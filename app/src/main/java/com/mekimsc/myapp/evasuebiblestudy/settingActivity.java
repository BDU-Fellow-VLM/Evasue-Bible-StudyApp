package com.mekimsc.myapp.evasuebiblestudy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class settingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_back));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                home_mth();
            }
        });

        CheckBox checkBox = findViewById(R.id.keep_screen_on_checkbox);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
                    Toast.makeText(getBaseContext(), "Screen on Activated", Toast.LENGTH_SHORT).show();
                } else {
                    getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
                }
            }
        });

        final CheckBox checkBox1 = findViewById(R.id.nightmode_checkbox);
        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                   getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                } else {

                    getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                }
            }
        });

        Button disp_btn=findViewById(R.id.displayBtn);
        disp_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction("com.android.settings.DISPLAY_SETTINGS");
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

        Button share_btn=findViewById(R.id.sharebtn);
        share_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String share_body = "በጌታ ወንድሜ/እህቴ በዚህ አፕልኬሽን ከታነጽክበት/ሽበት አንተም/ቺም ለሌሎች አጋራ። ጌታ ይባርክህ/ሽ";
                intent.putExtra(Intent.EXTRA_SUBJECT, share_body);
                startActivity(Intent.createChooser(intent, "share type"));
            }
        });

    }

    public void home_mth() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}

