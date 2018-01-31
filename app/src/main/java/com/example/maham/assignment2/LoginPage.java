package com.example.maham.assignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginPage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        final EditText ed1 = (EditText) findViewById(R.id.uname);

        TextView abc =(TextView) findViewById(R.id.abc);
        abc.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

               Intent i = new Intent(LoginPage.this, signup.class);

                startActivity(i);
            }
        });

        Button login =(Button) findViewById(R.id.button1);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = ed1.getText().toString();
                Intent i = new Intent(LoginPage.this, mainpage.class);
                i.putExtra("uname",value);
                startActivity(i);
            }
        });
    }
}
