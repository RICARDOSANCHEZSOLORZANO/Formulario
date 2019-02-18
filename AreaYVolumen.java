/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.y.volumen;
import javax.swing.JOptionPane;
/**
 *
 * @author TICS
 */
public class AreaYVolumen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opc, op;
       double area,volumen,Uno,Dos,Datres,perimetro,radio;
       do{
       
       opc=Integer.parseInt (JOptionPane.showInputDialog 
        ("PROGRAMA PARA CALCULAR AREA Y VOLUMEN\n" +
                "Elige una opcion\n" +
                "1)Area \n" +
                "2) Volumen \n"));
       if(opc==1)
 {
     op= Integer.parseInt (JOptionPane.showInputDialog 
        ("1)Circulo \n" +
                "2) Triangulo \n" +
                "3) Rectangulo \n" +
                "\n 4)Salir\n" +
                "ESCOJE UNA OPCION DE LAS ANTERIORES"));
     switch (op)
           {
                   case 1:
                       Uno=Double.parseDouble(JOptionPane.showInputDialog
                              ("Ingresa el radio:"));
                       area = 2*3.1416*Uno;
                       JOptionPane.showInputDialog(null,"El es: " +area);
                    break;
                   case 2:
                       Uno=Double.parseDouble(JOptionPane.showInputDialog
                              ("Ingresa la base:"));
                       Dos=Double.parseDouble(JOptionPane.showInputDialog
                              ("Ingresa la altura:"));
                       area=Uno*Dos/2;
                       JOptionPane.showInputDialog(null,"El es: " +area);
                        break;
                   case 3:
                       Uno=Double.parseDouble(JOptionPane.showInputDialog
                              ("Ingresa la base:"));
                       Dos=Double.parseDouble(JOptionPane.showInputDialog
                              ("Ingresa la altura:"));
                       area=Uno*Dos;
                       JOptionPane.showInputDialog(null,"El es: " +area);
                       break;
                   case 4:   
                       System.exit(0);
                        JOptionPane.showInputDialog(null,"Ya estas fuera " );
                       break;  }
                    
           
 
 }
 else
     if(opc==2)
 {
     op=Integer.parseInt (JOptionPane.showInputDialog 
        ("Volumenes\n" +
                "1)Piramide\n" +
                "2)Cilindro\n" +
                "3) Salir \n" +
                 "Elige una opción\n"));
      switch (op)
           {
                   case 1:
                       Uno=Double.parseDouble(JOptionPane.showInputDialog
                              ("Ingresa el base:"));
                        Dos=Double.parseDouble(JOptionPane.showInputDialog
                              ("Ingresa la altura:"));
                       volumen = 1/2*Uno*Dos;
                       JOptionPane.showInputDialog(null,"El es: " +volumen);
                    break;
                   case 2:
                       Uno=Double.parseDouble(JOptionPane.showInputDialog
                              ("Ingresa el radio:"));
                       Dos=Double.parseDouble(JOptionPane.showInputDialog
                              ("Ingresa la altura:"));
                       volumen=3.1416*Uno*Dos;
                       case 3:   
                       System.exit(0);
                        JOptionPane.showInputDialog(null,"GRACIAS POR UTILIZAR EL PROGRAMA. ADIOS" );
                       break;  }
                    
         }
       }
 
 while(opc!=3);
               

 System.exit(0);
    }
    
}
