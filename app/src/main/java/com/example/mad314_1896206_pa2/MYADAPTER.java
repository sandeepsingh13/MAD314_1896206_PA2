package com.example.mad314_1896206_pa2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MYADAPTER extends RecyclerView.Adapter<studentviewholder> {
    private LayoutInflater mInflater;
    private List<Student> mData = new ArrayList<>();

    public MYADAPTER(Context context) {
        this.mInflater = LayoutInflater.from(context);
        this.mData.addAll(studentrepository.getInstance().getStudents());

    }

    public static void setAdapter(MYADAPTER mAdapter) {
    }

    @NonNull
    @Override
    public studentviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.student_vh, parent, false);
        return new studentviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull studentviewholder holder, int position) {

        List<Student> animals = studentrepository.getInstance().getStudents();


        holder.name.setText(animals.get(position).name);
        holder.ID .setText(animals.get(position).id);
    }

    @Override
    public int getItemCount() {
        return studentrepository.getInstance().getStudents().size();
    }

    public void update() {
        mData.clear();
        mData.addAll(studentrepository.getInstance().getStudents());
        notifyDataSetChanged();
    }
}
