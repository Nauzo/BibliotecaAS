package com.example.bibliotecajo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class Home_act extends AppCompatActivity {

     private ViewFlipper vfp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_act);

        //creo una lista para almacenar las imagenes
        int listaimagenes[] = {R.drawable.a, R.drawable.b, R.drawable.c};

        vfp=findViewById(R.id.slider);

        //loop

        for (int i = 0; i < listaimagenes.length;i++){

            flipperImagenes(listaimagenes[i]);
        }

        //de manera forach

        /*for (int img: listaimagenes){

            flipperImagenes(listaimagenes[i]);
        }**/

    }

    public void flipperImagenes(int img){

        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(img);

        vfp.addView(imageView);
        vfp.setFlipInterval(4000);//tiempo para cambio de imagen 4 seg.
        vfp.setAutoStart(true);

        //animacion

        vfp.setInAnimation(this, android.R.anim.slide_in_left);//animacion o cambio de imagen hacia la isquierda
        vfp.setOutAnimation(this, android.R.anim.slide_out_right);

    }


    public void infotext(View view){

        Intent i = new Intent(this,Info_act.class);
        startActivity(i);
    }

    public void librosact(View view){
        String array[] = {"Faremheit","Revival","Tesla"};
        int arrayCostos[] = {5000,12000,25000};
        Intent i = new Intent(this,Libros_act.class);
        i.putExtra("libros",array);
        i.putExtra("valores",arrayCostos);
        startActivity(i);
    }

}
