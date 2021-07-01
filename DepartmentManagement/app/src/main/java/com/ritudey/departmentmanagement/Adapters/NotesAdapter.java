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

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.NotesViewHolder>{
    private String[] notes_data;
    private Context context;

    public NotesAdapter(String[] notes_data,Context context)
    {
        this.notes_data = notes_data;
        this.context = context;

    }

    @NonNull
    @Override
    public NotesViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.notes_list_item_layout,parent,false);
        return new NotesAdapter.NotesViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull NotesAdapter.NotesViewHolder holder, int position) {
        String notes_title = notes_data[position];
        holder.notes_text_view.setText(notes_title);


    }


    @Override
    public int getItemCount() {
        return notes_data.length;
    }

    public class NotesViewHolder extends RecyclerView.ViewHolder{

        TextView notes_text_view;
        TextView notes_body_text_view;
        TextView notes_date_text_view;
        ImageView notes_img_view;

        public NotesViewHolder(@NonNull View itemView) {
            super(itemView);

            notes_text_view=(TextView)itemView.findViewById(R.id.notes_text_view);
            notes_body_text_view=(TextView)itemView.findViewById(R.id.notes_body_text_view);
            notes_date_text_view=itemView.findViewById(R.id.notes_date_text_view);
            notes_img_view=itemView.findViewById(R.id.notes_img_view);
        }
    }
}
