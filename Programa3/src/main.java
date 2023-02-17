
import Controladores.usuariosControler;
import modelos.usuariosModel;
import vistas.frmPrincipal;
import vistas.frmUsuarios;


public class main {

    public static void main(String[] args) {
        
        frmPrincipal VistaPrincipal = new frmPrincipal();
        frmUsuarios VistaUsuarios = new frmUsuarios(VistaPrincipal, true);
        usuariosModel ModeloUsuarios = new usuariosModel();
        
        usuariosControler ControladorUsuarios = new usuariosControler(VistaPrincipal, VistaUsuarios, ModeloUsuarios);
    }
    
}
