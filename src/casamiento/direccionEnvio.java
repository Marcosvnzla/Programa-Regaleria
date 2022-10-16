package com.mycompany.tiendaregaloscasamiento;

public class direccionEnvio {
    
    //Constructor
    public direccionEnvio(String calle, Integer altura, int piso, char departamento, int cp) {
        this.calle = calle;
        this.altura = altura;
        this.piso = piso;
        this.departamento = departamento;
        this.cp = cp;
    }
    
    //Atributos
    
    private String calle;
    private Integer altura;
    private Integer piso;
    private char departamento;
    private Integer cp;
    
    //Getters y setters

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public Integer getPiso() {
        return piso;
    }

    public void setPiso(Integer piso) {
        this.piso = piso;
    }

    public char getDepartamento() {
        return departamento;
    }

    public void setDepartamento(char departamento) {
        this.departamento = departamento;
    }

    public Integer getCp() {
        return cp;
    }

    public void setCp(Integer cp) {
        this.cp = cp;
    }
    
    
    
    // Métodos
    
    public void validarDireccion(){
    }
   
    
}
