import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main (String a []) {
        ArrayList<String> listLetra = new ArrayList<String>();
        ingresaLetra(listLetra);
        vocalAndConsonat(listLetra);
    }

    public static void ingresaLetra(List<String>listaLetra){
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        while (contador < 10) {
            contador++;
            System.out.print("Ingrese letra " + contador + " :");
            listaLetra.add(scanner.nextLine());
        }
    }

    public static void vocalAndConsonat(List<String>listaLetra){
        //calcula y imprime por pantalla
        System.out.print("Desde la funcion vocal"+listaLetra);
    }
}