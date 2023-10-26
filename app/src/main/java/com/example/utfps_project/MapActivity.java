package com.example.utfps_project;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class MapActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        Button btn_toprofile = findViewById(R.id.btn_toprofile);
        btn_toprofile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent intent = new Intent(MapActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });

        EditText et_search = findViewById(R.id.et_search);
        Button btn_search = findViewById(R.id.btn_search);
        btn_search.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                String input_location = et_search.getText().toString();
                if (input_location.equals("AUT")) {
                    Intent intent = new Intent(MapActivity.this, FunctionActivity.class);
                    startActivity(intent);
                }
            }

        });
    }
}
