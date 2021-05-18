package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextInputEditText email;
    TextInputEditText password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);

        // on button click
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                // check if email is empty

//                if (userEmail.isEmpty()) {
//                    Toast.makeText(MainActivity.this, "Please Enter a email", Toast.LENGTH_SHORT).show();
//                }
//
//                // check if password is less than 8 character

//                if (userPassword.length() < 8) {
//                    Toast.makeText(MainActivity.this, "Password must contain at least 8 characters", Toast.LENGTH_SHORT).show();
//                }

                // login to another screen


                // combining all three
                String userEmail = email.getText().toString();
                String userPassword = password.getText().toString();

                if (userEmail.isEmpty() || userPassword.length() < 8) {
                    Toast.makeText(MainActivity.this, "Email must be defined and Password must be 8 characters long", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(MainActivity.this, WelcomeAcitivity.class);
                    intent.putExtra("email", userEmail);
                    intent.putExtra("password", userPassword);
                    startActivity(intent);
                }
            }
        });
    }
}