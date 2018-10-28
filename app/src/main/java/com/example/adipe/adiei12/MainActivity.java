package com.example.adipe.adiei12;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button a1, a2, a3, a4, a5;
    AlertDialog.Builder ad;
    LinearLayout l;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int eo= item.getItemId();
        if (eo==R.id.cred){
            Intent r= new Intent(this, MainActivity.class);
            startActivity(r);}
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l = (LinearLayout) findViewById(R.id.ll1);
        a1 = (Button) findViewById(R.id.a1);
        a2 = (Button) findViewById(R.id.a2);
        a3 = (Button) findViewById(R.id.a3);
        a4 = (Button) findViewById(R.id.a4);
        a5 = (Button) findViewById(R.id.a5);
    }


    public void b1(View view) {

        ad = new AlertDialog.Builder(this);
        ad.setTitle("this is a simple massage");
        ad.setMessage("hello");
        AlertDialog a = ad.create();
        ad.show();

    }

    public void b2(View view) {
        ad = new AlertDialog.Builder(this);
        ad.setTitle("this is a simple massage");
        ad.setMessage("hello");
        ad.setIcon(R.drawable.don);
        AlertDialog a = ad.create();
        ad.show();


    }

    public void b3(View view) {
        ad = new AlertDialog.Builder(this);
        ad.setTitle("this is a simple massage");
        ad.setMessage("hello");
        ad.setIcon(R.drawable.don);
        ad.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();

            }
        });
        AlertDialog a = ad.create();
        ad.show();

    }

    public void b4(View view) {

        ad = new AlertDialog.Builder(this);
        ad.setTitle("שינוי רקע");
        ad.setMessage("שנה צבע");
        ad.setPositiveButton("color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Random rnd = new Random();
                l.setBackgroundColor(Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
            }
        });
        ad.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();

            }
        });
        AlertDialog a = ad.create();
        ad.show();

    }

    public void b5(View view) {

        ad = new AlertDialog.Builder(this);
        ad.setTitle("שינוי רקע");
        ad.setMessage("שנה צבע");
        ad.setPositiveButton("color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Random rnd = new Random();
                l.setBackgroundColor(Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
            }
        });
        ad.setNeutralButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();

            }
        });

        ad.setNegativeButton("background", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                l.setBackgroundColor(Color.WHITE);

            }
        });
        AlertDialog a = ad.create();
        ad.show();

    }

}
