package model;

import java.util.Objects;

public class Persona {
    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer dni;
    private String barrio;
    private String ocupacion;
    private static Integer kit_incremento = 0;
    private Integer kit;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer edad, Integer dni, String barrio, String ocupacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.barrio = barrio;
        this.ocupacion = ocupacion;
        this.kit = kit_incremento;
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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public Integer getKit() {
        return kit;
    }

    public void setKit(Integer kit) {
        this.kit = kit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona persona)) return false;
        return Objects.equals(nombre, persona.nombre) && Objects.equals(apellido, persona.apellido) && Objects.equals(edad, persona.edad) && Objects.equals(dni, persona.dni) && Objects.equals(barrio, persona.barrio) && Objects.equals(ocupacion, persona.ocupacion) && Objects.equals(kit, persona.kit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, edad, dni, barrio, ocupacion, kit);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", dni=" + dni +
                ", barrio='" + barrio + '\'' +
                ", ocupacion='" + ocupacion + '\'' +
                ", kit=" + kit +
                '}';
    }
}
