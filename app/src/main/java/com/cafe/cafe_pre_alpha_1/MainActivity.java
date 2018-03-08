package com.cafe.cafe_pre_alpha_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mRegisterLink ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mRegisterLink = (TextView) findViewById(R.id.link_register);

        mRegisterLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent RegisterActivityIntent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(RegisterActivityIntent);

            }
        });
    }
}
