/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tienda;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author fco
 */
public class Tienda {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        String nombre, precio, stock;
        ArrayList<String> nombreProd = new ArrayList<>();
        ArrayList<String> precioProd = new ArrayList<>();
        ArrayList<String> stockProd = new ArrayList<>();
            
        System.out.println("Favor introduzca Nombre Producto");
        nombre = dato.nextLine();
        System.out.println("Favor introduzca Precio Producto");
        precio = dato.nextLine();
        System.out.println("Favor introduzca Stock Producto");
        stock = dato.nextLine();
         
        Productos producto1 = new Productos();
        
                boolean inputError = true;
                
            do {
            try {
                inputError = producto1.RegProdNombre(nombre);
                if (inputError) {
                    producto1.setNombre(nombre);
                    nombreProd.add(nombre);
                } else if (inputError == false) {
                    nombre = dato.nextLine();
                }
            } catch (Exception e) {
                System.out.println("UPS ALGO SALIO MAL");
            }
        } while (inputError == false);
                
        do {
            try {
                inputError = producto1.RegProdPrecio(precio);
                if (inputError) {
                    producto1.setPrecio(precio);
                    precioProd.add(precio);
                } else if (inputError == false) {
                    precio = dato.nextLine();
                }
            } catch (Exception e) {
                System.out.println("UPS ALGO SALIO MAL");
            }
        } while (inputError == false);
        
                do {
            try {
                inputError = producto1.RegProdStock(stock);
                if (inputError) {
                    producto1.setStock(stock);
                    stockProd.add(stock);
                } else if (inputError == false) {
                    stock = dato.nextLine();
                }
            } catch (Exception e) {
                System.out.println("UPS ALGO SALIO MAL");
            }
        } while (inputError == false);

      for (String i : nombreProd) {
      System.out.println("Lista de Productos: "+i);
    }
      
      for (String i : precioProd) {
      System.out.println("Lista de Precios: "+i);
    }
      
      for (String i : stockProd) {
      System.out.println("Lista de Stock: "+i);
    }
                
        System.out.println("Producto: "+nombre+", Precio: "+precio+", Stock: "+stock);

    }
}
