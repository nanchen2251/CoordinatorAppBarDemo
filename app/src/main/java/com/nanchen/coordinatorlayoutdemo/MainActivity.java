package com.nanchen.coordinatorlayoutdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClick1(View view) {
        startActivity(new Intent(this,CoordinatorActivity.class));
    }

    public void btnClick2(View view) {
        startActivity(new Intent(this,CoorAppBarActivity.class));
    }

    public void btnClick3(View view) {
        startActivity(new Intent(this,CoorToolBarActivity.class));
    }
}
