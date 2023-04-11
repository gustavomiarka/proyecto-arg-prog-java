
package proyectoargprog;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static proyectoargprog.ProyectoArgProg.SEPARATOR;
import static proyectoargprog.ResultadoEnum.EMPATE;
import static proyectoargprog.ResultadoEnum.GANA_EQUIPO_1;
import static proyectoargprog.ResultadoEnum.GANA_EQUIPO_2;

/**
 *
 * @author gusta
 */
public class Partido {

    Equipo equipo1;
    Equipo equipo2;
    ResultadoEnum resultado;
    public int puntosEquipo1;
    public int puntosEquipo2;
    private final int golesEquipo1;
    private final int golesEquipo2;
    
    
    String[][] arr = new String [3][4];
    BufferedReader br = null;
    

    public Partido(String equipo1, String equipo2, int golesEquipo1, int golesEquipo2) {
        this.equipo1 = new Equipo(equipo1);
        this.equipo2 = new Equipo(equipo2);
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
    }

    public int getGolesEquipo1() {
        return golesEquipo1;
    }


    public int getGolesEquipo2() {
        return golesEquipo2;
    }
    
//    public void control() throws IOException{
//        try{
//            br = new BufferedReader(new FileReader("C:\\Users\\gusta\\Documents\\Argentina_programa\\Desarrollador_Java\\resultados.csv"));
//            String line = br.readLine();
//
//            if (line != null) {
//                for (String[] arr1 : arr) {
//                    String[] line2 = line.split(SEPARATOR);
//                    line = br.readLine();
//                    System.arraycopy(line2, 0, arr1, 0, arr1.length);
//                }
//            }
//        }catch (IOException e) {
//            System.out.println("Hubo un error inesperado");
//        }finally {
//            if (br != null) {
//                br.close();
//            }
//        }
//    }
    
    
    public void decidirResultado() {
        
        System.out.println("Partido entre " + equipo1.getNombre().toUpperCase() + " y " + equipo2.getNombre().toUpperCase());
        if (getGolesEquipo1() > getGolesEquipo2()) {
            System.out.println("Resultado : " + GANA_EQUIPO_1 + ",(" + equipo1.getNombre().toUpperCase()+ ")");
            System.out.print("Puntos : ");
            System.out.println(puntosEquipo1 += 1);
            
        } else if (getGolesEquipo1() < getGolesEquipo2()) {
            System.out.println("Resultado : " + GANA_EQUIPO_2 + ",(" + equipo2.getNombre().toUpperCase()+ ")" );
            System.out.print("Puntos : ");
            System.out.println( puntosEquipo2 += 1);
            
        } else {
            
            System.out.println("Resultado : " + EMPATE );
            System.out.print("No se suman puntos. ");
            
        }
        
    }

}
