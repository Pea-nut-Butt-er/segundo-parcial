package model;

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
}
