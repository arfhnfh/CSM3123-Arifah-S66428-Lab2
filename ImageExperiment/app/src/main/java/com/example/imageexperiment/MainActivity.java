package com.example.imageexperiment;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private RelativeLayout layout;
    private int backgroundIndex = 0;
    private int[] backgrounds = {R.drawable.makkah, R.drawable.madinah, R.drawable.malaysia, R.drawable.kedah};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.layout);
        Button switchBackgroundButton = findViewById(R.id.switchBackgroundButton);

        switchBackgroundButton.setOnClickListener(v -> {
            backgroundIndex = (backgroundIndex + 1) % backgrounds.length;
            layout.setBackgroundResource(backgrounds[backgroundIndex]);

            // Load and apply fade-in animation
            Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
            layout.startAnimation(fadeIn);
        });
    }
}
