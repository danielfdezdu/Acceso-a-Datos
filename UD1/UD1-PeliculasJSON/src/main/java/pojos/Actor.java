package pojos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Actor {

    private int id;
    private String nombre;

    @JsonProperty("character")
    private String personaje;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getNombre() {
        return nombre;
    }

    @JsonProperty("name")
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }
}
