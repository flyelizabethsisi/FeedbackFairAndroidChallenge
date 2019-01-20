package org.pursuit.dogbreeds;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DisplayActivity extends AppCompatActivity {
    private TextView breedTextView;
    private ImageView breedImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        /* TODO: Create xml layout for DisplayActivity in res folder using layout type of your choice
           TODO: Name this layout activity_display.xml
           TODO: Change background color to a color of your choice
           TODO: Add TextView to display breed & align the view to the center of the screen
           TODO: Add ImageView to display dog image & align view to the center of the screen */


        breedTextView = findViewById(R.id.selected_breed_textview);
        beedImageView = findViewById(R.id.random_dog_imageview);
    }
}
