public class Estudiante {
    // ATRIBUTOS
    private String nombres;
    private String apellidos;
    private int numDocumento;

    //METODOS
    public Estudiante(String nombres, String apellidos, int numDocumento) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numDocumento = numDocumento;
    }

    // GET
    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getNumDocumento() {
        return numDocumento;
    }
}
