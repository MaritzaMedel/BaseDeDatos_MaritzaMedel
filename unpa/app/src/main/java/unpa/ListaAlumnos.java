/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unpa;

import java.util.LinkedList;

/**
 *
 * @author 52281
 */
public class ListaAlumnos {
    private LinkedList<Alumno> lista;
    
    public ListaAlumnos(){
        lista=new LinkedList();
    }
    
    public void registrar(Alumno a){
        lista.add(a);
    }
    public void editar(int i,Alumno a){
        lista.get(i).setMatricula(a.getMatricula());
        lista.get(i).setNombre(a.getNombre());
        lista.get(i).setApt_paterno(a.getApt_paterno());
        lista.get(i).setApt_materno(a.getApt_paterno());
        //lista.add();
    }
    
    public void eliminar(Alumno a){
        lista.remove(a);
    }
    
    public Alumno buscar(int i){
        Alumno e=lista.get(i);
        return e;
    }
    public int total(){
        return lista.size();
    }
    public Alumno getAlumno(String matricula){
        int i=getPosicion(matricula);
        if(i>=0){
            return lista.get(i);
        }
        return null;
    }
    public int getPosicion(String matricula){
        int posicion = -1;
        for(int k=0;k<total();k++){
            if(getAlumno(k).getMatricula().compareTo(matricula)==0){
                posicion=k;
            }
        }
        return posicion;
    }
    public Alumno getAlumno(int indice){
        return lista.get(indice);
    }
    public String imprimirAlumnos(){
        String alumnos="";
        for(int i=0;i<total();i++){
            alumnos=alumnos+ lista.get(i).imprimirAlumno() +"\n";
        }
        return alumnos;
    }
   /* public Alumno obtener(int i){
        String matricula=lista.get(i).getMatricula();
        String nombre= lista.get(i).getNombre();
        String aptPaterno=lista.get(i).getApt_paterno();
        String aptMaterno=lista.get(i).getApt_materno();
        Alumno a=new Alumno(matricula, nombre,aptPaterno,aptMaterno);
        return a;
    }*/

}
