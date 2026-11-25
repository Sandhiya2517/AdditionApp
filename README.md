# Addition of Two Numbers – Android Application

## Aim
To develop an Android application using Android Studio and Java that accepts two numbers from the user, performs addition, and displays the summation value in a TextView.

## Algorithm
1. Start the application.
2. Initialize the user interface using `activity_main.xml`.
3. Get the first number and second number from the user using EditText fields.
4. Initialize the ADD button and result TextView using `findViewById()`.
5. Set an `OnClickListener` for the ADD button.
6. Read the two input values as strings.
7. Check whether both input fields are empty or not.
8. If both fields contain values, convert the strings into double values using `Double.parseDouble()`.
9. Add the two numbers using the `+` operator.
10. Display the sum in the result TextView using `setText()`.
11. If either input field is empty, display an error message.
12. Stop.

##  MainActivity.java
```
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
```
## activity_main.xml
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:gravity="center"
    android:padding="20dp"
    tools:context=".MainActivity">

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="@string/addition_title"
        android:textSize="24sp"
        android:textStyle="bold"
        android:gravity="center"
        android:layout_marginBottom="30dp"/>

    <EditText
        android:id="@+id/num1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="@string/hint_enter_first_number"
        android:inputType="numberDecimal"
        tools:ignore="Autofill"/>

    <EditText
        android:id="@+id/num2"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="@string/hint_enter_second_number"
        android:inputType="numberDecimal"
        tools:ignore="Autofill"/>

    <Button
        android:id="@+id/btnAdd"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="@string/btn_add"/>

    <TextView
        android:id="@+id/result"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="@string/hint_result"
        android:textSize="20sp"
        android:textStyle="bold"
        android:gravity="center"
        android:layout_marginTop="20dp"/>
</LinearLayout>
```

## Output
<img width="1920" height="1200" alt="Screenshot 2026-11-25 142251" src="https://github.com/user-attachments/assets/f6940302-f984-4104-8b08-a02241909c25" />
<img width="1920" height="1200" alt="Screenshot 2026-11-25 142334" src="https://github.com/user-attachments/assets/0642fb7e-7f84-485a-9ca5-eb4a55f254fb" />
<img width="1920" height="1200" alt="Screenshot 2026-11-25 142351" src="https://github.com/user-attachments/assets/5884b8cd-bf50-4fb1-9613-aafed83f054c" />


## Result
Thus, the Addition of Two Numbers Android application was successfully developed using Java and XML in Android Studio. The application accepts two numbers, calculates their sum, and displays the result in the TextView.
