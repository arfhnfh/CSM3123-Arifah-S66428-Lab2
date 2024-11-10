package com.example.segmentedcontrolexperiment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI elements
        TabLayout tabLayout = findViewById(R.id.tabLayout);
        FragmentContainerView fragmentContainer = findViewById(R.id.fragmentContainer);

        // Add tabs to the TabLayout
        tabLayout.addTab(tabLayout.newTab().setText("First Tab"));
        tabLayout.addTab(tabLayout.newTab().setText("Second Tab"));
        tabLayout.addTab(tabLayout.newTab().setText("Third Tab"));
        tabLayout.addTab(tabLayout.newTab().setText("Fourth Tab"));


        // Load the first fragment by default
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainer, new FirstFragment())
                    .commit();
        }

        // Set a listener for tab selection
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Fragment fragment = null;
                switch (tab.getPosition()) {
                    case 0:
                        fragment = new FirstFragment();
                        break;
                    case 1:
                        fragment = new SecondFragment();
                        break;
                    case 2:
                        fragment = new ThirdFragment();
                        break;
                    case 3:
                        fragment = new FourthFragment();
                        break;
                }
                if (fragment != null) {
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragmentContainer, fragment)
                            .commit();
                }
            }


            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                // Optionally handle tab unselection
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                // Optionally handle tab reselection
            }
        });
    }
}
