package com.ritudey.departmentmanagement.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ritudey.departmentmanagement.Activities.NotesActivity;
import com.ritudey.departmentmanagement.Activities.NoticeActivity;
import com.ritudey.departmentmanagement.Activities.QnaActivity;
import com.ritudey.departmentmanagement.Activities.StudentInfoActivity;
import com.ritudey.departmentmanagement.R;

public class DepartmentFragment extends Fragment {

    CardView notesCardView,noticeCardView,qnaCardView,studentInfoCardView;

    public DepartmentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_department, container, false);

        noticeCardView = root.findViewById(R.id.notice_card_view);
        notesCardView = root.findViewById(R.id.notes_card_view);
        qnaCardView = root.findViewById(R.id.qna_card_view);
        studentInfoCardView = root.findViewById(R.id.student_info_card_view);

        noticeCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), NoticeActivity.class));
            }
        });


        notesCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), NotesActivity.class));
            }
        });



        qnaCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), QnaActivity.class));
            }
        });


        studentInfoCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), StudentInfoActivity.class));
            }
        });




        return root;

    }
}