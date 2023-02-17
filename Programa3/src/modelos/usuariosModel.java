
package modelos;

import java.util.ArrayList;

public class usuariosModel {
    
    public ArrayList<Usuarios> ListaUsuarios = new ArrayList<Usuarios>();
    
    public void AgregarUsuarios(String apellido, String nombre, String telefono){
        
        Usuarios NuevoUsuario = new Usuarios(apellido, nombre, telefono);
        this.ListaUsuarios.add(NuevoUsuario);
        
    }
    
    public ArrayList ListarUsuarios(){
        return ListaUsuarios;
    }
    
}
