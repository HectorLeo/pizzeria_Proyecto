package clases;



public abstract class Persona {

    private String Nom_per;

    private String Tel_per;

    private String Direccion_per;
    
    public Persona(String Nom_per, String Tel_per, String Direccion_per){
        this.Nom_per=Nom_per;
        this.Tel_per=Tel_per;
        this.Direccion_per=Direccion_per;
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
}
