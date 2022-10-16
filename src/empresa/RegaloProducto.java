package com.mycompany.tiendaregaloscasamiento;
import java.util.Date;

public class RegaloProducto {

//Contructor
    public RegaloProducto(Date fechaInicio, Date fechaFin) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    
//Atributos
    
private Date fechaInicio;
private Date fechaFin;

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

//Métodos

public void validarFecha(){

}

}
