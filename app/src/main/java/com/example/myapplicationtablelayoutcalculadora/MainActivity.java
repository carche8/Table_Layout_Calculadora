package com.example.myapplicationtablelayoutcalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private int valor1;
    private int numero2;
    private TextView tv1;
    private TextView tv_signo;
    private TextView tv_numero1;
    private TextView tv_numero2;
    private TextView tv_resultado;
    private Button uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, cero;
    private Button igual, sumar, restar, multiplicar, dividir, restaurar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tv1);
        tv_signo = (TextView) findViewById(R.id.tv_signo);
        uno = (Button) findViewById(R.id.uno);
        dos = (Button) findViewById(R.id.dos);
        tres = (Button) findViewById(R.id.tres);
        cuatro = (Button) findViewById(R.id.cuatro);
        cinco = (Button) findViewById(R.id.cinco);
        seis = (Button) findViewById(R.id.seis);
        siete = (Button) findViewById(R.id.siete);
        ocho = (Button) findViewById(R.id.ocho);
        nueve = (Button) findViewById(R.id.nueve);
        cero = (Button) findViewById(R.id.cero);
        igual = (Button) findViewById(R.id.igual);
        sumar = (Button) findViewById(R.id.sumar);
        restar = (Button) findViewById(R.id.restar);
        multiplicar = (Button) findViewById(R.id.multiplicar);
        dividir = (Button) findViewById(R.id.dividir);
        restaurar = (Button) findViewById(R.id.restaurar);
    }


    public void Operaciones(View view) {
        String resultado = "";


        switch (view.getId()) {
            case R.id.uno:
                tv1.setText(resultado + "1");

                if (tv_signo.getText().equals("0")) {

                }


            case R.id.dos:
                tv1.setText(resultado + "2");
            case R.id.tres:
                tv1.setText(resultado + "3");
            case R.id.cuatro:
                tv1.setText(resultado + "4");
            case R.id.cinco:
                tv1.setText(resultado + "5");
            case R.id.seis:
                tv1.setText(resultado + "6");
            case R.id.siete:
                tv1.setText(resultado + "7");
            case R.id.ocho:
                tv1.setText(resultado + "8");
            case R.id.nueve:
                tv1.setText(resultado + "9");
            case R.id.cero:
                tv1.setText(resultado + "0");


            case R.id.sumar:
                tv1.setText(resultado + "");
                tv_signo.setText("+");
                break;
            case R.id.restar:
                tv1.setText(resultado + "");
                tv_signo.setText("-");
                break;
            case R.id.multiplicar:
                tv1.setText(resultado + "");
                tv_signo.setText("*");
                break;
            case R.id.dividir:
                tv1.setText(resultado + "");
                tv_signo.setText("/");
                break;

        }
    }

    public void Resultado(View view) {
        if (view.getId() == R.id.sumar) {

            String valor1_String = tv_numero1.getText().toString();
            String valor2_String = tv_numero2.getText().toString();

            int valor1_int = Integer.parseInt(valor1_String);
            int valor2_int = Integer.parseInt(valor2_String);

            int resultado_int = valor1_int + valor2_int;
            tv_resultado.setText(" = " + resultado_int);
        }

        if (view.getId() == R.id.restar) {

            String valor1_String = tv_numero1.getText().toString();
            String valor2_String = tv_numero2.getText().toString();

            int valor1_int = Integer.parseInt(valor1_String);
            int valor2_int = Integer.parseInt(valor2_String);

            int resultado_int = valor1_int - valor2_int;
            tv_resultado.setText(" = " + resultado_int);
        }

        if (view.getId() == R.id.multiplicar) {

            String valor1_String = tv_numero1.getText().toString();
            String valor2_String = tv_numero2.getText().toString();

            int valor1_int = Integer.parseInt(valor1_String);
            int valor2_int = Integer.parseInt(valor2_String);

            int resultado_int = valor1_int * valor2_int;
            tv_resultado.setText(" = " + resultado_int);

        }
        if (view.getId() == R.id.dividir) {


            String valor1_String = tv_numero1.getText().toString();
            String valor2_String = tv_numero2.getText().toString();

            int valor1_int = Integer.parseInt(valor1_String);
            int valor2_int = Integer.parseInt(valor2_String);

            if (valor2_int != 0) {
                int operacion = valor1_int / valor2_int;
                String resultado = String.valueOf(operacion);
                tv_resultado.setText(resultado);
            } else {
                Toast.makeText(this, "No se puede dividir entre cero", Toast.LENGTH_LONG).show();
            }
        }


    }

    // Método para limpiar la pantalla de datos
    public void Restaurar (View view){
        tv1.setText("0");
        tv_numero1.setText("");
        tv_numero2.setText("");
        tv_signo.setText("vacío");
        tv_resultado.setText("0");


    }
}