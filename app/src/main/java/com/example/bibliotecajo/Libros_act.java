package com.example.bibliotecajo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Libros_act extends AppCompatActivity {

    Spinner sp;
    EditText edt1,edt2;
    TextView txt1,txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libros_act);

        sp=findViewById(R.id.spinner);
        edt1=findViewById(R.id.editText_cantidad);
        edt2=findViewById(R.id.editText_prestamo);
        txt2=findViewById(R.id.textView_total);

        Bundle datosLibros = getIntent().getExtras();
        String[] listaLibros = datosLibros.getStringArray("libros");
        //String[] listaCostos = datos.getStringArray("valores");

        ArrayAdapter adapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,listaLibros);
        sp.setAdapter(adapter);

    }

    public void CalculodeValores(View view){

        Bundle datosCostos = getIntent().getExtras();
        int[] listaCostos=datosCostos.getIntArray("valores");


        if(sp.getSelectedItem().equals("Faremheit"))
        {
            int cant = Integer.valueOf(edt1.getText().toString());
            int prestamo = Integer.valueOf(edt2.getText().toString());
            int precioLibro = listaCostos[0];

            int resultado = (precioLibro*cant)+prestamo;

            txt2.setText("El valor total a pagar es:" + resultado);
            txt2.getText();

        }
        if(sp.getSelectedItem().equals("Revival"))
        {
            int cant = Integer.valueOf(edt1.getText().toString());
            int prestamo = Integer.valueOf(edt2.getText().toString());
            int precioLibro = listaCostos[1];

            int resultado = (precioLibro*cant)+prestamo;

            txt2.setText("El valor total a pagar es:" + resultado);
            txt2.getText();

        }
        if(sp.getSelectedItem().equals("Tesla"))
        {
            int cant = Integer.valueOf(edt1.getText().toString());
            int prestamo = Integer.valueOf(edt2.getText().toString());
            int precioLibro = listaCostos[2];

            int resultado = (precioLibro*cant)+prestamo;

            txt2.setText("El valor total a pagar es:" + resultado);
            txt2.getText();

        }
        if(sp.getSelectedItem().equals("Como ser chaleco amarillo"))
        {
            int cant = Integer.valueOf(edt1.getText().toString());
            int prestamo = Integer.valueOf(edt2.getText().toString());
            int precioLibro = listaCostos[3];

            int resultado = (precioLibro*cant)+prestamo;

            txt2.setText("El valor total a pagar es:" + resultado);
            txt2.getText();
        }
        if(sp.getSelectedItem().equals("Manifiesto Comunista"))
        {
            int cant = Integer.valueOf(edt1.getText().toString());
            int prestamo = Integer.valueOf(edt2.getText().toString());
            int precioLibro = listaCostos[4];

            int resultado = (precioLibro*cant)+prestamo;

            txt2.setText("El valor total a pagar es:" + resultado);
            txt2.getText();
        }
    }
}


//Intent intent = getIntent();
//        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);