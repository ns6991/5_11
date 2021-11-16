package com.example.a5_11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class NextActivity extends AppCompatActivity {
    ConstraintLayout CL2;
    Intent gi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        CL2 = (ConstraintLayout)findViewById(R.id.CL2);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add(0,0,400,"Beige");
        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id == R.id.menupink)
            CL2.setBackgroundColor(Color.parseColor("#FD40C8"));
        else if(id == R.id.menuyellow)
            CL2.setBackgroundColor(Color.parseColor("#FFE717"));
        else if(id == R.id.menuorange)
            CL2.setBackgroundColor(Color.parseColor("#FFAE36"));
        else if(id == 0)
            CL2.setBackgroundColor(Color.parseColor("#EDBF7A"));

        return true;
    }



    public void returni(View view) {
        Intent gi = new Intent(this, MainActivity.class);
        startActivity(gi);
    }
}