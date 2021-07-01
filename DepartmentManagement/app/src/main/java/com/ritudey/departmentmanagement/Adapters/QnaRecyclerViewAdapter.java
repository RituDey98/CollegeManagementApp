package com.ritudey.departmentmanagement.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ritudey.departmentmanagement.R;

import java.util.ArrayList;
import java.util.List;

public class QnaRecyclerViewAdapter extends RecyclerView.Adapter<QnaRecyclerViewAdapter.ViewHolder> {

    Context context;
    ArrayList<String> myDates;


    public QnaRecyclerViewAdapter(Context context, ArrayList<String> myList) {
        this.context = context;
        this.myDates = myList;
    }

    @NonNull

    @Override
    public ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view= inflater.inflate(R.layout.qna_list_item,parent,false);
        return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  QnaRecyclerViewAdapter.ViewHolder holder, int position) {
        holder.date.setText(myDates.get(position));

    }

    @Override
    public int getItemCount() {
        return myDates.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView date,caption;
        ImageView qnaImg;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            date = itemView.findViewById(R.id.qna_date_text_view);
            caption=itemView.findViewById(R.id.qna_caption_text_view);
            qnaImg=itemView.findViewById(R.id.qna_img_view);
        }
    }
}
