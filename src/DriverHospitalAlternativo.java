import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * @author Andres de la Roca 20332
 * @version 21/04/2021
 * @since 21/04/2021
 * Clase Driver alternativa que se encarga de correr el programa de manejo de pacientes.
 */
public class DriverHospitalAlternativo {

    /**
     * Metodo main del Driver alternativo.
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        PriorityQueue<Paciente> queue = new PriorityQueue<Paciente>();
        boolean run = true;

        BufferedReader abc = new BufferedReader(new FileReader("pacientes.txt"));
        List<String> lines = new ArrayList<String>();
        String line = "";
        while((line = abc.readLine()) != null) {

            lines.add(line);

        }
        abc.close();


        String[] data = lines.toArray(new String[]{});
        for (int i = 0; i < data.length; i++) {
            String[] arr = data[i].split(",");

            Paciente paciente1 = new Paciente(arr[0], arr[1], arr[2]);
            queue.add(paciente1);
        }

        while(run) {
            try {
                System.out.println("\n---Sistema de hospital---\n");
                System.out.println("1. Buscar siguiente paciente");
                System.out.println("2. Salir del programa\n");

                int eleccion = scan.nextInt();

                if (eleccion == 1) {
                    Paciente poll = queue.poll();
                    if(poll == null) {
                        System.out.println("Se ha acabado la lista.");
                    } else {
                        System.out.println(poll.toString());
                    }

                } else if (eleccion == 2) {
                    System.out.println("Hasta luego...");
                    run = false;
                } else {
                    System.out.println("Elegiste una opcion invalida, intentalo de nuevo.");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Se ha acabado la lista");
                scan.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Ha seleccionado una opcion invalida.");
                scan.nextLine();
            }
        }
    }

}