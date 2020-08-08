package com.example.grocer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {
    private Button b1;
    EditText t1,t2;
    TextView b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        b1=findViewById(R.id.l);
        t1=findViewById(R.id.e);
        t2=findViewById(R.id.p);
        b2=findViewById(R.id.r);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(login.this,register.class);
                startActivity(i);
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valid();

            }
        });
    }
    void valid()
    {
        String us1=t1.getText().toString();
        String us2=t2.getText().toString();
        if(us1.equals("abc@gmail.com"))
        {
            if(us2.equals("123"))
            {
                Intent i=new Intent(login.this,home.class);
                startActivity(i);
                finish();

            }
            else
            {
                Toast a1= Toast.makeText(this,"Password is invalid.",Toast.LENGTH_SHORT);
                a1.show();
            }
        }
        else
        {
            Toast a2= Toast.makeText(this,"Username is invalid.",Toast.LENGTH_SHORT);
            a2.show();
        }

    }


}
