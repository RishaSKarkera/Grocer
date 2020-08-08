package com.example.grocer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class register extends AppCompatActivity {
    Button b1;
    EditText t1,t2,t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        t1 = findViewById(R.id.e1);
        t2 = findViewById(R.id.p1);
        t3 = findViewById(R.id.p2);
        b1 = findViewById(R.id.s);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check();

            }
        });
    }

        void check ()
        {
            String us3 = t2.getText().toString();
            String us1 = t3.getText().toString();
            String us2 = t1.getText().toString();
            if (us2.equals("")) {
                Toast a1 = Toast.makeText(this, "You must enter valid username", Toast.LENGTH_SHORT);
                a1.show();

            } else if (us3.equals("")) {
                Toast a2 = Toast.makeText(this, "You must enter password ", Toast.LENGTH_SHORT);
                a2.show();
            } else if (us1.equals("")) {
                Toast a3 = Toast.makeText(this, "You must enter valid password ", Toast.LENGTH_SHORT);
                a3.show();
            }
            if (us3.length() >= 1) {
                if (us1.length() >= 1) {
                    if (us2.length() >= 1) {
                        if (us3.equals(us1)) {
                            Intent i = new Intent(register.this, login.class);
                            startActivity(i);
                            finish();
                        } else {
                            Toast a4 = Toast.makeText(this, "Password do not match", Toast.LENGTH_SHORT);
                            a4.show();
                        }
                    }
                }
            }

        }


}
