/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class Alumno extends Colegio {

    private String nombre;
    private String apellido;
    private String materia;
    private String turno;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, String materia, String turno, String nombreColegio) {
        super(nombreColegio);
        this.nombre = nombre;
        this.apellido = apellido;
        this.materia = materia;
        this.turno = turno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String getNombreColegio() {
        return nombreColegio;
    }

    @Override
    public void setNombreColegio(String nombreColegio) {
        this.nombreColegio = nombreColegio;
    }

    @Override
    public void DatosCompletos() {
        System.out.println("*****DATOS DEL ALUMNO*****");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Colegio: " + nombreColegio);
    }

    @Override
    public void Materia() {
        System.out.println("Materia: " + materia);
    }

    @Override
    public void Turno() {
        System.out.println("Turno asignado: " + turno);
        System.out.println();
    }
}
