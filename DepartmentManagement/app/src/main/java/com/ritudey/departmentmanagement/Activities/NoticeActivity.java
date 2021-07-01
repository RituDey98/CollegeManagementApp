package com.ritudey.departmentmanagement.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.ritudey.departmentmanagement.Adapters.NoticeAdapter;
import com.ritudey.departmentmanagement.R;

public class NoticeActivity extends AppCompatActivity {

    Toolbar toolbarNotice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);

        toolbarNotice=findViewById(R.id.notice_toolbar);

        RecyclerView notice_activity = (RecyclerView) findViewById(R.id.notice_recylerview);

        notice_activity.setLayoutManager(new LinearLayoutManager(this));
        String[] sub = {"This is to...", "please notice...", "Its important....", "It is here by notify that...", "Exam notice...", "From fill up...", "You are requested to....", "Print Result..."};


        notice_activity.setAdapter(new NoticeAdapter(sub,getApplicationContext()));

        toolbarNotice.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                onBackPressed();
            }
        });


    }
}