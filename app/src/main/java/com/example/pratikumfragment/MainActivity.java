package com.example.pratikumfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.pratikumfragment.activies.DynamicActivity;
import com.example.pratikumfragment.activies.StaticActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handlepratikumfragment(View view) {
    }

    public void handleDynamicFragment(View view) {
        Intent inten = new Intent(this, DynamicActivity.class);
        startActivity(inten);
    }

    public void handlerStaticFragment(View view) {
        Intent intent = new Intent(this, StaticActivity.class);
        startActivity(intent);

    }
}
