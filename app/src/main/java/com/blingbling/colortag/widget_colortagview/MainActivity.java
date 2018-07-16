package com.blingbling.colortag.widget_colortagview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    ColorTagView tagView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tagView = findViewById(R.id.tagView);
    }

    public void click1(View view) {
        tagView.setEnabled(!tagView.isEnabled());
    }

    int[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.CYAN, Color.BLACK,};

    int id = 0;

    public void click2(View view) {
        tagView.setTagColor(colors[id]);
        id++;
        if (id >= colors.length) {
            id = 0;
        }
    }
}
