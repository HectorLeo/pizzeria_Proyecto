package clases;



public abstract class Productos {

    private String NombrePro;

    private float Precio;
     
    public Productos(String NombrePro, float Precio){
        this.NombrePro=NombrePro;
        this.Precio=Precio;
    }
    
    public String getnombrepro(){
        return NombrePro;
    
    }
     public void setnombrepro(String NombrePro){
        this.NombrePro=NombrePro;
    
    }
     public float getprecio(){
        return Precio;
    
    }
     public void setprecio(float Precio){
        this.Precio=Precio;
    
    }
}
