/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prySinglenton;

import java.util.LinkedList;

/**
 *
 * @author  mar Medel
 */
public class Inventario {
    private LinkedList<Producto> productos;
    
   private static Inventario instance;
    
    private Inventario(){
        productos=new LinkedList<>();
    }
    
    public static Inventario getInstance(){
        if(instance==null){
            instance=new Inventario();
        }
        return instance;
    }
    
    public void agregarProducto(Producto p){
        productos.add(p);
    }
    public void eliminarPrducto(int indice){
        productos.remove(indice);
    }
    public void editarProducto(Producto p,int indice){
        productos.set(indice, p);
    }
   /* public int buscarProducto(Producto p){
        for(int i=0;i<productos.size();i++){
            if(productos.get(i)==p){
                return productos;
            }
        }
    }*/
    public int buscarProductoPorIndice(Producto p){
        int posicion = -1;
        for(int i=0;i<productos.size();i++){
            if(getProducto(i).getNombre().compareTo(p.getNombre())==0){
                posicion=i;
            }
        }
        return posicion;
    }
    
    public Producto getProducto(int indice){
        return productos.get(indice);
    }
    
}
