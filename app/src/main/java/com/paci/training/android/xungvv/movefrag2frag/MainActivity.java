package com.paci.training.android.xungvv.movefrag2frag;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FruitFragment fruitFragment = new FruitFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fruit_fragment_container, fruitFragment)
                .addToBackStack(null)
                .commit();
    }
}