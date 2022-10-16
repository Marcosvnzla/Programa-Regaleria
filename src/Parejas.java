package com.mycompany.tiendaregaloscasamiento;
//Para que podamos usar el tipo de dato "Date" hay que importar la librería "Date" con la declaración que está en la siguiente línea
import java.util.Date;

public class Parejas extends Usuario {
    
    //Constructor
    public Parejas(String nombre, String nombreUsuario, int dni, String Apellido, int telefono, String mail) {
        super(nombreUsuario, dni, Apellido, telefono, mail);
        this.nombre = nombre;
    }
    
    //Atributos
    
    // declarar objeto Dirección de la clase Direccion_Envio
    private String nombre;
    // declarar objeto regalos de la clase Lista_regalos
    
    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Metodos
    
    public void crearListaRegalos(){
    }
    
    public Date declararFechaFinalizacion(){
        return null;
    }    
}
