package edu.upc.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvResult;
    float numero1 = 0.0f;
    float numero2 = 0.0f;
    String operacion = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult = findViewById(R.id.tvResult);

    }

    public void EscribirSiete(View view) {
        numero1 = Float.parseFloat(tvResult.getText().toString());
        if(numero1 == 0.0f){
            tvResult.setText("7");

        }
        else{
            tvResult.setText(tvResult.getText() + "7");
        }
    }

    public void EscribirOcho(View view) {
        numero1 = Float.parseFloat(tvResult.getText().toString());
        if(numero1 == 0.0f){
            tvResult.setText("8");

        }
        else{
            tvResult.setText(tvResult.getText() + "8");
        }
    }

    public void LimpiarResultado(View view) {
        tvResult.setText("0");
        numero1 = 0.0f;
        numero2 = 0.0f;
        operacion= "";
    }

    public void OperacionDividir(View view) {
        numero1 = Float.parseFloat(tvResult.getText().toString());
        operacion = "/";
        tvResult.setText("0");

    }

    public void MostrarResultado(View view) {
        numero2 = Float.parseFloat(tvResult.getText().toString());
        if(operacion.equals("/")){
            if(numero2 == 0.0f){
                tvResult.setText("0");
                Toast.makeText(this, "Operació no vàlida", Toast.LENGTH_LONG).show();
            }
            else{
                float result = numero1 / numero2;
                tvResult.setText(result + "");
            }
        }
        if(operacion.equals("+")){
            float result = numero1 + numero2;
            tvResult.setText(result + "");
        }
        if(operacion.equals("*")){
            float result = numero1 * numero2;
            tvResult.setText(result + "");
        }
        if(operacion.equals("-")){
            float result = numero1 - numero2;
            tvResult.setText(result + "");
        }
        numero1 = 0.0f;
        numero2 = 0.0f;
        operacion= "";
    }

    public void EscribirNueve(View view) {
        numero1 = Float.parseFloat(tvResult.getText().toString());
        if(numero1 == 0.0f){
            tvResult.setText("9");

        }
        else{
            tvResult.setText(tvResult.getText() + "9");
        }
    }

    public void EscribirCuatro(View view) {
        numero1 = Float.parseFloat(tvResult.getText().toString());
        if(numero1 == 0.0f){
            tvResult.setText("4");

        }
        else{
            tvResult.setText(tvResult.getText() + "4");
        }
    }

    public void EscribirCinco(View view) {
        numero1 = Float.parseFloat(tvResult.getText().toString());
        if(numero1 == 0.0f){
            tvResult.setText("5");

        }
        else{
            tvResult.setText(tvResult.getText() + "5");
        }
    }

    public void EscribirSeis(View view) {
        numero1 = Float.parseFloat(tvResult.getText().toString());
        if(numero1 == 0.0f){
            tvResult.setText("6");

        }
        else{
            tvResult.setText(tvResult.getText() + "6");
        }
    }

    public void EscribirUno(View view) {
        numero1 = Float.parseFloat(tvResult.getText().toString());
        if(numero1 == 0.0f){
            tvResult.setText("1");

        }
        else{
            tvResult.setText(tvResult.getText() + "1");
        }
    }

    public void EscribirDos(View view) {
        numero1 = Float.parseFloat(tvResult.getText().toString());
        if(numero1 == 0.0f){
            tvResult.setText("2");

        }
        else{
            tvResult.setText(tvResult.getText() + "2");
        }
    }

    public void EscribirTres(View view) {
        numero1 = Float.parseFloat(tvResult.getText().toString());
        if(numero1 == 0.0f){
            tvResult.setText("3");

        }
        else{
            tvResult.setText(tvResult.getText() + "3");
        }
    }

    public void EscribirCero(View view) {
        numero1 = Float.parseFloat(tvResult.getText().toString());
        if(numero1 == 0.0f){
            tvResult.setText("0");

        }
        else{
            tvResult.setText(tvResult.getText() + "0");
        }
    }

    public void OperacionMultiplicar(View view) {
        numero1 = Float.parseFloat(tvResult.getText().toString());
        operacion = "*";
        tvResult.setText("0");
    }

    public void OperacionResta(View view) {
        numero1 = Float.parseFloat(tvResult.getText().toString());
        operacion = "-";
        tvResult.setText("0");
    }

    public void OperacionSuma(View view) {
        numero1 = Float.parseFloat(tvResult.getText().toString());
        operacion = "+";
        tvResult.setText("0");
    }
}