package com.nuclode.android.fab;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PostPreview extends AppCompatActivity {

    ImageView postImageView;
    Bitmap photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_preview);

        postImageView = findViewById(R.id.post_image_view);
        Intent data = getIntent();
        if (data.getExtras().getInt("postType") == 2) {
            postImageView.setVisibility(View.GONE);
        } else if (data.getExtras().getInt("postType") == 0) {
            photo = data.getParcelableExtra("data");
        } else if (data.getExtras().getInt("postType") == 1) {
            String path = data.getStringExtra("data");
            photo = BitmapFactory.decodeFile(path);
        }
        postImageView.setImageBitmap(photo);
    }
}
