package com.example.utfps_project;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
public class FunctionActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_function);

        Button btn_left_arrow3 = findViewById(R.id.btn_left_arrow3);
        btn_left_arrow3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent intent = new Intent(FunctionActivity.this, MapActivity.class);
                startActivity(intent);

            }
        });

    }


}
