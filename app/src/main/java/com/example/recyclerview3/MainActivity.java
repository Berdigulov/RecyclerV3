package com.example.recyclerview3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<String> employerList = new ArrayList<>();
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);

        employerList.add("Michel");
        employerList.add("Elisabeth");
        employerList.add("Arthur");
        employerList.add("Amelia");
        employerList.add("Harry");
        employerList.add("Johny");
        employerList.add("Rosie");
        employerList.add("Oscar");
        employerList.add("Sophia");
        employerList.add("Jack");
        employerList.add("Grace");
        employerList.add("Freddie");
        employerList.add("Jacob");
        employerList.add("Daisy");
        employerList.add("Isaac");
        employerList.add("Willow");
        employerList.add("Thomas");
        employerList.add("Harper");
        employerList.add("Edward");
        employerList.add("Emilia");

        EmployerAdapter employerAdapter = new EmployerAdapter(employerList);
        recyclerView.setAdapter(employerAdapter);

    }
}