package com.mycompany.tiendaregaloscasamiento;
//Para que podamos usar el tipo de dato "Date" hay que importar la librería "Date" con la declaración que está en la siguiente línea
import java.util.Date;

public class Invitados extends Usuario {

    //Constructor heredado
    
    public Invitados(String nombreUsuario, int dni, String Apellido, int telefono, String mail) {
        super(nombreUsuario, dni, Apellido, telefono, mail);
    }
    
    //Constructor de clase

    public Invitados(String mensaje, double saldo, String nombreUsuario, int dni, String Apellido, int telefono, String mail) {
        super(nombreUsuario, dni, Apellido, telefono, mail);
        this.mensaje = mensaje;
        this.saldo = saldo;
    }
    
    //Atributos de clase
    
    private String mensaje;
    private double saldo;
    
    //Getters y setters

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    //Métodos
    
    public void guardarMensaje(){
    }
    
    public void realizarPago(){
    }
    
    public void elegirRegalo(){
    }    
    
}
