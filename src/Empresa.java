package com.mycompany.tiendaregaloscasamiento;

public class Empresa {

    //falta agregar al constructor los objetos de Usuario y de ListaProducto
    public Empresa(int cuit, String razonSocial) {
        this.cuit = cuit;
        this.razonSocial = razonSocial;
    }
    
    //Atributos
    
    //new Uusario nombreUsuario;  
    private int cuit;
    private String razonSocial;
    // agregar objetivo de listaProductos;

    //Getters y setters    
    
    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    
    //Métodos
    
    public void chequearDuplicados(){
    }
    
    public void altaUsuario(){
    }
    
    public void bajaUsuario(){
    }
    
    public void editarUsuario(){
    }
    
}
