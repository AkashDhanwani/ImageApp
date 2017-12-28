package com.akash.gallery;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageViewer extends AppCompatActivity {

    ImageView ivPic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_viewer);

        ivPic = findViewById(R.id.ivPic);

        Intent i = getIntent();
        String path = i.getStringExtra("Path");

        Bitmap bm = BitmapFactory.decodeFile(path);

        bm = Bitmap.createScaledBitmap(bm, bm.getWidth(),bm.getHeight(),true);
        ivPic.setImageBitmap(bm);
    }
}
