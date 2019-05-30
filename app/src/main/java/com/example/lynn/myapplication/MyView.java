package com.example.lynn.myapplication;

import android.content.Context;
import android.widget.Button;
import android.widget.LinearLayout;

public class MyView extends LinearLayout {

    public MyView(Context context) {
        super(context);

        Button button = new Button(context);

        button.setText("Hello");

        addView(button);
    }

}
