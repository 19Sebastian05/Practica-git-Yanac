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
        int countVocal = 0;
        int countConsonante = 0;
        
        for (int i  = 0; i < listaLetra.size(); i++) {
            String charv = listaLetra.get(i);
            switch (charv) {
                case "a": 
                    countVocal++;
                    break;
                case "e":
                    countVocal++;
                    break;
                case "i":
                    countVocal++;
                    break;
                case "o":
                    countVocal++;
                    break;
                case "u":
                    countVocal++;
                    break;
                default:
                    countConsonante++;
                    break;
            }
        }
        
        System.out.println("Cantidad de vocales: " + countVocal);
        System.out.println("Cantidad de Consonantes: " + countConsonante);
        
    }
}