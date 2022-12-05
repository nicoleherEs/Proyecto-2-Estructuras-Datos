/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba2;


import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author admin
 */
public class Cola {
    private cliente inicio;
    private cliente termino;
    
    public Cola (){
        inicio=null;
        termino=null;
    }
public void insertar(String Nombre)
 {
    cliente i=new cliente(Nombre);
     i.setNext(null);
     if(inicio==null & termino==null)
     {
     inicio=i;
     termino=i;
     }
     termino.setNext(i);
     termino=termino.getNext();
 }

 
 public String extraer()
 {
     String Nombre=inicio.getNombre();
     inicio=inicio.getNext();
     return Nombre;
 }
public boolean estaVacia()
{
         boolean cola=false;
         if(inicio==null & termino==null)
         {
         cola=true;
         System.out.println("La cola esta vacia");
         }
         else
         {
         System.out.println("La cola no esta vacia");
         cola=false;
         }
         return cola;
 }
public boolean llena_JList(JList lista,DefaultListModel m)
{
    
    cliente c=this.inicio;
     m=new DefaultListModel<>();
     lista.setModel(m); 
     if (this.inicio==this.termino){
          m.addElement(c.getNombre());
     }else {
     
         while(c!=null)
         {

            m.addElement(c.getNombre());          
            c=c.getNext();
         }
     }
    
    return true;
}


 public int contar()
 {
     int contador=0;
     if(this.inicio==null){
         contador=0;
     }else
     if(this.inicio==this.termino){
         contador=1;
     }else{
         cliente c=this.inicio;
         while(c!=null)
         {
             contador++;
             c=c.getNext();
         }
     }
     
     return contador;
 }
    public String toString()
 {
 cliente c=this.inicio;
 String s="";
 while(c!=null)
 {
     s=s+c.toString();
     c=c.getNext();
 }
 return s;
 }   
}
