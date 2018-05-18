package com.nuclode.android.fab;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class PostPreview extends AppCompatActivity {

    ImageView postImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_preview);

        postImageView = findViewById(R.id.post_image_view);
        Intent data = getIntent();
        Bitmap photo = data.getParcelableExtra("data");
        postImageView.setImageBitmap(photo);
    }
}
