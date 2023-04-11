package proyectoargprog;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author gustavo
 */
public class ProyectoArgProg {

    public static final String SEPARATOR = ",";

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = null;
        String[][] arr = new String [3][4];
        
        try {
            br = new BufferedReader(new FileReader("C:\\Users\\gusta\\Documents\\Argentina_programa\\Desarrollador_Java\\resultados.csv"));
            String line = br.readLine();
            if (line != null) {
                for (String[] arr1 : arr) {
                    String[] line2 = line.split(SEPARATOR);
                    line = br.readLine();
                    System.arraycopy(line2, 0, arr1, 0, arr1.length);
                    
                }
                
            }  
        } catch (IOException e) {
            System.out.println("Hubo un error inesperado");
        } finally {
            if (br != null) {
                br.close();
            }
        }
              
        int eq1 = Integer.parseInt(arr[1][1]);
        int eq2 = Integer.parseInt(arr[1][2]);
        
        Partido partido;
        partido = new Partido(arr[1][0], arr[1][3], eq1, eq2);
        Partido partido2 = new Partido("boca", "river", 0, 0);
        
        partido.decidirResultado();
        partido2.decidirResultado();
        
    }

}
