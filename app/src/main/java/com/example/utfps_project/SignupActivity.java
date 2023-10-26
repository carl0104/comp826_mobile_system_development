package com.example.utfps_project;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        Button btn_left_arrow1 = findViewById(R.id.btn_left_arrow1);
        btn_left_arrow1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent intent = new Intent(SignupActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });

        EditText et_email1 = findViewById(R.id.et_email1);
        EditText et_password1 = findViewById(R.id.et_password1);
        Button btn_signup1 = findViewById(R.id.btn_signup1);
        btn_signup1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                String input_email = et_email1.getText().toString();
                String input_password = et_password1.getText().toString();
                if (input_email.equals("abc@gmail.com") && input_password.equals("123456")) {
                    Toast.makeText(SignupActivity.this, "Registration successful.", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(SignupActivity.this, MainActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(SignupActivity.this, "Please enter the correct email address and password.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
