package com.example.work09;


import static android.graphics.Color.WHITE;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;




/**
 * @author		Idan Bunkin <idan.bunkin@gmail.com>
 * @version	1
 * @since		5/01/2023 (the date of the package the class was added)
 * 5 buttons with adb that each does something else
 */

public class MainActivity extends AppCompatActivity {
    /**
     * The Random.
     */
    Random random;
    /**
     * The Btn 1.
     */
    Button btn1, /**
     * The Btn 2.
     */
    btn2, /**
     * The Btn 3.
     */
    btn3, /**
     * The Btn 4.
     */
    btn4, /**
     * The Btn 5.
     */
    btn5;
    /**
     * The Adb.
     */
    AlertDialog.Builder adb;
    /**
     * The Cl.
     */
    ConstraintLayout cl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        random = new Random();
        cl = (ConstraintLayout) findViewById(R.id.CL);


    }

    /**
     *  adb with message
     *
     * @param view the view
     */
    public void Message(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Albert Levy");
        adb.setMessage("Albert Levy");

        AlertDialog ad = adb.create();
        ad.show();

    }

    /**
     * adb with message and image
     *
     * @param view the view
     */
    public void MessageImage(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Albert Levy");
        adb.setMessage("Albert Levy");
        adb.setIcon(R.drawable.crown);

        AlertDialog ad = adb.create();
        ad.show();

    }

    /**
     * adb with a message a icon and a quit option
     *
     * @param view the view
     */
    public void Quit(View view)
    {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Albert Levy");
        adb.setMessage("Albert Levy");
        adb.setIcon(R.drawable.crown);
        adb.setPositiveButton("Quit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();

            }
        });

        AlertDialog ad = adb.create();
        ad.show();

    }

    /**
     * adb with button to change backgreound color randomly and quit button
     *
     * @param view the view
     */
    public void Colors(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Albert Levy");
        adb.setPositiveButton("Quit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();

            }
        });
        adb.setNegativeButton("Change Color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                int red = random.nextInt(255);
                int green = random.nextInt(255);
                int blue = random.nextInt(255);
                int color = Color.rgb(red, green, blue);
                cl.setBackgroundColor(color);


            }
        });

        AlertDialog ad = adb.create();
        ad.show();
    }

    /**
     * adb with button to change backgreound color randomly and quit button and a buttton to return background color to white
     *
     * @param view the view
     */
    public void threeButtons(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Albert Levy");
        adb.setPositiveButton("Quit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();

            }
        });
        adb.setNegativeButton("Change Color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                int red = random.nextInt(255);
                int green = random.nextInt(255);
                int blue = random.nextInt(255);
                int color = Color.rgb(red, green, blue);
                cl.setBackgroundColor(color);


            }
        });
        adb.setNeutralButton("Back To White", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                cl.setBackgroundColor(WHITE);
            }
        });

        AlertDialog ad = adb.create();
        ad.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        String st = item.getTitle().toString();
        if(st.equals("Credit Screen"))
        {
            Intent si = new Intent(this, MainActivity2.class);
            startActivity(si);
        }
        return true;
    }

}