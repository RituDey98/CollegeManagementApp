package com.ritudey.departmentmanagement.Activities;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;
import android.view.View;

import com.ritudey.departmentmanagement.Adapters.QnaRecyclerViewAdapter;
import com.ritudey.departmentmanagement.R;

import java.util.ArrayList;
import java.util.List;

public class QnaActivity extends AppCompatActivity {
    Toolbar qnaToolbar;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qna);
        RecyclerView qna_recyclerview=findViewById(R.id.qna_recyclerview);
        qna_recyclerview.setLayoutManager(new LinearLayoutManager(this));
        qnaToolbar=findViewById(R.id.qna_toolbar);


        ArrayList<String> myDates;
        myDates= new ArrayList<>();
        myDates.add("10.01.2020");
        myDates.add("11.01.2020");
        myDates.add("30.01.2020");
        myDates.add("04.01.2020");
        myDates.add("10.01.2020");
        myDates.add("10.01.2020");
        myDates.add("10.01.2020");
        myDates.add("10.01.2020");
        myDates.add("10.01.2020");
        myDates.add("10.01.2020");
        myDates.add("10.01.2020");

        QnaRecyclerViewAdapter qnaRecyclerViewAdapter = new QnaRecyclerViewAdapter(getApplicationContext(),myDates);
        qna_recyclerview.setAdapter(qnaRecyclerViewAdapter);

        qnaToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();

            }
        });


    }
}