/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Guillermo
 */
public class SesionUsuario {
    
    public static SesionUsuario instancia;
      int idUsuario;
    String usuario;
    String clave;
    int idTipoUsuario;

    public static SesionUsuario getInstancia() {
      
        if(instancia == null){
        instancia = new SesionUsuario();
        }
        return instancia;
        
    }

    public static void setInstancia(SesionUsuario instancia) {
        SesionUsuario.instancia = instancia;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public int getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(int idTienda) {
        this.idTienda = idTienda;
    }
    int idTienda;
    

    
  

}
