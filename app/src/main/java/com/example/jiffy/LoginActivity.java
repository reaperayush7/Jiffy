package com.example.jiffy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final EditText etEmail, etPassword;
        Button btnLogin;

        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_login );

        etEmail = findViewById( R.id.etEmail );
        etPassword = findViewById( R.id.etPassword );
        btnLogin = findViewById( R.id.btnLogin );

        btnLogin.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etEmail.getText().toString().equals( "admin@admin.com" ) && etPassword.getText().toString().equals( "admin" ))
                {
                 startActivity( new Intent( LoginActivity.this, DashboardActivity.class ));
                 finish();
                }
                else {
                    etEmail.setText( "" );
                    etPassword.setText( "" );
                    etEmail.setError( "Email or Password does not match our data" );
                }

            }
        } );

    }
}
