public class Empleado extends Persona {

    private String CURP;

    private String RFC;

    private String Tel_Empleado;

    private String Puesto;

    private float Sueldo;

    private String Horario;

    public Empleado(String Nom_per, String Tel_per, String Direccion_per) {
        super(Nom_per, Tel_per, Direccion_per);
    }
}
