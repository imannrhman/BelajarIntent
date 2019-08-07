package com.belajar.belajarintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button explicitIntent;
    Button implicitIntent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        explicitIntent = (Button) findViewById(R.id.explicit_intent);
        explicitIntent.setOnClickListener(this);
        implicitIntent = (Button) findViewById(R.id.implicit_intent);
        implicitIntent.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.explicit_intent:
                Intent explicit = new Intent(MainActivity.this, IntentActivity.class);
                startActivity(explicit);
                break;
            case R.id.implicit_intent:
                Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://classroom.google.com/u/0/c/NDA3MzgyMDk5NjRa"));
                startActivity(implicit);
                break;
             default:
                 break;
        }
    }
}
