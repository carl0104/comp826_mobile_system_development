package com.example.utfps_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Button btn_left_arrow = findViewById(R.id.btn_left_arrow3);
        btn_left_arrow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent intent = new Intent(ProfileActivity.this, MapActivity.class);
                startActivity(intent);

            }
        });
    }

}
