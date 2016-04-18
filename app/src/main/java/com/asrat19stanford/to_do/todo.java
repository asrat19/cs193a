package com.asrat19stanford.to_do;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class todo extends AppCompatActivity {
    ArrayList<String> allTasks = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo);

//        for (int i = 0; i<5; i++) {
//            allTasks.add(i, "dog");
//        }
            ArrayAdapter<String> todo = new ArrayAdapter<String>
                    (this, android.R.layout.simple_list_item_1, allTasks);
            ListView listView = (ListView) findViewById(R.id.listview);
            listView.setAdapter(todo);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                allTasks.remove(position); //for some reason works when you click the back button or click anywhere on the screen after

            }
        });



        }








    public void update(View view) {
        EditText newTask = (EditText) findViewById(R.id.editText);
        String task = newTask.getText().toString();
        allTasks.add(allTasks.size(), task);
//        allTasks.add(task);








    }
}
