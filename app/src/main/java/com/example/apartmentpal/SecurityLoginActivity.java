package com.example.apartmentpal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecurityLoginActivity extends AppCompatActivity {
    EditText pinNumber;
    Button authenticateButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security_login);

        pinNumber = (EditText) findViewById(R.id.securityLoginNumber);
        authenticateButton = (Button) findViewById(R.id.authenticateButton);

        authenticateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pin = pinNumber.getText().toString();
                if(pin.equals("0000")){
                    Intent intent = new Intent(getApplicationContext(),SecurityActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(SecurityLoginActivity.this,"Invalid Security Pin!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}