/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasarchivo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
/**
 *
 * @author HP
 */
public class LeerArchivo {
    public void Ordenar(){
        
        List <String> ListaOrdenada= new ArrayList();
        ListaOrdenada.add("a sutsuy le gusta leer libros  ");
         File archivo = null;
         FileReader fr = null; 
         BufferedReader br = null;
            try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File ("C:\\Users\\HP\\Documents\\sutsuy\\pruebame.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         
         
         
         //separacion del texto contenido en ka f
         
        String cadena = "libros sustsuy a gusta le leer uu .";
        String[] palabras = cadena.split(" ");
        for (String palabra : palabras)
        {
            System.out.println(palabra);
        }
         // Lectura del fichero
         String linea;
         // lo de abajo lee cada parraf
         while((linea=br.readLine())!=null)  
            System.out.println(linea);
      }
            
            
            
            
            
            
      catch(Exception e){
          System.out.println(e);;
         
      }
            finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
            
            
            
            
             for(int i=0;i<linea.length;i++)
            
            {
                System.out.println("linea[i]");
            }
            
            for(int i=0;i<ListaOrdenada.lengt;i++){
                System.out.println("ListaOrdenada[i]");
            }
            
            
       
         }
      }
        
    }
    
}


