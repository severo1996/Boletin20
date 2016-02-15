package Boletin20; 

 
import java.util.ArrayList; 
import java.util.Collections; 
import javax.swing.JOptionPane;


public class Libreria { 
 ArrayList<Libro> lectura =new ArrayList<Libro>(); 
  
 public void añadirLibro(Libro l){ 
      lectura.add(l); 
 } 
  public void vender(){ 
     int borrar=Integer.parseInt(JOptionPane.showInputDialog(null, "Posicion del elemento que tienes que borrar")); 
lectura.remove(borrar); 
  } 
 
 
 public String enseñar(){ 
        Collections.sort(lectura); 
          String z=""; 
          for(Libro l:lectura){ 
              z +="\n" + l.toString(); 
          } 
           return z; 
         } 
  public void borrar(){ 
      for(int i=0;i<lectura.size();i++){ 
         if(lectura.get(i).getNumeroUnidades()<1){ 
             lectura.remove(i); 
          }}} 
  public void Consultar(){ 
      String busca=JOptionPane.showInputDialog("Introduce un titulo"); 
     for(int i=0;i<lectura.size();i++){ 
          if(lectura.get(i).getTitulo().equalsIgnoreCase(busca)){ 
              JOptionPane.showMessageDialog(null,lectura.get(i).toString()); 
          } 
      } 
  }         
       
       
   
  } 
  
