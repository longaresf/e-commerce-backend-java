/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tienda;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author fco
 */
public class Productos {
        String nombre, precio, stock;
    

    public Productos() {
    }
    
    public Productos(String nombre, String precio, String stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

   
        public static boolean RegProdNombre(String nombre) {
        boolean inputError = false;
        Pattern pattern = Pattern.compile("^\\p{L}+[\\p{L}\\p{Z}\\p{P}]{0,}");
        Matcher mather = pattern.matcher(nombre);
        if (mather.find() == true) {
            inputError = true;
        } else if (mather.find() == false) {
            System.out.println("Nombre inválido, vuelva a escribir su Nombre");
            inputError = false;
        }
        return inputError;
    }
    
        public static boolean RegProdPrecio(String precio) {
        boolean inputError = false;
        Pattern pattern = Pattern.compile("^[0-9]{0,}$");
        Matcher mather = pattern.matcher(precio);
        if (mather.find() == true) {
        inputError = true;
        } else if (mather.find() == false) {
            System.out.println("Precio inválido");
            inputError = false;
        }

        return inputError;
    }
        
        public static boolean RegProdStock(String stock) {
        boolean inputError = false;
        Pattern pattern = Pattern.compile("^[0-9]{0,}$");
        Matcher mather = pattern.matcher(stock);
        if (mather.find() == true) {
           inputError = true;
        } else if (mather.find() == false) {
            System.out.println("Stock inválido");
            inputError = false;
        }

        return inputError;
    }
        
    @Override
    public String toString() {
        return "Producto: "+nombre+", Precio: "+precio+", Stock: "+stock;
    }
}
