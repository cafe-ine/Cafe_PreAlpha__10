package com.cafe.cafe_pre_alpha_1;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView mRegisterLink ;
    private Button mLoginButton;
    private String mTextToast = "Error when trying to login.";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*        mLoginButton = (Button) findViewById(R.id.button_login);
        mLoginButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                mLoginButton.setEnabled(false);

                final ProgressDialog progressDialog = new ProgressDialog(MainActivity.this,
                        R.style.Theme_AppCompat_DayNight_Dialog);
                progressDialog.setIndeterminate(true);
                progressDialog.setMessage("Authenticating...");
                progressDialog.show();

                //String email = mEmailText.getText().toString();
                //String password = mPasswordText.getText().toString();

                // TODO: Implement your own authentication logic here.

                new android.os.Handler().postDelayed(
                        new Runnable() {
                            public void run() {
                                // On complete call either onLoginSuccess or onLoginFailed
                                // onLoginFailed();
                                progressDialog.dismiss();
                            }
                        }, 3000);;
            }
        });*/

        mRegisterLink = (TextView) findViewById(R.id.link_register);

        mRegisterLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent RegisterActivityIntent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(RegisterActivityIntent);

            }
        });

        mLoginButton = (Button) findViewById(R.id.button_login);
        Toast.makeText(MainActivity.this, mTextToast, Toast.LENGTH_LONG).show();

        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(MainActivity.this, mTextToast , Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }
}
