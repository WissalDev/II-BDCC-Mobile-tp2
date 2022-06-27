package com.example.tp_exam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tp_exam.data.LoginRepository;
import com.example.tp_exam.ui.login.LoginActivity;
import com.example.tp_exam.ui.login.LoginViewModel;

public class MainActivity extends AppCompatActivity {

    private TextView name,password;
    private ImageView logout_image;
    private LoginRepository loginRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.username_value);
        password = findViewById(R.id.password_value);
        logout_image = findViewById(R.id.logout);

        String username =  getIntent().getStringExtra("username");
        String pass =  getIntent().getStringExtra("password");

        name.setText(username);
        password.setText(pass);

        retour(logout_image);


    }

    public void retour(View view){
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                loginRepository.logout();
                Intent intent = new Intent(MainActivity.this,
                        LoginActivity.class);

                startActivity(intent);
                //Complete and destroy main activity once logout
                finish();

            }
        });
    }
}