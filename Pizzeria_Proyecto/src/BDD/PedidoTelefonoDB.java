/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BDD;

import clases.Cliente;

/**
 *
 * @author snakt
 */
public class PedidoTelefonoDB {
    
    private ConexionDB conexion;
    
    public PedidoTelefonoDB(){
        conexion = new ConexionDB();
        conexion.conexion();
    }
    
    
    public boolean vender(Cliente pedido){
        
        String sql = "INSERT INTO ptelefono (Id, NombreC, Telefono, Direccion) VALUES "
                    + "("+conexion.getMaxId("ptelefono")+", "+pedido.getnom_per()+", "+pedido.gettel_per()+"," +pedido.getDireccion_per()+")";
        System.out.println(sql);
        if(conexion.execute(sql) > 0) {
            sql = "UPDATE ptelefono SET Id = "+(pedido.getnom_per() + pedido.gettel_per()+ pedido.getDireccion_per())+" WHERE Id = "+pedido.getnom_per();
            conexion.execute(sql);
            return true;
        }
        return false;
    }
    
}
