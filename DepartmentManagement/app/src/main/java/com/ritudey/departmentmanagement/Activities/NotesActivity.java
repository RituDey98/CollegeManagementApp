package com.ritudey.departmentmanagement.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.ritudey.departmentmanagement.Adapters.NotesAdapter;
import com.ritudey.departmentmanagement.Adapters.NoticeAdapter;
import com.ritudey.departmentmanagement.R;

public class NotesActivity extends AppCompatActivity {


    Toolbar toolbarNotes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);


        toolbarNotes=findViewById(R.id.notes_toolbar);

        RecyclerView notes_activity = (RecyclerView) findViewById(R.id.notes_recylerview);

        notes_activity.setLayoutManager(new LinearLayoutManager(this));
        String[] subject= {"C", "C++", "Java", "Python", "DBMS", "HTML", "CSS", "PHP","JavaScript"};


        notes_activity.setAdapter(new NotesAdapter(subject,getApplicationContext()));

        toolbarNotes.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                onBackPressed();
            }
        });


    }
}
