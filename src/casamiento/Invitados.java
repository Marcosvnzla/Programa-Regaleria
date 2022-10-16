package com.mycompany.tiendaregaloscasamiento;
//Para que podamos usar el tipo de dato "Date" hay que importar la librería "Date" con la declaración que está en la siguiente línea
import java.util.Date;

public class Invitados extends Usuario {

    //Constructor heredado
    
    public Invitados(String nombreUsuario, Integer dni, String Apellido, String telefono, String mail) {
        super(nombreUsuario, dni, Apellido, telefono, mail);
    }
    
    //Constructor de clase

    public Invitados(String mensaje, Decimal saldo, String nombreUsuario, Integer dni, String Apellido, String telefono, String mail) {
        super(nombreUsuario, dni, Apellido, telefono, mail);
        this.mensaje = mensaje;
        this.saldo = saldo;
    }
    
    //Atributos de clase
    
    private String mensaje;
    private Decimal saldo;
    
    //Getters y setters

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Decimal getSaldo() {
        return saldo;
    }

    public void setSaldo(Decimal saldo) {
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
