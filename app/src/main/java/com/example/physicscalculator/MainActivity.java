package com.example.physicscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.physicscalculator.Circle;
import com.example.physicscalculator.Rectangle;
import com.example.physicscalculator.Rhombus;
import com.example.physicscalculator.Square;
import com.example.physicscalculator.Cone;
import com.example.physicscalculator.Cube;
import com.example.physicscalculator.Rectangular_Prism;
import com.example.physicscalculator.Sphere;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnCircle, btnRectangle, btnSquare, btnPrism, btnCone, btnCube, btnRhombus, btnSphere;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCircle = (Button)    findViewById(R.id.btn_Circle);
        btnRectangle = (Button) findViewById(R.id.btn_Rectangle);
        btnSquare = (Button)    findViewById(R.id.btn_Square);
        btnPrism = (Button)     findViewById(R.id.btn_Prism);
        btnCone = (Button)      findViewById(R.id.btn_Cone);
        btnCube = (Button)      findViewById(R.id.btn_Cube);
        btnRhombus = (Button)   findViewById(R.id.btn_Rhombus);
        btnSphere = (Button)    findViewById(R.id.btn_Sphere);

        btnCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Circle.class));
            }
        });
        btnRectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Rectangle.class));
            }
        });
        btnSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Square.class));
            }
        });
        btnPrism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Rectangular_Prism.class));
            }
        });
        btnCone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Cone.class));
            }
        });
        btnCube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Cube.class));
            }
        });
        btnRhombus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Rhombus.class));
            }});

        btnSphere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Sphere.class));
            }

        });}

    @Override
    public void onClick(View view) {

    }
}




