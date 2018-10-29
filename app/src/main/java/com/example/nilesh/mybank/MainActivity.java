package com.example.nilesh.mybank;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button SBI,HDFC,PNB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SBI=findViewById(R.id.sbibtn);

        SBI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Account myAcc=new Account();
                myAcc.openAccount(new StateBank());
            }
        });

        PNB=findViewById(R.id.pnbbtn);

        PNB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Account myAcc=new Account();
                myAcc.openAccount(new PNB());
            }
        });

        HDFC=findViewById(R.id.hdfcbtn);

        HDFC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Account myAcc=new Account();
                myAcc.openAccount(new HDFC());
            }
        });


    }
}
