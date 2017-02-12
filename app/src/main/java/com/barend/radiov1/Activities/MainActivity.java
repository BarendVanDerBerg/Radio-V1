package com.barend.radiov1.Activities;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.barend.radiov1.Fragments.MainFragment;
import com.barend.radiov1.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        MainFragment mainFragment = (MainFragment) fm.findFragmentById(R.id.container_main);
         if(mainFragment == null){
             mainFragment = MainFragment.newInstance("Yo","Lo");
             fm.beginTransaction().add(R.id.container_main, mainFragment).commit();
         }
    }
}
