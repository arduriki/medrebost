package com.teknos.m8uf2.jardura.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.teknos.m8uf2.jardura.R;

public class SignUpActivity extends AppCompatActivity {

    // Widgets
    EditText passwordCreate, usernameCreate, emailCreate;
    Button createBtn;

    // Firebase Auth
    private FirebaseAuth firebaseAuth;
    private FirebaseAuth.AuthStateListener authStateListener;
    private FirebaseUser currentUser;

    // Firebase Connection
    private FirebaseFirestore db = FirebaseFirestore.getInstance();
    private CollectionReference collectionReference = db.collection("Users");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        createBtn = findViewById(R.id.acc_signUp_btn);
        passwordCreate = findViewById(R.id.password_create);
        emailCreate = findViewById(R.id.email_create);
        usernameCreate = findViewById(R.id.username_create_ET);

        // Firebase Auth
        firebaseAuth = FirebaseAuth.getInstance();
        authStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                currentUser = firebaseAuth.getCurrentUser();
                // check the user whether is logged in or not
                if (currentUser != null){
                    // logged in
                } else {
                    // signed out
                }
            }
        };

        createBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!TextUtils.isEmpty(emailCreate.getText().toString())
                && !TextUtils.isEmpty(usernameCreate.getText().toString())
                && !TextUtils.isEmpty(passwordCreate.getText().toString())) {

                    String email = emailCreate.getText().toString().trim();
                    String pass = passwordCreate.getText().toString().trim();
                    String username = usernameCreate.getText().toString().trim();

                    CreateUserEmailAccount(email, pass, username);
                } else {
                    Toast.makeText(SignUpActivity.this,
                            "No es pot deixar cap camp buit",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void CreateUserEmailAccount(
            String email,
            String pass,
            String username
    ){
        if (!TextUtils.isEmpty(email)
                && !TextUtils.isEmpty(pass)
                && !TextUtils.isEmpty(username)
        ) {
            firebaseAuth.createUserWithEmailAndPassword(
                    email, pass
            ).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()){
                        // The user is created successfully!
                        Toast.makeText(SignUpActivity.this, "El compte s'ha creat correctament", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }





}