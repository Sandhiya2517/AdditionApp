package com.example.additionapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText num1 = findViewById(R.id.num1);
        EditText num2 = findViewById(R.id.num2);
        TextView result = findViewById(R.id.result);
        Button btnAdd = findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(v -> {
            String a = num1.getText().toString();
            String b = num2.getText().toString();

            if (!a.isEmpty() && !b.isEmpty()) {
                double n1 = Double.parseDouble(a);
                double n2 = Double.parseDouble(b);

                double sum = n1 + n2;

                result.setText(String.valueOf(sum));
            } else {
                result.setText(R.string.error_enter_both_numbers);
            }
        });
    }
}
