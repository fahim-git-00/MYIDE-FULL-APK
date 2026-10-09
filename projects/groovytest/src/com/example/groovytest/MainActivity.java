package com.example.groovytest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String msg = GHello.greet();
        TextView tv = new TextView(this);
        tv.setText(msg);
        tv.setTextSize(20f);
        tv.setPadding(40, 40, 40, 40);
        setContentView(tv);
    }
}
