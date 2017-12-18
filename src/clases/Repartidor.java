package clases;



public class Repartidor extends Empleado {

    private String Licencia_conducir;

    public Repartidor(String Nom_per, String Tel_per, String Direccion_per) {
        super(Nom_per, Tel_per, Direccion_per);
    }
     public String getlicencia_conducir(){
        return Licencia_conducir;
    
    }
     public void setlicencia_conducir(String Licencia_conducir){
        this.Licencia_conducir=Licencia_conducir;
    
    }

    public void Entregar_pizza() {
    }

    public void Cobrar() {
    }

    public void Devolver_cambio() {
    }

    public void Informar_Entrega() {
    }

    public void Entregar_monto() {
    }

    public void Entregar_Tiket() {
    }
}
