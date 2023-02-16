package com.example.pract1;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.pract1.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    private static final String TAG = "pract1";

    /*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    */

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        Toast toast = Toast.makeText(getApplicationContext() , "onCreate" , Toast.LENGTH_SHORT);
        toast.show();
        Log.e(TAG , "onCreate");
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        Toast toast = Toast.makeText(getApplicationContext() , "onStart" , Toast.LENGTH_SHORT);
        toast.show();
        Log.e(TAG , "onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Toast toast = Toast.makeText(getApplicationContext() , "onResume" , Toast.LENGTH_SHORT);
        toast.show();
        Log.e(TAG, "onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Toast toast = Toast.makeText(getApplicationContext() , "onPause" , Toast.LENGTH_SHORT);
        toast.show();
        Log.e(TAG , "onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Toast toast = Toast.makeText(getApplicationContext() , "onStop" , Toast.LENGTH_SHORT);
        toast.show();
        Log.e(TAG , "onStop");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Toast toast = Toast.makeText(getApplicationContext() , "onRestart" , Toast.LENGTH_SHORT);
        toast.show();
        Log.e(TAG , "onRestart");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Toast toast = Toast.makeText(getApplicationContext() , "onDestroy" , Toast.LENGTH_SHORT);
        //toast cannot be shown because the context is turns null
        toast.show();
        Log.e(TAG , "onDestroy");
        super.onDestroy();
    }
}