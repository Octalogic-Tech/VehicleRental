package com.vehiclerental.app.vehiclerental;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    public TextView tv_registerLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void registerRedirect(View view){
        tv_registerLink = findViewById(R.id.tv_registerLink);
        startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
    }
}
