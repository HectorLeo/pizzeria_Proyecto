/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BDD;

import clases.Cliente;

/**
 *
 * @author LEÓN
 */
public class PedidoMostradorDB {
    private ConexionDB conexion;
    
    public PedidoMostradorDB(){
        conexion = new ConexionDB();
        conexion.conexion();
    }
    
    
    public boolean vender(Cliente pedido){
        
        String sql = "INSERT INTO pmostrador (Id, NombreC) VALUES "
                    + "("+conexion.getMaxId("pmostrador")+", "+pedido.getnom_per()+")";
        System.out.println(sql);
        if(conexion.execute(sql) > 0) {
            sql = "UPDATE ptelefono SET Id = "+(pedido.getnom_per())+" WHERE Id = "+pedido.getnom_per();
            conexion.execute(sql);
            return true;
        }
        return false;
    }
}
