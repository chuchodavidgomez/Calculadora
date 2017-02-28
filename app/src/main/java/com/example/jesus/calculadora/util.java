package com.example.jesus.calculadora;


import java.util.Stack;

public class util {
    String subOperacion="",operacion="";
    Stack pila = new Stack();

    public util()
    {

    }

    public String retornaOpe(String ope){
        String result = "";

        for(int i = 0; i<ope.length(); i++){
            if(Character.isDigit(ope.charAt(i))||ope.charAt(i)=='.'){
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

    public void reconocePila(){
        Stack pila2 = new Stack();
        float numero= 0;
        while(!pila.empty()){
            switch (pila.peek().toString()) {
                case "+":
                    pila.pop();
                    pila2.push((suma(Float.parseFloat(pila.pop().toString()),numero))+"");
                    numero = 0;
                    break;
                case "-":
                    pila.pop();
                    pila2.push((resta(Float.parseFloat(pila.pop().toString()),numero))+"");
                    numero = 0;
                    break;
                case "*":
                    pila.pop();
                    pila2.push((multiplicar(Float.parseFloat(pila.pop().toString()),numero))+"");
                    numero = 0;
                    break;
                case "/":
                    pila.pop();
                    pila2.push((dividir(Float.parseFloat(pila.pop().toString()),numero))+"");
                    numero = 0;
                    break;
                case "^":
                    pila.pop();
                    pila2.push((potencia(Float.parseFloat(pila.pop().toString()),numero))+"");
                    numero = 0;
                    break;
                case "√":
                    pila2.push(raiz(numero)+"");
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

    public float suma(float num1,float num2 ){
        return num1+num2;
    }

    public float resta(float num1,float num2 ){
        return num1-num2;
    }

    public float dividir(float num1,float num2 ){
        return num1/num2;
    }

    public float multiplicar(float num1,float num2 ){
        return num1*num2;
    }

    public float potencia(float num1,float num2 ){
        return (float) Math.pow(num1,num2);
    }

    public float raiz(float num1 ){
        return (float) Math.sqrt(num1);
    }
}
