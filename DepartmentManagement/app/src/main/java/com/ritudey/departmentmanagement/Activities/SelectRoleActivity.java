package com.ritudey.departmentmanagement.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ritudey.departmentmanagement.R;

public class SelectRoleActivity extends AppCompatActivity {
    Button teacher_btn,student_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_role);

        teacher_btn=findViewById(R.id.teacher_btn);
        student_btn=findViewById(R.id.student_btn);

        teacher_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SelectRoleActivity.this,MainActivity.class));
            }
        });


        student_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SelectRoleActivity.this,MainActivity.class));
            }
        });





    }
}