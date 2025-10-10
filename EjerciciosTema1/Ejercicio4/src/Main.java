/*Ejercicio 4: Variables con nombres descriptivos
Crea un programa que simule la información de un libro usando variables con nombres descriptivos. Muestra toda la información del libro en la consola.
Ejemplo de salida por consola:
Título: Don Quijote de la Mancha */


public class Main {
    public static void main(String[] args) {
        String title = "1984" ;
        String author = "George Orwell";
        int year = 1949;
        String publication = "8 de Junio de 1949"; // Aqui lo he hecho un poco redundadnte pero era para marcar la diferencia entre int y String
        int pages = 330;
        Boolean avalible = true;
        Boolean notAvalible = false;



        System.out.println("Titulo del libro: " + title);
        System.out.println("Escrito por: " + author);
        System.out.println("Publicado en el año: " + year);
        System.out.println("Fecha exacta de la publicacion: " + publication);
        System.out.println("Numero de paginas: " + pages);
        System.out.println("Esta disponible en la bibliteca? " + avalible);
        //Aqui he mirado a ver como podia hacer que el true me diera por consola si, y me han dado ternarios, que todavia prefiero no meter y un if
        if (avalible) {// Igual que decir if (avalible == true)
            System.out.println(title + " de " + author + " del " + publication + " si esta disponible");
        } else {
            System.out.println("Lamentablemente " + title + " de " + author + " del " + publication + " no esta disponible");
        }




    }
}
