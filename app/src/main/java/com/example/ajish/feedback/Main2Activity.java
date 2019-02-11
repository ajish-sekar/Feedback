package com.example.ajish.feedback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    EditText name;
    EditText number;
    EditText email;
    EditText feedback;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name = findViewById(R.id.name);
        number = findViewById(R.id.number);
        email = findViewById(R.id.email);
        feedback = findViewById(R.id.feedback);
        submit = findViewById(R.id.submit_feedback);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name_val = name.getText().toString();
                String no = number.getText().toString();
                String email_val = email.getText().toString();
                String feedback_val = feedback.getText().toString();

                if (name_val.equals("") || no.equals("") || email_val.equals("") || feedback_val.equals("")){
                    Toast.makeText(getApplicationContext(),"Do not leave any field empty",Toast.LENGTH_SHORT).show();
                    return;
                }

                Intent intent = new Intent(Main2Activity.this,Main3Activity.class);
                intent.putExtra("name",name_val);
                intent.putExtra("number",no);
                intent.putExtra("email",email_val);
                intent.putExtra("feedback",feedback_val);

                startActivity(intent);
            }
        });

    }
}
