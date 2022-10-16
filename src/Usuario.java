package com.mycompany.tiendaregaloscasamiento;

public class Usuario {
    
    //Constructor

    public Usuario(String nombreUsuario, int dni, String Apellido, int telefono, String mail) {
        this.nombreUsuario = nombreUsuario;
        this.dni = dni;
        this.Apellido = Apellido;
        this.telefono = telefono;
        this.mail = mail;
    }    
    
    //Atributos
    
    private String nombreUsuario;
    private int dni;
    private String Apellido;
    private int telefono;
    private String mail;

    //Getters y Setters
    
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    //Metodos
    
    public void chquearDuplicados(){
    
    }
    
    public void altaUsuarios(){
    
    }
    
    public void bajaUsuarios(){
    
    }
    
    public void editarUsuario(){
    
    }
    
}
