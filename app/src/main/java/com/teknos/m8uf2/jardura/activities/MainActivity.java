package com.teknos.m8uf2.jardura.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.teknos.m8uf2.jardura.R;

public class MainActivity extends AppCompatActivity {

    // Widgets
    Button loginBtn, createAccountBtn;
    private EditText emailEt, passEt;

    // Firebase Auth
    private FirebaseAuth firebaseAuth;
    private FirebaseAuth.AuthStateListener authStateListener;
    private FirebaseUser currentUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createAccountBtn = findViewById(R.id.create_account);
        createAccountBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(i);
            }
        });

        // Login
        loginBtn = findViewById(R.id.email_signin);
        emailEt = findViewById(R.id.email);
        passEt = findViewById(R.id.password);

        // Firebase Authentication
        firebaseAuth = FirebaseAuth.getInstance();

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logEmailPassUser(
                        emailEt.getText().toString().trim(),
                        passEt.getText().toString().trim()
                );
            }
        });

    }

    private void logEmailPassUser(String email, String pwd) {
        // Checking for empty texts
        if(!TextUtils.isEmpty(email)
                && !TextUtils.isEmpty(pwd)
        ){
            firebaseAuth.signInWithEmailAndPassword(
                    email,
                    pwd
            ).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                @Override
                public void onSuccess(AuthResult authResult) {
                    FirebaseUser user = firebaseAuth.getCurrentUser();

                    Intent i = new Intent(MainActivity.this, MedsListActivity.class);
                    startActivity(i);
                }
            });
        }
    }
}