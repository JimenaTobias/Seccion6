/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class Usuario {
    private String cuenta;
    private String nombre;
    private String clave;
    private String mail;

    public Usuario(){}
    public Usuario(String cuenta, String nombre, String pass ,String mail) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.mail = mail;
        this.clave = pass;
    }



    public String getCuenta() {
        return cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public String getMail() {
        return mail;
    }
    
    
}
