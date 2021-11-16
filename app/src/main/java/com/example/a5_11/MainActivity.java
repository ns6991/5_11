package com.example.a5_11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout CL;
    Intent gi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CL = (ConstraintLayout)findViewById(R.id.CL);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id == R.id.menupink)
            CL.setBackgroundColor(Color.parseColor("#FD40C8"));
        else if(id == R.id.menuyellow)
            CL.setBackgroundColor(Color.parseColor("#FFE717"));
        else if(id == R.id.menuorange)
            CL.setBackgroundColor(Color.parseColor("#FFAE36"));
        return true;
    }

    public void next(View view) {
        Intent si = new Intent(this, NextActivity.class);
        startActivity(si);
    }
}