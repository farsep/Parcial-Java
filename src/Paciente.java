import java.time.LocalDate;



public abstract class Paciente {
    private LocalDate fechaDeNacimiento; // Usamos LocalDate para la fecha de nacimiento

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
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

    public boolean isPrimeraConsulta() {
        return primeraConsulta;
    }

    public void setPrimeraConsulta(boolean primeraConsulta) {
        this.primeraConsulta = primeraConsulta;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    private String nombre;
    private String apellido;
    private boolean primeraConsulta;
    private Consulta consulta;

    public Paciente(LocalDate fechaDeNacimiento, String nombre, String apellido, boolean primeraConsulta, Consulta consulta) {
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.primeraConsulta = primeraConsulta;
        this.consulta = consulta;
    }

    // Métodos y getters/setters adicionales
    // ...
}
