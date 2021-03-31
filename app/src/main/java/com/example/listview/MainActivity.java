package com.example.listview;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list=findViewById(R.id.list_view);

        ListAdapter adapter=new ListAdapter(this,createPersons());

        list.setAdapter(adapter);
    }

    private List<Person> createPersons(){
        List<Person>data=new ArrayList<>();
        data.add(new Person(R.drawable.photo_1,"Canon 70D","Canon","DSLR"));
        data.add(new Person(R.drawable.photo_2,"Nikon D7000","Nikon","DSLR"));
        data.add(new Person(R.drawable.photo_3,"Canon EOS 600D","Canon","DSLR"));
        data.add(new Person(R.drawable.photo_4,"Nikon D5300","Nikon","DSLR"));
        data.add(new Person(R.drawable.photo_5,"Nikon P1000","Nikon","DSLR"));
        data.add(new Person(R.drawable.photo_6,"Canon EOS M100","Canon","Digital"));
        data.add(new Person(R.drawable.photo_7,"Canon EOS 60D","Canon","DSLR"));
        data.add(new Person(R.drawable.photo_8,"Nikon D3200","Nikon","DSLR"));
        data.add(new Person(R.drawable.photo_9,"Nikon Coolpix S3300","Nikon","Digital"));
        data.add(new Person(R.drawable.photo_10,"Canon G7X","Canon","Digital"));

        return data;
    }
}