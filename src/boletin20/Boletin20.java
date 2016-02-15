package Boletin20; 
 
 
import javax.swing.JOptionPane; 

 public class Boletin20 { 
 
 

     public static void main(String[] args) { 
 
 
         Libreria libro = new Libreria(); 
         libro.añadirLibro(new Libro("Mamá", "Bobi", "C3", 23, 24)); 
         libro.añadirLibro(new Libro("Pei", "Seco", "yt67", 12, 1)); 
         libro.añadirLibro(new Libro("Te lo juro", "Isi", "adsf", 10, 79)); 
          boolean condicion = true; 
         do { 
            int menu = Integer.parseInt(JOptionPane.showInputDialog("Elixe opción:\n1)Engadir \n2)Amosar\n3)Borrar\n4)Vender Libro\n5)Consultar\n6)Sair")); 
             switch (menu) { 
                 case 1: 
                     libro.añadirLibro(new Libro(JOptionPane.showInputDialog("Titulo"), JOptionPane.showInputDialog("Autor"), JOptionPane.showInputDialog("ISBN"), Double.valueOf(JOptionPane.showInputDialog("Precio")), Integer.valueOf(JOptionPane.showInputDialog("Unidades")))); 
                     break; 
                 case 2: 
                     JOptionPane.showMessageDialog(null,libro.enseñar()); 
                     break; 
                 case 3: 
                     libro.borrar(); 
                     break; 
                 case 4: libro.vender(); 
                     break; 
                 case 5:libro.Consultar(); 
                     break; 
                 case 6: System.exit(0); 
                 default: 
                     JOptionPane.showMessageDialog(null, "Numero incorrecto"); 
 
 
             } 
 
 
         } while(true); 
      
    }
 }
 
