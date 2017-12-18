package clases;

public class Cliente extends Persona {

    
    
    private int id;
    private String Nom_per, Direccion_per, Tel_per;
    
    
    public Cliente(String Nom_per, String Tel_per, String Direccion_per) {
        super(Nom_per, Tel_per, Direccion_per);
    }

    public void Cliente(int Id, String NombreC, String Direccion, String Telefono) {
        
        this.id = Id;
        this.Nom_per = NombreC;
        this.Direccion_per = Direccion;
        this.Tel_per = Telefono;
    }
    

    public String getnom_per(){
        return Nom_per;
    
    }
     public void setnom_per(String Nom_per){
        this.Nom_per=Nom_per;
    
    }
     
     public String gettel_per(){
        return Tel_per;
    }
     public void settel_per(String Tel_per){
         this.Tel_per=Tel_per;
     }
    public String getDireccion_per() {
        return Direccion_per;
    }

    public void setdireccion_per(String Direccion_per) {
        this.Direccion_per = Direccion_per;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
