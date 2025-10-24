import java.util.Scanner;

public class Presentacion {

    private Scanner scannerTeclado;
    public void presentacion(){

        scannerTeclado = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String name = scannerTeclado.next();
        System.out.println("Introduce tu edad");
        int age = scannerTeclado.nextInt();
        System.out.println("Introduce el nombre de tu ciudad");
        String city = scannerTeclado.next();

        System.out.println("Hola! Me llamo "+name + " tengo " + age + " años " + "y vivo en " + city);


    }
}
