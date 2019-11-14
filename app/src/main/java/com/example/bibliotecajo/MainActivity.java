package com.example.bibliotecajo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edt1,edt2;
    private ProgressBar pb;
    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1=(EditText)findViewById(R.id.editText_username);
        edt2=(EditText)findViewById(R.id.editText_password);
        pb=(ProgressBar)findViewById(R.id.progressBar);
        bt=(Button)findViewById(R.id.button_login);

        bt.setOnClickListener(this);
        pb.setVisibility(View.INVISIBLE);

    }

    @Override
    public void onClick(View v) {
        new Task().execute(edt1.getText().toString());
    }

    class Task extends AsyncTask<String, Void, String> {

        @Override
        protected void onPreExecute() {

            bt.setEnabled(false);
        }

        @Override
        protected String doInBackground(String... strings) {

            try
            {
                Thread.sleep(100);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            bt.setEnabled(true);
            pb.setVisibility(View.VISIBLE);
            Toast.makeText(getBaseContext(),"acceso permitido",Toast.LENGTH_SHORT).show();

            String user = edt1.getText().toString();
            String pass = edt2.getText().toString();

            Intent i = new Intent(getBaseContext(),Home_act.class);
            i.putExtra("nombre",user);
            i.putExtra("constraseña",pass);
            startActivity(i);
        }
    }
}
