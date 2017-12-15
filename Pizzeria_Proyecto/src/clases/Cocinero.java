package clases;

public class Cocinero extends  Empleado {
     private boolean continuar;
    private boolean disponible= true;
    public Cocinero(String Nom_per, String Tel_per, String Direccion_per) {
        super(Nom_per, Tel_per, Direccion_per);
    }

    public void Cocinar() {
        while(disponible == true){
            try{
                wait(100);
                
            }catch(InterruptedException e){
                
            }
        }
        //numMjs= msjs;
        //msj="Mensaje";
        disponible = true;
         notifyAll();
    }

    public void Empacar() {
    }

    public void Notificar_pizza() {
         continuar= false;
    }
}
