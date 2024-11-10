package com.example.menuexperiment;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        registerForContextMenu(textView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.main_menu, menu);
        menu.setHeaderTitle("Choose an option");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_settings) {
            textView.setText("Settings selected from context menu");
            return true;
        } else if (item.getItemId() == R.id.action_about) {
            textView.setText("About selected from context menu");
            return true;
        } else if (item.getItemId() == R.id.action_help) {
            textView.setText("Help selected from context menu");
            return true;
        } else if (item.getItemId() == R.id.action_contact) {
            textView.setText("Contact Us selected from context menu");
            return true;
        } else {
            return super.onContextItemSelected(item);
        }

    }
        @Override
        public boolean onCreateOptionsMenu (Menu menu){
            getMenuInflater().inflate(R.menu.main_menu, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected (MenuItem item){
            if (item.getItemId() == R.id.action_settings) {
                textView.setText("Settings selected");
                return true;
            } else if (item.getItemId() == R.id.action_about) {
                textView.setText("About selected");
                return true;
            } else if (item.getItemId() == R.id.action_help) {
                textView.setText("Help selected");
                return true;
            } else if (item.getItemId() == R.id.action_contact) {
                textView.setText("Contact Us selected");
                return true;
            } else {
                return super.onOptionsItemSelected(item);
            }
        }
    }

