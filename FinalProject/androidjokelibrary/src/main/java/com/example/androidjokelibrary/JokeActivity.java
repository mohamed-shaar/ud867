package com.example.androidjokelibrary;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final String EXTRA_JOKE = "extra_joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        Intent intent = getIntent();


        TextView tv_joke = findViewById(R.id.tv_joke);
        if (intent.hasExtra(EXTRA_JOKE)){
            String joke  = intent.getStringExtra(EXTRA_JOKE);
            tv_joke.setText(joke);
        }
        else{
            tv_joke.setText(getString(R.string.joke_unavailable_message));
        }
    }
}
