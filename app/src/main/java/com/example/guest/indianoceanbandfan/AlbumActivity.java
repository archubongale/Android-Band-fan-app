package com.example.guest.indianoceanbandfan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AlbumActivity extends AppCompatActivity {
    private String[] albumArray = {""};

    private ListView mListView;
    private ArrayAdapter mArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        mListView = (ListView) findViewById(R.id.alb)
    }


}
