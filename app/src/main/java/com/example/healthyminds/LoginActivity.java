package com.example.healthyminds;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.healthyminds.databinding.ActivityLoginBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {

    ActivityLoginBinding binding;
    FirebaseAuth firebaseAuth;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        progressDialog = new ProgressDialog(LoginActivity.this);
        progressDialog.setTitle("Authenticating User");
        progressDialog.setMessage("Authenticating the registered User");

        firebaseAuth = FirebaseAuth.getInstance();

        getSupportActionBar().hide();
        binding.btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(binding.etEmail.getText().toString().equals("") || binding.etLoginPassword.getText().toString().equals("")){
                    Toast.makeText(LoginActivity.this, "Please Fill the form", Toast.LENGTH_SHORT).show();
                }
                else{
                    progressDialog.show();

                    firebaseAuth.signInWithEmailAndPassword(binding.etEmail.getText().toString(),binding.etLoginPassword.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            progressDialog.dismiss();

                            if(task.isSuccessful()){
                                Intent intent = new Intent(getApplicationContext(),HomeActivity.class);
                                startActivity(intent);
                                Toast.makeText(LoginActivity.this, " Login Successful", Toast.LENGTH_SHORT).show();
                            }

                            else {
                                Toast.makeText(LoginActivity.this,task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            }

                        }
                    });

                }





            }
        });


    }
}