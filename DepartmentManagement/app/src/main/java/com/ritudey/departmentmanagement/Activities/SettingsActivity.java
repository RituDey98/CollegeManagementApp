package com.ritudey.departmentmanagement.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputLayout;
import com.ritudey.departmentmanagement.R;

public class SettingsActivity extends AppCompatActivity {

    Toolbar toolbar;
    TextInputLayout emailSettings,pwdSettings;
    ImageView editEmail,editPwd;
    Button saveBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        toolbar=findViewById(R.id.settings_toolbar);
        emailSettings=findViewById(R.id.settings_email_textInputLayout);
        pwdSettings=findViewById(R.id.settings_pwd_TextInputLayout);
        editEmail = findViewById(R.id.edit_email_img);
        editPwd = findViewById(R.id.edit_pwd_img);
        saveBtn=findViewById(R.id.save_btn);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();

            }
        });


        editEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                emailSettings.setEnabled(true);
            }
        });

        editPwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pwdSettings.setEnabled(true);
            }
        });

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                emailSettings.setEnabled(false);
                pwdSettings.setEnabled(false);
            }
        });



    }


}