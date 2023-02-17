
package Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import modelos.usuariosModel;
import vistas.frmPrincipal;
import vistas.frmUsuarios;


public class usuariosControler implements ActionListener{

    frmPrincipal VistaPrincipal;
    frmUsuarios VistaUsuarios;
    usuariosModel ModeloUsuarios;
    public DefaultTableModel TableUsuarios = new DefaultTableModel();

    public usuariosControler(frmPrincipal VistaPrincipal, frmUsuarios VistaUsuarios, usuariosModel ModeloUsuarios) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaUsuarios = VistaUsuarios;
        this.ModeloUsuarios = ModeloUsuarios;
        
        this.TableUsuarios.addColumn("APELLIDOS");
        this.TableUsuarios.addColumn("NOMBRES");
        this.TableUsuarios.addColumn("TELEFONO");
            
        this.VistaUsuarios.jtUsuarios.setModel(TableUsuarios);
        
        this.VistaPrincipal.btnAgregar.addActionListener(this);
        
        this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.VistaPrincipal.btnAgregar){
            
            this.VistaUsuarios.btnInsertar.addActionListener(this);
            
            this.VistaUsuarios.setLocationRelativeTo(null);
            this.VistaUsuarios.setVisible(true);
        }
        
        if(e.getSource()==this.VistaUsuarios.btnInsertar){
            this.ModeloUsuarios.AgregarUsuarios(this.VistaUsuarios.txtApellidos.getText(), this.VistaUsuarios.txtNombres.getText(),
                    this.VistaUsuarios.txtTelefono.getText());
            this.TableUsuarios.addRow(new Object[]{this.ModeloUsuarios.ListaUsuarios.get(0).getApellidos(),
               this.ModeloUsuarios.ListaUsuarios.get(0).getNombre(), this.ModeloUsuarios.ListaUsuarios.get(0).getTelefono()});
        }
        
    }  
}
