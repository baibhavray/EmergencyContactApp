package com.example.emergencycontactapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnMedical, btnFire, btnPolice,btnWomenHL,btnAirAmbulance,btnRailway,btnKisan,btnLPG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMedical = findViewById(R.id.btnMedical);
        btnFire = findViewById(R.id.btnFire);
        btnPolice = findViewById(R.id.btnPolice);
        btnWomenHL = findViewById(R.id.btnWomenHL);
        btnAirAmbulance = findViewById(R.id.btnAirAmbulance);
        btnRailway = findViewById(R.id.btnRailway);
        btnKisan = findViewById(R.id.btnKisan);
        btnLPG = findViewById(R.id.btnLPG);

        if (Build.VERSION.SDK_INT >= 23)
        {
            if(ContextCompat.checkSelfPermission(MainActivity.this,"android.permission.CALL_PHONE") != PackageManager.PERMISSION_GRANTED)
            {
                ActivityCompat.requestPermissions(MainActivity.this,new String[]{"android.permission.CALL_PHONE"} ,1);
            }
        }

        btnPolice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent("android.intent.action.CALL");
                //new Intent("android.intent.action.CALL") = new Intent(Intent.ACTION_CALL)
                i.setData(Uri.parse("tel:100"));
                startActivity(i);
            }
        });

        btnFire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent("android.intent.action.CALL");
                i.setData(Uri.parse("tel:101"));
                startActivity(i);
            }
        });

        btnMedical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent("android.intent.action.CALL");
                i.setData(Uri.parse("tel:108"));
                startActivity(i);
            }
        });

        btnWomenHL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent("android.intent.action.CALL");
                //new Intent("android.intent.action.CALL") = new Intent(Intent.ACTION_CALL)
                i.setData(Uri.parse("tel:1091"));
                startActivity(i);
            }
        });

        btnAirAmbulance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent("android.intent.action.CALL");
                i.setData(Uri.parse("tel:9540161344"));
                startActivity(i);
            }
        });

        btnRailway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent("android.intent.action.CALL");
                i.setData(Uri.parse("tel:139"));
                startActivity(i);
            }
        });
        btnKisan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent("android.intent.action.CALL");
                i.setData(Uri.parse("tel:1551"));
                startActivity(i);
            }
        });

        btnLPG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent("android.intent.action.CALL");
                i.setData(Uri.parse("tel:1906"));
                startActivity(i);
            }
        });
    }
}