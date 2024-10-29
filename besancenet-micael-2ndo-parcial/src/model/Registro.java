package model;

import java.util.Objects;

public class Registro {
    private Integer dni;
    private Integer temperatura;

    public Registro() {
    }

    public Registro(Integer dni, Integer temperatura) {
        this.dni = dni;
        this.temperatura = temperatura;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Integer temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Registro registro)) return false;
        return Objects.equals(dni, registro.dni) && Objects.equals(temperatura, registro.temperatura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni, temperatura);
    }

    @Override
    public String toString() {
        return "Registro{" +
                "dni=" + dni +
                ", temperatura=" + temperatura +
                '}';
    }
}
