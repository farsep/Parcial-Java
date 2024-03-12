import java.time.LocalDate;
import java.time.LocalDateTime;


public class Consulta {
    private LocalDateTime fechaDeConsulta; // Usamos LocalDateTime para fecha y hora
    private String especialidad;

    public Consulta(LocalDateTime fechaDeConsulta, String especialidad) {
        this.fechaDeConsulta = fechaDeConsulta;
        this.especialidad = especialidad;
    }

    // Getters y setters
    public LocalDateTime getFechaDeConsulta() {
        return fechaDeConsulta;
    }

    public void setFechaDeConsulta(LocalDateTime fechaDeConsulta) {
        this.fechaDeConsulta = fechaDeConsulta;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
