package pojos;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

public class Alumno {

    private int id;
    private String nombre;
    private String apellidos;
    private String nombreCurso;
    private double nota;
    private LocalDate fechaNacimiento;

    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellidos, String nombreCurso, double nota, LocalDate fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nombreCurso = nombreCurso;
        this.nota = nota;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return id + " | " + nombre + " | " + apellidos + " | Curso: " + nombreCurso + " | Nota: " + nota + " | Edad: " + getEdad();
    }
}
