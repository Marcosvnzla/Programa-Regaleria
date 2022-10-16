package com.mycompany.tiendaregaloscasamiento;
//Para que podamos usar el tipo de dato "Date" hay que importar la librería "Date" con la declaración que está en la siguiente línea
import java.util.Date;
public class Producto {

    //Constructor
    
    public Producto(Integer codigoProducto, Date fechaFinalizacion, String nombre, String tipo, Decimal precio, String color) {
        this.codigoProducto = codigoProducto;
        this.fechaFinalizacion = fechaFinalizacion;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.color = color;
    }
    
    //Atributos
    
    private Integer codigoProducto;
    private Date fechaFinalizacion;
    private String nombre;
    private String tipo;
    private Decimal precio;
    private String color;

    //Getters y setters
    
    public Integer getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(Integer codigoProducto) {
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

    public Decimal getPrecio() {
        return precio;
    }

    public void setPrecio(Decimal precio) {
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
