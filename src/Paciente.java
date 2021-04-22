/**
 * Clase que se encarga de manejar la ficha del paciente
 * @author Andres de la Roca 20332
 * @version 21/04/2021
 * @since 21/04/2021
 */
public class Paciente implements Comparable<Object>{

    private String nombre;
    private String enfermedad;
    private String prioridad;

    /**
     * Metodo constructor de la clase pacientes, recibe los datos de la ficha del paciente.
     * @param nombre Nombre del paciente.
     * @param enfermedad Enfermedad, lesion o condicion que sufre el paciente.
     * @param prioridad Tipo de prioridad del paciente.
     */
    public Paciente(String nombre, String enfermedad, String prioridad) {
        this.nombre = nombre;
        this.enfermedad = enfermedad;
        this.prioridad = prioridad;
    }

    /**
     * Metodo getter del nombre del paciente.
     * @return Nombre del paciente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo getter de la enfermedad del paciente.
     * @return Enfermedad, lesion o condicion que sufre el paciente.
     */
    public String getEnfermedad() {
        return enfermedad;
    }

    /**
     * Metodo getter del tipo de prioridad del paciente.
     * @return Tipo de prioridad.
     */
    public String getPrioridad() {
        return prioridad;
    }

    /**
     * String de la ficha del paciente.
     * @return String de la informacion.
     */
    public String toString() {
        return getNombre() + "," + getEnfermedad() + "," + getPrioridad();
    }

    /**
     * Metodo compareTo.
     * @param temp Otros objetos tipo paciente.
     * @return Integer dependiendo del orden de prioridad.
     */
    @Override
    public int compareTo(Object temp) {
        Paciente other = (Paciente) temp;

        return prioridad.compareTo(other.getPrioridad());

    }
}
