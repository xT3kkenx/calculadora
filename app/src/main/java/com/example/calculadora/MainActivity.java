package com.example.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    int valor1;
    int valor2;
    int valorresul;
    Double valordivision;

    String verificacionvalor ="";
    String operador ="";

    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    Button bs, br , bm , bd,bi,bc;
    TextView texto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.fondo), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        texto = (TextView) findViewById(R.id.TVR);


        b1 = (Button) findViewById(R.id.boton1);
        b2 = (Button) findViewById(R.id.boton2);
        b3 = (Button) findViewById(R.id.boton3);
        b4 = (Button) findViewById(R.id.boton4);
        b5 = (Button) findViewById(R.id.boton5);
        b6 = (Button) findViewById(R.id.boton6);
        b7 = (Button) findViewById(R.id.boton7);
        b8 = (Button) findViewById(R.id.boton8);
        b9 = (Button) findViewById(R.id.boton9);
        b0 = (Button) findViewById(R.id.boton0);


        bs = (Button) findViewById(R.id.botonS);
        br = (Button) findViewById(R.id.botonR);
        bm = (Button) findViewById(R.id.botonM);
        bd = (Button) findViewById(R.id.botonD);
        bi = (Button) findViewById(R.id.botonResul);
        bc = (Button) findViewById(R.id.botonBorrar);




        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                verificacionvalor = (String) texto.getText();
                if(!(verificacionvalor.equals("resultado"))){
                    //cuando es diferente

                    //
                    texto.setText(verificacionvalor + 1);


                }else {
                    texto.setText("1");

                }


            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verificacionvalor = (String) texto.getText();
                if(!(verificacionvalor.equals("resultado"))){
                    //cuando es diferente

                    //
                    texto.setText(verificacionvalor + 2);


                }else {
                    texto.setText("2");

                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verificacionvalor = (String) texto.getText();
                if(!(verificacionvalor.equals("resultado"))){
                    //cuando es diferente

                    //
                    texto.setText(verificacionvalor + 3);


                }else {
                    texto.setText("3");

                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verificacionvalor = (String) texto.getText();
                if(!(verificacionvalor.equals("resultado"))){
                    //cuando es diferente

                    //
                    texto.setText(verificacionvalor + 4);


                }else {
                    texto.setText("4");

                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verificacionvalor = (String) texto.getText();
                if(!(verificacionvalor.equals("resultado"))){
                    //cuando es diferente

                    //
                    texto.setText(verificacionvalor + 5);


                }else {
                    texto.setText("5");

                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verificacionvalor = (String) texto.getText();
                if(!(verificacionvalor.equals("resultado"))){
                    //cuando es diferente

                    //
                    texto.setText(verificacionvalor + 6);


                }else {
                    texto.setText("6");

                }
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verificacionvalor = (String) texto.getText();
                if(!(verificacionvalor.equals("resultado"))){
                    //cuando es diferente

                    //
                    texto.setText(verificacionvalor + 7);


                }else {
                    texto.setText("7");

                }
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verificacionvalor = (String) texto.getText();
                if(!(verificacionvalor.equals("resultado"))){
                    //cuando es diferente

                    //
                    texto.setText(verificacionvalor + 8);


                }else {
                    texto.setText("8");

                }
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verificacionvalor = (String) texto.getText();
                if(!(verificacionvalor.equals("resultado"))){
                    //cuando es diferente

                    //
                    texto.setText(verificacionvalor + 9);


                }else {
                    texto.setText("9");

                }
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verificacionvalor = (String) texto.getText();
                if(!(verificacionvalor.equals("resultado"))){
                    //cuando es diferente

                    //
                    texto.setText(verificacionvalor + 0);


                }else {
                    texto.setText("0");

                }
            }
        });



        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verificacionvalor = (String) texto.getText();
                operador ="+";
                if(!(verificacionvalor.equals("resultado"))){
                    valor1 = Integer.parseInt(verificacionvalor);
                    //convertimos enteros a valor string
                    texto.setText("");
                    //cuando es diferente

                    //
                    //texto.setText(verificacionvalor + );
                }else {
                    //texto.setText("+");

                }
            }
        });

        br.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //metodo resta
                verificacionvalor = (String) texto.getText();
                operador ="-";
                if (!(verificacionvalor.equals("resultado"))){
                    valor1 = Integer.parseInt(verificacionvalor);
                    texto.setText("");
                }
            }
        });

        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verificacionvalor = (String) texto.getText();
                operador ="*";
                if (!(verificacionvalor.equals("resultado"))){
                    valor1 = Integer.parseInt(verificacionvalor);
                    texto.setText("");
                }
            }
        });

        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verificacionvalor = (String) texto.getText();
                operador = "/";
                if (!(verificacionvalor.equals("resultado"))){
                    valor1 = Integer.parseInt(verificacionvalor);
                    texto.setText("");
                }
            }
        });

        bi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verificacionvalor = (String) texto.getText();
                if(!(verificacionvalor.equals("resultado"))){
                    valor2 = Integer.parseInt(verificacionvalor);
                    //convertimos enteros a valor string
                    switch (operador){
                        case "+":

                            valorresul = valor1+valor2;
                            texto.setText(Integer.toString(valorresul));
                            //texto.setText(valorresul);
                            break;

                        case "-":
                            valorresul = valor1-valor2;
                            texto.setText(Integer.toString(valorresul));
                            break;

                        case "*":
                            valorresul = valor1*valor2;
                            texto.setText(Integer.toString(valorresul));
                            break;
                        case "/":
                            valordivision = (double)valor1/valor2;
                            texto.setText(Double.toString(valordivision));
                            break;

                        default:
                            texto.setText("");
                            break;
                    }
                }
            }
        });

        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText("resultado");
                operador = "";
            }
        });

//DE aqui no pasar
    }
}