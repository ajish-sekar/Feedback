package com.example.ajish.feedback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    TextView name;
    TextView number;
    TextView email;
    TextView feedback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent intent = getIntent();

        name = findViewById(R.id.name_val);
        name.setText(intent.getStringExtra("name"));

        number = findViewById(R.id.num_val);
        number.setText(intent.getStringExtra("number"));

        email = findViewById(R.id.email_val);
        email.setText(intent.getStringExtra("email"));

        feedback = findViewById(R.id.feedback_val);
        feedback.setText(intent.getStringExtra("feedback"));
    }
}
