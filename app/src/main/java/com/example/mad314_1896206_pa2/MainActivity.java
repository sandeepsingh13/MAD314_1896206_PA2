package com.example.mad314_1896206_pa2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private MYADAPTER mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText t1 = findViewById(R.id.t1);
        final EditText t2 = findViewById(R.id.t2);
        final EditText t3 = findViewById(R.id.t3);
        final Button Login = findViewById(R.id.Login);
        final RecyclerView rvstudent = findViewById(R.id.rvstudent);
        layoutManager = new LinearLayoutManager(this);
        rvstudent.setLayoutManager(layoutManager);
        mAdapter = new MYADAPTER(getApplicationContext());
        MYADAPTER.setAdapter(mAdapter);
        final studentrepository repository = studentrepository.getInstance();

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = t1.getText().toString();
                int ID = Integer.parseInt(t2.getText().toString());
                String password = t3.getText().toString();

                Student student = new Student();
                student.name = name;
                student.id = ID;
                student.password = password;

                // add animal to repo
                repository.addStudent(student);


                t1.getText().clear();
                t2.getText().clear();
                t3.getText().clear();


            }
        });

    }
}
