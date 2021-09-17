/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public abstract class Colegio {

    public String nombreColegio;

    public Colegio() {
    }

    public Colegio(String nombreColegio) {
        this.nombreColegio = nombreColegio;
    }

    public String getNombreColegio() {
        return nombreColegio;
    }

    public void setNombreColegio(String nombreColegio) {
        this.nombreColegio = nombreColegio;
    }

    public abstract void Turno();

    public abstract void Materia();

    public abstract void DatosCompletos();
}
