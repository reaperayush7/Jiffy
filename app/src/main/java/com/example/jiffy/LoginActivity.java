package com.example.jiffy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;

import java.util.Calendar;

public class LoginActivity extends AppCompatActivity {

    ConstraintLayout constraintLayout;

    TextInputLayout textInputLayoutEmail, textInputLayoutPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_login );

        btnLogin = findViewById( R.id.btnLogin );
        constraintLayout = findViewById( R.id.constraintContainer );

        Calendar calender = Calendar.getInstance();

        int timeOfDay = calender.get(Calendar.HOUR_OF_DAY);

        if (timeOfDay >= 6 && timeOfDay <= 18)
        {
            constraintLayout.setBackground( getDrawable( R.drawable.good_morning_img ) );
        }
        else
        {
            constraintLayout.setBackground( getDrawable( R.drawable.good_night_img ) );
        }


        btnLogin.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent( getApplicationContext(), DashboardActivity.class ) );
            }
        } );






    }
}
