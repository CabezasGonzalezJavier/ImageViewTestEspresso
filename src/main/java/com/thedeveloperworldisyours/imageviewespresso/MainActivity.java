package com.thedeveloperworldisyours.imageviewespresso;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView mImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView = (ImageView) findViewById(R.id.activity_main_image);

    }

    public void changesImage(View view) {
        mImageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.the_developer_world_is_yours));
    }
}
