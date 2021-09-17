/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyabstractcolegio;

import Modelo.Alumno;
import Modelo.Colegio;
import Modelo.Profesor;

public class ProyAbstractColegio {

    public static void main(String[] args) {

        Colegio profesor = new Profesor("Graciela", "Reyes", "Matemáticas", "Tarde", "Maria Lujan");
        Colegio alumno = new Alumno("Federico", "King", "Matemáticas", "Tarde", "Maria Lujan");

        Colegio profesor1 = new Profesor("Coco", "Perez", "Historia", "Mañana", "Maria Lujan");
        Colegio alumno1 = new Alumno("Atenea", "DePaola", "Historia", "Mañana", "Maria Lujan");

        profesor.DatosCompletos();
        profesor.Materia();
        profesor.Turno();

        alumno.DatosCompletos();
        alumno.Materia();
        alumno.Turno();

        profesor1.DatosCompletos();
        profesor1.Materia();
        profesor1.Turno();

        alumno1.DatosCompletos();
        alumno1.Materia();
        alumno1.Turno();
    }

}
