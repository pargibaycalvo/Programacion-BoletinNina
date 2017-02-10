/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysdearraysnina;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ped90
 */
public class Liga {
        int numEquipos = Integer.parseInt(JOptionPane.showInputDialog("cantos equipos :"));
  
    ArrayList<ArrayList<Xogador>>liga = new ArrayList<ArrayList<Xogador>>();
    ArrayList<Xogador> equipo;
    
    public void crearLiga(){
        int i,j;
    for( i=0;i<numEquipos;i++ ){
      equipo = new ArrayList<Xogador>(); // creo fila vacia
        
      equipo=crearEquipo(); 
      
        liga.add(equipo);
   }
        
    }
    
    public void amosar(){
        
        for(int i =0;i< liga.size();i++){
            System.out.println("\n");
            for (int j=0;j<liga.get(i).size();j++){
                System.out.print(liga.get(i).get(j));
            }
    }
    }    
     public void buscarXogador(){
         boolean atopado = false ; // non se atopou
         System.out.println(" \n dorsal xogador a buscar :");
         int dorsal = pedirInt();
          for(int i =0;i< liga.size();i++)
            
            for (int j=0;j<liga.get(i).size();j++){
                if(dorsal == liga.get(i).get(j).getDorsal()){
                    System.out.println(liga.get(i).get(j));
                    atopado = true;
                }
          } 
         if (!atopado) // é igual que dicir o contrario de true
             System.out.println(" o dorsal "+ dorsal + " non está na liga");
      }
     public void baja(){
         int dorsaldelete=pedirInt();
         for(int d=0;d<liga.size();d++){//va por columnas
         for(int e=0;e<liga.get(d).size();e++){//va por filas escojiendo la columna 
             if(liga.get(d).get(e).getDorsal()==dorsaldelete)//desde equipos que pase por xogadores y dentro de xogadores que coja dorsal y coja el dorsal 
                 liga.get(e).remove(e);// y los elimine
         }
         }
     }
     public void bajatodo(){
         int dorsaldelete=pedirInt();
         String nomedelete=pedirString();
         for(int d=0;d<liga.size();d++){//va por columnas
         for(int e=0;e<liga.get(d).size();e++){//va por filas
             if(liga.get(d).get(e).getDorsal()==dorsaldelete && nomedelete.compareToIgnoreCase(liga.get(d).get(e).getNome())==0)//desde filas que coja los numeros de dorsal y los nombres, haga la comparacion de uno a otro para evitar errores 
                 liga.get(e).remove(e);// y los elimine
         }
         }
     }
      public static String pedirString(){
        return (JOptionPane.showInputDialog(" dato String :") ); 
    }
    
    public static int pedirInt(){
        return(Integer.parseInt(JOptionPane.showInputDialog("dato int :")));
    }
   
     public ArrayList<Xogador> crearEquipo(){
        int tam = Integer.parseInt(JOptionPane.showInputDialog(" cantos xogadores :"));
        for(int i=0;i< tam;i++){
            equipo.add(new Xogador(pedirString(),pedirInt())); 
            
       
    }
   return equipo;
    
}
}
    

