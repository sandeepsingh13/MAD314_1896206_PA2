package com.example.mad314_1896206_pa2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class studentrepository {

    private static studentrepository instance = null;
    private List<Student> students = new ArrayList<>();

    private studentrepository() {
        Student student = new Student();
        student.password = "abc";
        student.id = 111;
        student.name = "sandeep";
        this.students.add(student);
    }


    public static studentrepository getInstance() {
        if (instance == null) {
            instance = new studentrepository();
        }
        return instance;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public List<Student> getStudents() {
        return this.students;
    }



}
