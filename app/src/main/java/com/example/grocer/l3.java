package com.example.grocer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class l3 extends AppCompatActivity {

    EditText q1,q2,q3,q4,s1,s2,s3,s4,t,m,it;
    Button a1,a2,a3,a4,c,b,d;
    float tot=0;
    String str="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l3);
        q1=findViewById(R.id.qq1);
        q2=findViewById(R.id.qq2);
        q3=findViewById(R.id.qq3);
        q4=findViewById(R.id.qq4);
        s1=findViewById(R.id.ss1);
        s2=findViewById(R.id.ss2);
        s3=findViewById(R.id.ss3);
        s4=findViewById(R.id.ss4);
        t=findViewById(R.id.total);
        m=findViewById(R.id.mode);
        c=findViewById(R.id.confirm);
        b=findViewById(R.id.back);
        a1=findViewById(R.id.aa1);
        a2=findViewById(R.id.aa2);
        a3=findViewById(R.id.aa3);
        a4=findViewById(R.id.aa4);
        d=findViewById(R.id.done);
        it=findViewById(R.id.i);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(l3.this,home.class);
                startActivity(i);
                finish();
            }
        });
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st1=q1.getText().toString();
                if(!st1.equals("")) {
                    s1.setText("Selected");
                    float qty1 = Float.parseFloat(q1.getText().toString());
                    tot = tot + (qty1 * 30);
                    str=str+"--> Tomato-Local("+String.valueOf(qty1)+" Kg)\n";
                }
                else{
                    disp();
                }

            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st2=q2.getText().toString();
                if(!st2.equals("")) {
                    s2.setText("Selected");
                    float qty2 = Float.parseFloat(q2.getText().toString());
                    tot = tot + (qty2 * 60);
                    str=str+"-->Chilli-Green("+String.valueOf(qty2)+" Kg)\n";
                }
                else{
                    disp();
                }
            }
        });
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st3=q3.getText().toString();
                if(!st3.equals("")) {
                    s3.setText("Selected");
                    float qty3 = Float.parseFloat(q3.getText().toString());
                    tot = tot + (qty3 * 49);
                    str=str+"--> Potato("+String.valueOf(qty3)+" Kg)\n";
                }
                else{
                    disp();
                }
            }
        });
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st4=q4.getText().toString();
                if(!st4.equals("")) {
                    s4.setText("Selected");
                    float qty4 = Float.parseFloat(q4.getText().toString());
                    tot = tot + (qty4 * 152);
                    str=str+"-->Ginger("+String.valueOf(qty4)+" Kg)\n";
                }
                else{
                    disp();
                }
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.setText("Rs."+String.valueOf(tot));
                it.setText(str);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st6=m.getText().toString();

                    if (tot != 0) {
                        if(!st6.equals("")) {

                            Intent i = new Intent(l3.this, lastorder.class);
                            startActivity(i);
                            finish();
                        }
                        else
                        {
                            display();
                        }

                    } else {
                        Intent i = new Intent(l3.this, last.class);
                        startActivity(i);
                        finish();
                    }
                }


        });


    }
    void disp()
    {
        Toast a1= Toast.makeText(this,"Select the Quantity in Kg",Toast.LENGTH_SHORT);
        a1.show();
    }
    void display()
    {
        Toast a2= Toast.makeText(this,"Select the mode of payment",Toast.LENGTH_SHORT);
        a2.show();
    }

}
