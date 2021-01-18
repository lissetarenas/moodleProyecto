/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author porta
 */
public class Usuario {
    
    String email;
    String pass;
    String name, ap_pat;
    String carrera;
    int id;

    public Usuario() {
    }
    
    

    public Usuario(String email, String pass, String name, String ap_pat, String carrera,  int id) {
        this.email = email;
        this.pass = pass;
        this.name = name;
        this.ap_pat = ap_pat;
        this.carrera = carrera;
        this.id = id;
    }


    
    
    
    
}
