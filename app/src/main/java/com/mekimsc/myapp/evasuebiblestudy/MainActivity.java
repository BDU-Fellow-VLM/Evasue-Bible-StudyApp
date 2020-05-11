package com.mekimsc.myapp.evasuebiblestudy;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import com.mekimsc.myapp.evasuebiblestudy.Adapter.simpleAdapter;

import java.util.Objects;


public class MainActivity extends AppCompatActivity  implements simpleAdapter.myClickListener{
RecyclerView recyclerView;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        runAnimation(recyclerView,0);


        android.support.v7.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    private void runAnimation(RecyclerView recyclerView, int i) {
        Context context=recyclerView.getContext();
        LayoutAnimationController controller=null;

        if(i==0)
            controller=AnimationUtils.loadLayoutAnimation(context,R.anim.layout_fall_down);
        simpleAdapter adapter=new simpleAdapter(this);
        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutAnimation(controller);
        Objects.requireNonNull(recyclerView.getAdapter()).notifyDataSetChanged();
        recyclerView.scheduleLayoutAnimation();
    }

    @Override
    public void onClickListener(int position) {
        switch (position) {
            case 0:
                Intent intent1 = new Intent(MainActivity.this, study1Activity.class);
                startActivity(intent1);
                break;
            case 1:
                Intent intent2 = new Intent(MainActivity.this, study2Activity.class);
                startActivity(intent2);
                break;
            case 2:
                Intent intent3 = new Intent(MainActivity.this, study3Activity.class);
                startActivity(intent3);
                break;
            case 3:
                Intent intent4 = new Intent(MainActivity.this, study4Activity.class);
                startActivity(intent4);
                break;
            case 4:
                Intent intent5 = new Intent(MainActivity.this, study5Activity.class);
                startActivity(intent5);
                break;
            case 5:
                Intent intent6 = new Intent(MainActivity.this, study6Activity.class);
                startActivity(intent6);
                break;
            case 6:
                Intent intent7 = new Intent(MainActivity.this, study7Activity.class);
                startActivity(intent7);
                break;
            case 7:
                Intent intent8 = new Intent(MainActivity.this, study8Activity.class);
                startActivity(intent8);
                break;
            case 8:
                Intent intent9 = new Intent(MainActivity.this, study9Activity.class);
                startActivity(intent9);
                break;
            case 9:
                Intent intent10 = new Intent(MainActivity.this, study10Activity.class);
                startActivity(intent10);
                //overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                break;
            case 10:
                Intent intent11= new Intent(MainActivity.this,study11Activity.class);
                startActivity(intent11);
                break;
            case 11:
                Intent intent12= new Intent(MainActivity.this,study12Activity.class);
                startActivity(intent12);
                break;
            case 12:
                Intent intent13= new Intent(MainActivity.this,study13Activity.class);
                startActivity(intent13);
                break;
            case 13:
                Intent intent14= new Intent(MainActivity.this,study14Activity.class);
                startActivity(intent14);
                break;
            case 14:
                Intent intent15= new Intent(MainActivity.this,study15Activity.class);
                startActivity(intent15);
                break;

        }
    }

    @SuppressLint("RestrictedApi")
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.toolbarmenu,menu);
        if(menu instanceof MenuBuilder){
            MenuBuilder menuBuilder=(MenuBuilder)menu;
            menuBuilder.setOptionalIconsVisible(true);
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
               switch (item.getItemId()){
                   case R.id.settings:
                       Intent intent1=new Intent(MainActivity.this,settingActivity.class);
                       startActivity(intent1);
                       break;
                   case R.id.about:
                       Intent intent2=new Intent(MainActivity.this,aboutActivity.class);
                       startActivity(intent2);
                       break;
                   case R.id.prefaceid:
                       Intent intent3=new Intent(MainActivity.this,prefaceActivity.class);
                       startActivity(intent3);
                       break;
               }
               return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

}
