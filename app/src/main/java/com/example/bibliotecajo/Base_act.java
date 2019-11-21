package com.example.bibliotecajo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.ContentObserver;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Base_act extends AppCompatActivity {

    private EditText edt1,edt2,edt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sql_lite_example_act);

        edt1=(EditText)findViewById(R.id.editText_codigo_libro);
        edt2=(EditText)findViewById(R.id.editText3_nombre_libro);
        edt3=(EditText)findViewById(R.id.editText2_precio_libro);
    }

    public void añadir_libro(View view){

        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,"Gestion", null, 1);
        SQLiteDatabase BaseDeDatosLibros = admin.getWritableDatabase();

        if (!edt1.getText().toString().isEmpty())
        {
            ContentValues registro = new ContentValues();
            registro.put("codigo", edt1.getText().toString());
            registro.put("nombre", edt3.getText().toString());
            registro.put("precio",edt2.getText().toString());

            BaseDeDatosLibros.insert("Libros",null,registro);
            BaseDeDatosLibros.close();

            Toast.makeText(this,"Se ha ingresado un libro",Toast.LENGTH_LONG).show();
        }

    }

}
