package pojos;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Streams {

    public static List<Alumno> getAlumnos(){
        List<Alumno> listaAlumnos = new ArrayList<>();
        
        listaAlumnos.add(new Alumno(1, "Javier Ignacio", "Molina Cano", "Java 8", 7, LocalDate.of(2008, 5, 12)));
        listaAlumnos.add(new Alumno(2, "Lillian Eugenia", "G�mez �lvarez", "Java 8", 10, LocalDate.of(1999, 12, 25)));
        listaAlumnos.add(new Alumno(3, "Sixto Naranjoe", "Mar�n", "Java 8", 8.6, LocalDate.of(2002, 10, 16)));
        listaAlumnos.add(new Alumno(4, "Gerardo Emilio", "Duque Guti�rrez", "Java 8", 10, LocalDate.of(1989, 6, 4)));
        listaAlumnos.add(new Alumno(5, "Jhony Alberto", "S�enz Hurtado", "Java 8", 9.5, LocalDate.of(2006, 11, 29)));
        listaAlumnos.add(new Alumno(6, "Germ�n Antonio", "Lotero Upegui", "Java 8", 8, LocalDate.of(1991, 2, 2)));
        listaAlumnos.add(new Alumno(7, "Oscar Dar�o", "Murillo Gonz�lez", "Java 8", 8, LocalDate.of(1995, 1, 14)));
        listaAlumnos.add(new Alumno(8, "Augusto Osorno", "Palacio Mart�nez", "PHP", 9.5, LocalDate.of(1994, 10, 8)));
        listaAlumnos.add(new Alumno(9, "C�sar Oswaldo", "Alzate Agudelo", "Java 8", 8, LocalDate.of(2003, 12, 20)));
        listaAlumnos.add(new Alumno(10, "Gloria", "Gonz�lez Casta�o", "PHP", 10, LocalDate.of(1998, 7, 6)));
        listaAlumnos.add(new Alumno(11, "Jorge Le�n", "Ruiz Ruiz", "Python", 8, LocalDate.of(1984, 11, 17)));
        listaAlumnos.add(new Alumno(12, "John Jairo", "Duque Garc�a", "Java Script", 9.4, LocalDate.of(1992, 4, 19)));
        listaAlumnos.add(new Alumno(13, "Julio Cesar", "Gonz�lez Casta�o", "C Sharp", 10, LocalDate.of(2005, 6, 25)));
        listaAlumnos.add(new Alumno(14, "Gloria Amparo", "Rodas Monsalve", "Ruby", 7, LocalDate.of(1996, 9, 12)));
        listaAlumnos.add(new Alumno(15, "Gabriel Jaime", "Jim�nez G�mez", "Java Script", 10, LocalDate.of(2008, 1, 29)));
        listaAlumnos.add(new Alumno(16, "Juan", "P�rez", "Matem�ticas", 7.5, LocalDate.of(1987, 5, 8)));
        listaAlumnos.add(new Alumno(17, "Mar�a", "Garc�a", "Historia", 8.0, LocalDate.of(1990, 10, 3)));
        listaAlumnos.add(new Alumno(18, "Carlos", "L�pez", "F�sica", 6.3, LocalDate.of(1986, 8, 2)));
        listaAlumnos.add(new Alumno(19, "Ana", "Mart�nez", "Qu�mica", 9.2, LocalDate.of(2001, 3, 11)));
        listaAlumnos.add(new Alumno(20, "Pedro", "Gonz�lez", "Biolog�a", 5.7, LocalDate.of(1989, 3, 5)));
        listaAlumnos.add(new Alumno(21, "Laura", "Hern�ndez", "Ingl�s", 8.4, LocalDate.of(1997, 11, 22)));
        listaAlumnos.add(new Alumno(22, "Jos�", "Rodr�guez", "Filosof�a", 6.9, LocalDate.of(2000, 2, 26)));
        listaAlumnos.add(new Alumno(23, "Luc�a", "Fern�ndez", "Inform�tica", 7.8, LocalDate.of(2009, 12, 6)));
        listaAlumnos.add(new Alumno(24, "Miguel", "S�nchez", "Arte", 9.5, LocalDate.of(1993, 7, 10)));
        listaAlumnos.add(new Alumno(25, "Elena", "Jim�nez", "Matem�ticas", 5.4, LocalDate.of(1991, 8, 31)));
        listaAlumnos.add(new Alumno(26, "David", "Torres", "Historia", 7.2, LocalDate.of(2006, 3, 14)));
        listaAlumnos.add(new Alumno(27, "Sandra", "Ruiz", "F�sica", 6.5, LocalDate.of(1999, 5, 7)));
        listaAlumnos.add(new Alumno(28, "Javier", "Ram�rez", "Qu�mica", 9.1, LocalDate.of(2003, 9, 15)));
        listaAlumnos.add(new Alumno(29, "Patricia", "Moreno", "Biolog�a", 8.7, LocalDate.of(1994, 6, 21)));
        listaAlumnos.add(new Alumno(30, "Adri�n", "D�az", "Ingl�s", 7.6, LocalDate.of(1985, 12, 1)));
        listaAlumnos.add(new Alumno(31, "Claudia", "Mu�oz", "Filosof�a", 6.8, LocalDate.of(2002, 4, 23)));
        listaAlumnos.add(new Alumno(32, "Diego", "Alonso", "Inform�tica", 8.9, LocalDate.of(2004, 10, 5)));
        listaAlumnos.add(new Alumno(33, "Nuria", "Guti�rrez", "Arte", 7.4, LocalDate.of(1995, 3, 16)));
        listaAlumnos.add(new Alumno(34, "Ra�l", "Navarro", "Matem�ticas", 9.8, LocalDate.of(1992, 11, 11)));
        listaAlumnos.add(new Alumno(35, "Beatriz", "Rivas", "Historia", 6.1, LocalDate.of(1996, 2, 28)));
        listaAlumnos.add(new Alumno(36, "Manuel", "Ortega", "F�sica", 5.6, LocalDate.of(2007, 7, 19)));
        listaAlumnos.add(new Alumno(37, "Sara", "Rubio", "Qu�mica", 8.3, LocalDate.of(1990, 1, 25)));
        listaAlumnos.add(new Alumno(38, "Rafael", "Soler", "Biolog�a", 6.9, LocalDate.of(2001, 8, 9)));
        listaAlumnos.add(new Alumno(39, "Carmen", "Mendoza", "Ingl�s", 9.4, LocalDate.of(1998, 12, 13)));
        listaAlumnos.add(new Alumno(40, "Alberto", "Pascual", "Filosof�a", 7.1, LocalDate.of(1993, 4, 30)));
        listaAlumnos.add(new Alumno(41, "Marta", "Castro", "Inform�tica", 5.9,  LocalDate.of(2005, 11, 2)));
        listaAlumnos.add(new Alumno(42, "Fernando", "Iglesias", "Arte", 8.5, LocalDate.of(1997, 6, 18)));
        listaAlumnos.add(new Alumno(43, "Isabel", "Vega", "Matem�ticas", 9.0, LocalDate.of(2000, 9, 27)));
        listaAlumnos.add(new Alumno(44, "Oscar", "Dom�nguez", "Historia", 6.2, LocalDate.of(2000, 3, 3)));
        listaAlumnos.add(new Alumno(45, "Alicia", "Prieto", "F�sica", 7.9, LocalDate.of(2007, 4, 7)));
        
        return listaAlumnos;
    }
    
    public static void main(String[] args) {
        
    }
    
}
