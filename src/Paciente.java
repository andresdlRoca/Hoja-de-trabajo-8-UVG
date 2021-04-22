
/**
 * @author Andres de la Roca 20332
 * @version 21/04/2021
 * @since 21/04/2021
 * Clase que se encarga de manejar la ficha del paciente
 */
public class Paciente implements Comparable<Object>{

    private String nombre;
    private String enfermedad;
    private String prioridad;

    public Paciente(String nombre, String enfermedad, String prioridad) {
        this.nombre = nombre;
        this.enfermedad = enfermedad;
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public String toString() {
        return getNombre() + "," + getEnfermedad() + "," + getPrioridad();
    }

    @Override
    public int compareTo(Object temp) {
        Paciente other = (Paciente) temp;

        return prioridad.compareTo(other.getPrioridad());

    }
}
