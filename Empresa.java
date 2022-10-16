package com.mycompany.tiendaregaloscasamiento;
import java.util.List;
import javax.swing.text.html.ListView;

public class Empresa {

    public Empresa(Integer cuit, String razonSocial, List<Usuario> listaUsuarios,List<Producto> listaProductos) {
        this.cuit = cuit;
        this.razonSocial = razonSocial;
    }
    
    //Atributos
    private List<Usuario> listaUsuarios = new List<Usuario>();
    private Integer cuit;
    private String razonSocial;
    private List<Producto> listaProductos = new List<Producto>();

    //Getters y setters    
    public List<Usuario> getUsuarios() {
        return this.ListaUsuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.listaUsuarios = usuarios;
    }

    public List<Producto> getProductos() {
        return this.listaProductos;
    }

    public void setProductos(List<Producto> productos) {
        this.listaProductos = productos;
    }

    public Integer getCuit() {
        return cuit;
    }

    public void setCuit(Integer cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    
    //Métodos
    public void chequearDuplicados(){ //se refiere a duplicados de productos?
    }
    
    public void altaUsuario(){
    }
    
    public void bajaUsuario(){
    }
    
    public void editarUsuario(){
    }
}
