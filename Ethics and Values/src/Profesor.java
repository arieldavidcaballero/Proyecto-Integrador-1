public class Profesor {

    // ATRIBUTOS
    private String nombres;
    private String apellidos;
    private int numDocumento;
    private int edad;
    private int contraseña;

    // METODOS
    public Profesor(String nombres, String apellidos, int numDocumento, int edad, int contraseña) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numDocumento = numDocumento;
        this.edad = edad;
        this.contraseña = contraseña;
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

    public int getEdad() {
        return edad;
    }

    public int getContraseña() {
        return contraseña;
    }
}
