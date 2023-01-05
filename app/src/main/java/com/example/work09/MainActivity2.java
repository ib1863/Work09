package com.example.work09;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

/**
 * @author		Idan Bunkin <idan.bunkin@gmail.com>
 * @version	1
 * @since		5/01/2023 (the date of the package the class was added)
 * credit screen
 */
public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add(0,0,200,"Back To Main Screen");
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        String st = item.getTitle().toString();
        if(st.equals("Back To Main Screen"))
        {
            Intent si = new Intent(this, MainActivity.class);
            startActivity(si);
        }
        return true;
    }
}