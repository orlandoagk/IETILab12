package edu.eci.ieti.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.R;
import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
    }
    public void onLogin(View view) {
        EditText email = findViewById(R.id.editTextTextPersonName);
        EditText password = findViewById(R.id.editTextTextPassword);
        if (email.getText().toString().isEmpty()) {
            email.setError("The email cant be empty");
        }
        if (email.getText().toString().isEmpty()) {
            password.setError("The password cant be empty");
        }
    }
}
