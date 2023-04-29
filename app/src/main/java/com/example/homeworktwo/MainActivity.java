package com.example.homeworktwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Bio;
    Button Add;
    TextView Label;
    EditText Hobbies;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bio = findViewById(R.id.bio);
        Add = findViewById(R.id.add);
        Label = findViewById(R.id.label);
        Hobbies = findViewById(R.id.hobby);
        Bio.setMovementMethod(new ScrollingMovementMethod());
    }

    public void OnAdd(View view) {
        String temp =Hobbies.getText().toString();
        Label.setVisibility(View.VISIBLE);
        Label.setText(temp);
    }
}