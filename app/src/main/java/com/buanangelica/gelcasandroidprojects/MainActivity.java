package com.buanangelica.gelcasandroidprojects;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView list = findViewById(R.id.recycler_view_projects);



        Project[] projects = {
                new Project("Getting Started App","First project, The default 'Hello World' app!",R.drawable.getting_started),
                new Project("MyQuoteApp","Learning layout with personal motivation quotes",R.drawable.quote),
                new Project("BMI Calculator","My first real life working calculator, teaching varaibleas and mathematical equation",R.drawable.calculator),
                new Project("Inches Converter","A basic inches to meters converter!",R.drawable.tape),
                new Project("Dev Resto","A menu app for a restaurant, learning aout activities, Classes & objects, Arrays, Intent and ListView",R.drawable.hungry_developer)
        };


        ProjectsAdapter adapter = new ProjectsAdapter(projects);

        list.setAdapter(adapter);



    }
}