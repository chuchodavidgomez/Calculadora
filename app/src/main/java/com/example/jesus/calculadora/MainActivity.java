package com.example.jesus.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    Stack pila;
    String operacion="",subOperacion="";
    TextView pantalla;
    util operaciones;
    Button btnUno,btnDos,btnTres,btnCuatro,btnCinco,btnSeis,btnSiete,btnOcho,btnNueve,btnCero,
            btnBorrar,btnBorrarTod,btnParenIzq,btnParenDer,btnSuma,btnResta,btnMulti,btnDivi,
            btnPunto,btnPoten,btnRaiz,btnIgual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operaciones = new util();
        pantalla = (TextView)findViewById(R.id.pantalla);
        btnUno = (Button)findViewById(R.id.btnUno);
        btnDos = (Button)findViewById(R.id.btnDos);
        btnTres = (Button)findViewById(R.id.btnTres);
        btnCuatro = (Button)findViewById(R.id.btnCuatro);
        btnCinco = (Button)findViewById(R.id.btnCinco);
        btnSeis = (Button)findViewById(R.id.btnSeis);
        btnSiete = (Button)findViewById(R.id.btnSiete);
        btnOcho = (Button)findViewById(R.id.btnOcho);
        btnNueve = (Button)findViewById(R.id.btnNueve);
        btnCero = (Button)findViewById(R.id.btnCero);
        btnBorrar = (Button)findViewById(R.id.btnBorrar);
        btnBorrarTod = (Button)findViewById(R.id.btnBorrarTodo);
        btnParenIzq = (Button)findViewById(R.id.btnParenIzq);
        btnParenDer = (Button)findViewById(R.id.btnParenDere);
        btnSuma = (Button)findViewById(R.id.btnSumar);
        btnResta = (Button)findViewById(R.id.btnRestar);
        btnMulti = (Button)findViewById(R.id.btnMultiplicar);
        btnDivi = (Button)findViewById(R.id.btnDividir);
        btnPunto = (Button)findViewById(R.id.btnPunto);
        btnPoten = (Button)findViewById(R.id.btnPotencia);
        btnRaiz = (Button)findViewById(R.id.btnRaiz);
        btnIgual = (Button)findViewById(R.id.btnResultado);
        pila = new Stack();

        btnUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion = operacion+"1";
                actulizarPantalla();
            }
        });

        btnDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion = operacion+"2";
                actulizarPantalla();
            }
        });

        btnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion = operacion+"3";
                actulizarPantalla();
            }
        });

        btnCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion = operacion+"4";
                actulizarPantalla();
            }
        });

        btnCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion = operacion+"5";
                actulizarPantalla();
            }
        });

        btnSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion = operacion+"6";
                actulizarPantalla();
            }
        });

        btnSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion = operacion+"7";
                actulizarPantalla();
            }
        });

        btnOcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion = operacion+"8";
                actulizarPantalla();
            }
        });

        btnNueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion = operacion+"9";
                actulizarPantalla();
            }
        });

        btnCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion = operacion+"0";
                actulizarPantalla();
            }
        });

        btnPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion = operacion+".";
                actulizarPantalla();
            }
        });

        btnParenIzq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion = operacion+"(";
                actulizarPantalla();
            }
        });

        btnParenDer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion = operacion+")";
                actulizarPantalla();
            }
        });

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion = operacion+"+";
                actulizarPantalla();
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion = operacion+"-";
                actulizarPantalla();
            }
        });

        btnDivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion = operacion+"/";
                actulizarPantalla();
            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion = operacion+"x";
                actulizarPantalla();
            }
        });

        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion = operacion.substring(0,operacion.length()-1);
                actulizarPantalla();
            }
        });

        btnBorrarTod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion = "";
                actulizarPantalla();
            }
        });

        btnPoten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion = operacion+"^";
                actulizarPantalla();
            }
        });

        btnRaiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion = operacion+"√";
                actulizarPantalla();
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operacion = operaciones.retornaOpe(operacion);
                actulizarPantalla();
            }
        });


    }

    public void actulizarPantalla() {
        pantalla.setText(operacion);
    }
    /*
    public void reconocePila(){
        String valor = pila.peek().toString();
        Stack pila2 = new Stack();
        boolean salir = false;
        float numero= 0;
        while(!pila.empty()&&!salir){
            switch (pila.peek().toString()) {
                case "+":
                    pila.pop();
                    pila2.push((Float.parseFloat(pila.peek().toString())+numero)+"");
                    pila.pop();
                    numero = 0;
                    break;
                case "-":
                    pila.pop();
                    pila2.push((Float.parseFloat(pila.peek().toString())-numero)+"");
                    pila.pop();
                    numero = 0;
                    break;
                case "*":
                    pila.pop();
                    pila2.push((Float.parseFloat(pila.peek().toString())*numero)+"");
                    pila.pop();
                    numero = 0;
                    break;
                case "/":
                    pila.pop();
                    pila2.push((Float.parseFloat(pila.peek().toString())/numero)+"");
                    pila.pop();
                    numero = 0;
                    break;
                case "^":
                    pila.pop();
                    pila2.push(Math.pow(Float.parseFloat(pila.peek().toString()),numero)+"");
                    pila.pop();
                    numero = 0;
                    break;
                case "√":
                    pila2.push(Math.sqrt(numero)+"");
                    pila.pop();
                    numero = 0;
                    break;
                default:
                    numero = Float.parseFloat(pila.pop().toString());
                    break;
            }
        }

        while(!pila2.empty()){
            pila.push(pila2.pop().toString());

        }

    }


    public String retornaOpe(String ope){
        String result = "";
        for(int i= 0;i<ope.length();i++){
            if(isNumeric(ope.charAt(i)+"")||ope.charAt(i)=='.'){
                subOperacion = subOperacion + ope.charAt(i);
                if(i == ope.length()-1){
                    pila.push(subOperacion);
                    subOperacion = "";
                }
            }
            else
            {
            if(!subOperacion.equals("")){
                pila.push(subOperacion);
            }
            subOperacion = "";
                switch (ope.charAt(i)) {
                    case '+':
                        if(i == 0) {
                            subOperacion = "+";
                        }
                        else
                        {
                            if(ope.charAt(i-1)=='+'||ope.charAt(i-1)=='-'){
                                subOperacion = "+";
                            } else {
                                pila.push("+");
                            }
                        }
                        break;
                    case '-':
                        if(i == 0) {
                            subOperacion = "-";
                        }
                        else
                        {
                            if(ope.charAt(i-1)=='+'||ope.charAt(i-1)=='-'){
                                subOperacion = "-";
                            } else {
                                pila.push("-");
                            }
                        }
                        break;
                    case 'x':
                        pila.push("*");
                        break;
                    case '/':
                        pila.push("/");
                        break;
                    case '^':
                        pila.push("^");
                        break;
                    case '√':
                        pila.push("√");
                        break;
                    default:
                        break;
                }
            }
        }
        reconocePila();
        result = pila.pop().toString();
        return result;
    }
*/
}
