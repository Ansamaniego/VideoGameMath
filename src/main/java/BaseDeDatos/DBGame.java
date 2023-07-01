
package BaseDeDatos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class DBGame {

    public LinkedList<String> getListaUsuarios() {
        return listaUsuarios;
    }

    public LinkedList<String> getListaNombres() {
        return listaNombres;
    }

    public LinkedList<String> getListaCorreos() {
        return listaCorreos;
    }

    public LinkedList<String> getListaContraseñas() {
        return listaContraseñas;
    }

    public LinkedList<String> getListaConfirmaciones() {
        return listaConfirmaciones;
    }
    // private ArrayList<String> listaUsuarios = new ArrayList<String>();
    
    private LinkedList<String> listaUsuarios = new LinkedList<String>();
    private LinkedList<String> listaNombres = new LinkedList<String>();
    private LinkedList<String> listaCorreos = new LinkedList<String>();
    private LinkedList<String> listaContraseñas = new LinkedList<String>();
    private LinkedList<String> listaConfirmaciones = new LinkedList<String>();
    
    public void agregarUsuario(String usuario){
        listaUsuarios.addLast(usuario);
    }
    
    public void agregarNombre(String nombre){
        listaNombres.addLast(nombre);
    }
    
    public void agregarCorreo(String correo){
        listaCorreos.addLast(correo);
    }
    
    public void agregarPassword(String password){
        listaContraseñas.addLast(password);
    }
    
    public void agregarPasswordConfirmed(String passconfirmed){
        listaConfirmaciones.addLast(passconfirmed);
    }
    
    public String obtenerUsuarios(int index){
        return listaUsuarios.get(index);
    }
    
    public String obtenerPassword(int index){
        return listaContraseñas.get(index);
    }
}
