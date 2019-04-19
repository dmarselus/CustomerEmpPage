package com.example.dmars.loginproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnEmp;
    Button btnCust;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEmp = (Button) findViewById(R.id.btnEmp);
        btnCust = (Button) findViewById(R.id.btnCust);

        btnEmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickAnim(btnEmp);
            }
        });

        btnCust.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickAnim(btnCust);
            }
        });
    }

    public void clickAnim(View v)
    {
        Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.buttonclick);
        v.startAnimation(anim);
    }
}
