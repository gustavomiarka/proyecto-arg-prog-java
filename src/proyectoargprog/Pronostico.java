
package proyectoargprog;

import static proyectoargprog.ResultadoEnum.EMPATE;
import static proyectoargprog.ResultadoEnum.GANA_EQUIPO_1;
import static proyectoargprog.ResultadoEnum.GANA_EQUIPO_2;

/**
 *
 * @author gustavo
 */
public class Pronostico {
    
    public static final String SEPARATOR = ",";
    ResultadoEnum resultado;
    

    public void calcularPuntajePronostico(int ganador) {
        this.resultado = switch (ganador) {
            case 1 -> GANA_EQUIPO_1;
            case 2 -> GANA_EQUIPO_2;
            default -> EMPATE;
        };
    }
}
