package com.example.utspm191103522ricopriago;

import android.content.Intent;
import android.service.autofill.SavedDatasetsInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PageRegistrasi extends AppCompatActivity {
    EditText username,password,email;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_registrasi);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        email =(EditText) findViewById(R.id.email);
        login= (Button) findViewById(R.id.register);
        login.setOnClickListener(new View.OnClickListener() {
            private void Save(String username, String password, String email){
            }
            public void onClick(View view) {
                String username1=username.getText().toString();
                String password1=password.getText().toString();
                String email1=email.getText().toString();
                SavedDatasetsInfo email,password,username;
                Toast.makeText(PageRegistrasi.this, "Username Anda Adalah "+username1,Toast.LENGTH_SHORT).show();
                Intent intent =new Intent(PageRegistrasi.this,MainActivity.class);
                PageRegistrasi.this.startActivity(intent);
            }
        });
    }
}