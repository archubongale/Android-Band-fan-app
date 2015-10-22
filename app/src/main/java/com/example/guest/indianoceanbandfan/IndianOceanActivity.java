package com.example.guest.indianoceanbandfan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class IndianOceanActivity extends AppCompatActivity {
    private Button mArtistButton;
    private Button mAlbumButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian_ocean);

        mArtistButton = (Button) findViewById(R.id.artistsButton);
        mAlbumButton = (Button) findViewById(R.id.albumButton);

        mArtistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IndianOceanActivity.this,ArtistsActivity.class);
                startActivity(intent);
            }
        });

        mAlbumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IndianOceanActivity.this,AlbumActivity.class);
                startActivity(intent);
            }
        });


    }



}
