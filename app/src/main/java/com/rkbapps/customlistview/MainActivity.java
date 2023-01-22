package com.rkbapps.customlistview;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private List<ModelClass> modelClassList = new ArrayList<>();
    private CustomAdapter adapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        adapter = new CustomAdapter(modelClassList, this);

        //set data to arraylist : data source
        modelClassList.add(new ModelClass("RajKumar Bhakta", "8373001874", R.drawable.img_avatar));
        modelClassList.add(new ModelClass("Suman Bhakta", "8918013725", R.drawable.img_avatar));
        modelClassList.add(new ModelClass("Peu Sen", "9679800964", R.drawable.img_avatar));
        modelClassList.add(new ModelClass("Suman Adhikari", "7029277743", R.drawable.img_avatar));
        modelClassList.add(new ModelClass("Purnima Chanda", "9775713702", R.drawable.img_avatar));
        modelClassList.add(new ModelClass("Bapan Mandal", "8695863192", R.drawable.img_avatar));
        modelClassList.add(new ModelClass("Arup", "6295650473", R.drawable.img_avatar));
        modelClassList.add(new ModelClass("Subhadip Paul", "8348596657", R.drawable.img_avatar));
        modelClassList.add(new ModelClass("Samir Ojha", "9382633455", R.drawable.img_avatar));
        modelClassList.add(new ModelClass("Trishita Mishra", "988001383", R.drawable.img_avatar));
        modelClassList.add(new ModelClass("Sayan Podder", "9153081176", R.drawable.img_avatar));
        modelClassList.add(new ModelClass("Namita Bhakta", "7029659913", R.drawable.img_avatar));
        modelClassList.add(new ModelClass("Bibek Durai", "7679849557", R.drawable.img_avatar));
        modelClassList.add(new ModelClass("RajKumar Bhakta", "8373001874", R.drawable.img_avatar));
        modelClassList.add(new ModelClass("RajKumar Bhakta", "8373001874", R.drawable.img_avatar));
        modelClassList.add(new ModelClass("RajKumar Bhakta", "8373001874", R.drawable.img_avatar));

        //set adapter to list view
        listView.setAdapter(adapter);

        //manage list view click events
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Name : "+modelClassList.get(position).getName()+"\n"+"Phone Number : "+modelClassList.get(position).getPhoneNumber(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}