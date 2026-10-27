import java.util.Scanner;

public class Main {
    void main(){

        Scanner llegir = new Scanner(System.in);


        int[] numerosentrada = new int[8];
        int sumavalorscomptats = 0;
        int valorcomptar = 0;


        for (int i = 0; i < numerosentrada.length; i++) {
            System.out.println("Introdueix el número " + (i+1));
            numerosentrada[i] = llegir.nextInt();
        }

        System.out.println("Quin valor vols comptar?");
        valorcomptar = llegir.nextInt();

        for (int i = 0; i < numerosentrada.length; i++) {
            if (numerosentrada[i] == valorcomptar) {
                System.out.println("S'ha trobat el valor " + valorcomptar + " a la posició " + i);
                sumavalorscomptats++;
            }
        }

        if (sumavalorscomptats < 1){
            System.out.println("Cap coincidència");
        } else
            System.out.println("S'ha trobat el valor " + valorcomptar + " un total de " + sumavalorscomptats + " vegades.");
    }
}
