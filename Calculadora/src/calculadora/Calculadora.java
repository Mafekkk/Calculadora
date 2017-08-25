package calculadora;


public class Calculadora {
    float operando1=1;
    float operando2=0;
    float resultado;
    
    public float sumar (){
        resultado=operando1 + operando2;
        return resultado;
    }
    public float restar(){
        resultado=operando1-operando2;
        return resultado;
    }
    public float multiplicar (){
        resultado=operando1*operando2;
        return resultado;
    }
    public float dividir (){
        if(operando2==0){
            return 0;
        }
        else{
            resultado=operando1/operando2;
            return resultado;
        }
        
    }
}
