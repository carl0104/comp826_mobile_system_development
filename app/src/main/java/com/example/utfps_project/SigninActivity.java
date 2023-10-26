package com.example.utfps_project;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SigninActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);


        Button btn_left_arrow = findViewById(R.id.btn_left_arrow);
        btn_left_arrow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent intent = new Intent(SigninActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });


        EditText et_email = findViewById(R.id.et_email);
        EditText et_password = findViewById(R.id.et_password);
        Button btn_signin1 = findViewById(R.id.btn_signin1);
        btn_signin1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String input_email = et_email.getText().toString();
                String input_password = et_password.getText().toString();
                if (input_email.equals("abc@gmail.com") && input_password.equals("123456")) {
                    Toast.makeText(SigninActivity.this, "Sign in successful.", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(SigninActivity.this, ProfileActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(SigninActivity.this, "Please enter the correct email address and password.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
