/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba2;

/**
 *
 * @author admin
 */
public class cliente {
    private String Nombre;
    private cliente next;

    public cliente(String Nombre) {
        this.Nombre = Nombre;
        
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public cliente getNext() {
        return next;
    }

    public void setNext(cliente next) {
        this.next = next;
    }
  public String toString()
 {
 
  
 String s=" "+Nombre+" ";
 return s;
  
 }  
    }
    
   
   
    

