import java.time.LocalDate;
import java.time.LocalDateTime;


public abstract class Paciente {
    private LocalDate fechaDeNacimiento; // Usamos LocalDate para la fecha de nacimiento
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
