/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unpa;

/**
 *
 * @author mar medel
 */
public class Alumno {
    private String matricula;
    private String nombre;
    private String apt_paterno;
    private String apt_materno;

    public Alumno(String matricula, String nombre, String apt_paterno, String apt_materno) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apt_paterno = apt_paterno;
        this.apt_materno = apt_materno;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApt_paterno() {
        return apt_paterno;
    }

    public void setApt_paterno(String apt_paterno) {
        this.apt_paterno = apt_paterno;
    }

    public String getApt_materno() {
        return apt_materno;
    }

    public void setApt_materno(String apt_materno) {
        this.apt_materno = apt_materno;
    }
    public String imprimirAlumno(){
        return getMatricula()+" "+getNombre()+" "+getApt_paterno()+" "+getApt_materno();        
    }
    
}
