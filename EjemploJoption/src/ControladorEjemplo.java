import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;

public class ControladorEjemplo extends MouseAdapter {

    private Ventana view;

    public ControladorEjemplo(Ventana view){
        this.view = view;
        this.view.getBtnEntrada().addMouseListener(this);
        this.view.getBtnOpcion().addMouseListener(this);
        this.view.getBtnMensaje().addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {
       if(e.getSource() == view.getBtnMensaje()){
          // System.out.println("mensaje");
           JOptionPane.showMessageDialog(view,
                   "Hola desde el ejemplo",
                   "titulo personalizado",
                   JOptionPane.WARNING_MESSAGE
                   );
       }
        if(e.getSource() == view.getBtnEntrada()){
            System.out.println("entrada");

        }
        if(e.getSource() == view.getBtnOpcion()){
            System.out.println("opcion");
        }
        if(e.getSource() == view.getBtnMensaje()){

        }

    }
}
