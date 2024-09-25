package Clases;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sala de Sistemas
 */
public class Usuario {
    private String nombre;
    private String email;
    private String username;
    private String clave;
    
    
    

    // Constructor
    public Usuario(String nombre, String email, String username, String clave) {
        this.nombre = nombre;
        this.email = email;
        this.username = username;
        this.clave = clave;
    }
    
    // Método para validar el usuario
    public boolean ValidarUsuario(String username, String clave) {
        return this.username.equals(username) && this.clave.equals(clave);
    }

    // Métodos de acceso
    
    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
    
    public String getClave() {
        return clave;
    }

    public String getUsername() {
        return username;
    }

  
    
    
    
}
