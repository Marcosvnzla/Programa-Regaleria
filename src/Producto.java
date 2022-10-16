package com.mycompany.tiendaregaloscasamiento;
//Para que podamos usar el tipo de dato "Date" hay que importar la librería "Date" con la declaración que está en la siguiente línea
import java.util.Date;
public class Producto {

    //Constructor
    
    public Producto(int codigoProducto, Date fechaFinalizacion, String nombre, String tipo, double precio, String color) {
        this.codigoProducto = codigoProducto;
        this.fechaFinalizacion = fechaFinalizacion;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.color = color;
    }
    
    //Atributos
    
    private int codigoProducto;
    private Date fechaFinalizacion;
    private String nombre;
    private String tipo;
    private double precio;
    private String color;

    //Getters y setters
    
    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public Date getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Date fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    //Métodos
    
    public void validarProducot(){
    }
    
    public void validarPrecio(){
    }
    
}
