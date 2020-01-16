package com.example.hellokitty;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView mHelloTextView;
    private EditText mNameEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHelloTextView = findViewById(R.id.textView);
        mNameEditText = findViewById(R.id.editText);

    }

    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
        if (mNameEditText.getText().length() == 0) {
            mHelloTextView.setText("Hello Kitty!");
        } else {
            mHelloTextView.setText("Привет, " + mNameEditText.getText());
        }

    }

    public void onClick1(View view) {
        Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
        startActivity(intent);
    }
}
