
import javax.swing.*;

public class Utilitaria {

    static String leerCadena ( String preg ) {
        String dato;
        
        dato = JOptionPane.showInputDialog(preg);
        
        return dato;
    }
        
    static boolean validarCadenaVacia ( String cad ) {

       
        if ( cad.trim().length() == 0 )
            return true ;
        else
            return false;
    }
    
    static void imprimir(String msg) {
        System.out.println(msg);
    }

    static void imprimirEnVentanaInformativa(String msg, String titulo) {
        JOptionPane.showMessageDialog(null,msg,titulo, JOptionPane.INFORMATION_MESSAGE);
    }
    

}
