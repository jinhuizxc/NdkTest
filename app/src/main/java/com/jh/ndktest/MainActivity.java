package com.jh.ndktest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jh.mylibrary.NdkString;

/**
 * ndk开发测试demo
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getFromC(View view) {
        Button button = (Button) view;
        button.setText(NdkString.getFromC());
    }
}
