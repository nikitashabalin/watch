package com.example.session2_watch;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.session2_watch.databinding.ActivityMainBinding;

public class SignInScreen extends Activity implements View.OnClickListener {

    private TextView mTextView;
    private ActivityMainBinding binding;
    private EditText email;
    private EditText pass;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.login_button);
        button1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.login_button:
                Intent intent1 = new Intent(this, MainScreen.class);
                startActivity(intent1);
                break;
            default:
                break;
        }

    }
}