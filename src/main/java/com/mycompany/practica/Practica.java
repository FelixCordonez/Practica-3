
package com.mycompany.practica;

import javax.swing.JOptionPane;
public class Practica {
    

    public static void main(String[] args) {
     String cadena;
     int entero;
     char letra;
     double Decimal;
     
     cadena = JOptionPane.showInputDialog("ingrese su nombre:");
     entero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero entero "));
     letra = JOptionPane.showInputDialog("ingrese una letra").charAt(0);
     Decimal =Double.parseDouble(JOptionPane.showInputDialog("ingrse un numero decimal")) ;
     
     JOptionPane.showMessageDialog(null,"la cadena es: "+cadena);
     JOptionPane.showMessageDialog(null,"La letra es: "+ letra);
     JOptionPane.showMessageDialog(null,"El numero entero es: "+entero);
        JOptionPane.showMessageDialog(null,"El numero decimal es: "+Decimal);
    }
}
