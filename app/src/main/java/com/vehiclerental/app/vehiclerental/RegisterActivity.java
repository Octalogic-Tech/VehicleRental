package com.vehiclerental.app.vehiclerental;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    public TextView mTv_loginLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

    }

    public void loginRedirect(View view){
        mTv_loginLink = findViewById(R.id.tv_registerLink);
        startActivity(new Intent(RegisterActivity.this,LoginActivity.class));
    }

}
