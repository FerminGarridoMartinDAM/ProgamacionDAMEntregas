import java.util.Scanner;

public class Calculadora {


    private Scanner lecturaTeclado;


    public void caluculoCompleto(){
        lecturaTeclado= new Scanner(System.in);
        System.out.println("Este programa es una calculadora.");
        System.out.println("A continuacion le pediremos que inserte 2 numeros y realizaremos unos calculos. Pueden ser numeros decimales.");
        System.out.println("Indique el primer numero para operar y pulse enter ");
        int op1 = lecturaTeclado.nextInt();
        System.out.println("Indique el segundo numero para operar y pulse enter");
        int op2 = lecturaTeclado.nextInt();
        System.out.println("El primer numero es: " + op1);
        System.out.println("El segundo numero es: " + op2);
        int resultadoSuma = op1 + op2;
        int resultadoResta = op1 + op2;
        int resultadoMultiplicacion = op1 * op2;
        float resultadoDivision = (float)op1 / op2;
        float restoDivision = (float)op1 % op2;
        System.out.println("La suma de " + op1+ " + " + op2 + " es igual a: " + resultadoSuma);
        System.out.println("La resta de " + op1+ " + " + op2 + " es igual a: " + resultadoResta);
        System.out.println("La multiplicacion de " + op1+ " x " + op2 + " es igual a: " + resultadoMultiplicacion);
        System.out.println("La division de " + op1+ " entre " + op2 + " es igual a: " + resultadoDivision);
        System.out.println("El resto de la division de " + op1+ " entre " + op2 + " es igual a: " + restoDivision);

    }



}
