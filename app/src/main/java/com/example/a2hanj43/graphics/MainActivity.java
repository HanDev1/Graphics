package com.example.a2hanj43.graphics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        GraphicsView gv;

        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_graphics_view);
        gv = new GraphicsView(this);
        setContentView(gv);


    }
}
