package com.example.carbag;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();








    }

    private void init(){
        System.out.print("this is test");
    }


}
