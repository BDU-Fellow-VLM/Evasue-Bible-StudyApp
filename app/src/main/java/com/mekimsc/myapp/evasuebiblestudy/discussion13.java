package com.mekimsc.myapp.evasuebiblestudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class discussion13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discussion13);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
    }
}
