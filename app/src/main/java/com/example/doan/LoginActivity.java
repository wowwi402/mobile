package com.example.doan;

// LoginActivity.java
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Ánh xạ các button từ layout
        Button phoneLoginButton = findViewById(R.id.phoneLoginButton);
        Button facebookLoginButton = findViewById(R.id.facebookLoginButton);
        Button googleLoginButton = findViewById(R.id.googleLoginButton);
        Button appleLoginButton = findViewById(R.id.appleLoginButton);
        Button signupButton = findViewById(R.id.signupButton);

        // Thiết lập sự kiện click cho từng button
        phoneLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Xử lý đăng nhập bằng số điện thoại
            }
        });

        facebookLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Xử lý đăng nhập bằng Facebook
            }
        });

        googleLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Xử lý đăng nhập bằng Google
            }
        });

        appleLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Xử lý đăng nhập bằng Apple
            }
        });
    }
}
