package com.mycompany.tiendaregaloscasamiento;

public class direccionEnvio {
    
    //Constructor
    public direccionEnvio(String calle, int altura, int piso, char departamento, int cp) {
        this.calle = calle;
        this.altura = altura;
        this.piso = piso;
        this.departamento = departamento;
        this.cp = cp;
    }
    
    //Atributos
    
    private String calle;
    private int altura;
    private int piso;
    private char departamento;
    private int cp;
    
    //Getters y setters

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public char getDepartamento() {
        return departamento;
    }

    public void setDepartamento(char departamento) {
        this.departamento = departamento;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }
    
    
    
    // Métodos
    
    public void validarDireccion(){
    }
   
    
}
