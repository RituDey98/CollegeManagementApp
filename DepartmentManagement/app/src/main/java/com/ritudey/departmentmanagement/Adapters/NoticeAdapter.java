package com.ritudey.departmentmanagement.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import com.ritudey.departmentmanagement.R;

public class NoticeAdapter  extends RecyclerView.Adapter<NoticeAdapter.ViewHolder> {

    private String[] data;

    private Context context;

    public NoticeAdapter(String[] data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.notice_item_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NoticeAdapter.ViewHolder holder, int position) {

        String title=data[position];

        holder.notice_body_text_view.setText(title);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView notice_text_view;
        TextView notice_body_text_view;
        TextView notice_date_text_view;
        ImageView notice_img_view;

        public ViewHolder(@NonNull  View itemView) {
            super(itemView);

            notice_text_view=(TextView)itemView.findViewById(R.id.notice_text_view);
            notice_body_text_view=(TextView)itemView.findViewById(R.id.notice_body_text_view);
            notice_date_text_view=itemView.findViewById(R.id.notice_date_text_view);
            notice_img_view=itemView.findViewById(R.id.notice_img_view);

        }
    }
}
