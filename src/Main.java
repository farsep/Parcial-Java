import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        // Crear una consulta
        LocalDateTime fechaHoraConsulta = LocalDateTime.of(2024, Month.MARCH, 12, 14, 30);
        Consulta consulta = new Consulta(fechaHoraConsulta, "Cardiología");

        // Crear un paciente particular
        LocalDate fechaNacimientoParticular = LocalDate.of(1985, Month.MAY, 20);
        Particular pacienteParticular = new Particular(
                fechaNacimientoParticular,
                "Juan",
                "Pérez",
                true,
                consulta,
                "12345678X",
                100.0
        );

        // Crear un paciente de obra social
        LocalDate fechaNacimientoObraSocial = LocalDate.of(1992, Month.APRIL, 15);
        ObraSocial pacienteObraSocial = new ObraSocial(
                fechaNacimientoObraSocial,
                "Ana",
                "García",
                false,
                consulta,
                "Salud Total",
                "987654"
        );

        // Mostrar la información del paciente particular
        System.out.println("Paciente Particular:");
        System.out.println("Nombre: " + pacienteParticular.getNombre() + " " + pacienteParticular.getApellido());
        System.out.println("DNI: " + pacienteParticular.getDni());
        System.out.println("Tarifa de consulta: " + pacienteParticular.getTarifaConsulta());
        System.out.println("Fecha de consulta: " + pacienteParticular.getConsulta().getFechaDeConsulta());
        System.out.println("Especialidad: " + pacienteParticular.getConsulta().getEspecialidad());
        System.out.println();

        // Mostrar la información del paciente de obra social
        System.out.println("Paciente de Obra Social:");
        System.out.println("Nombre: " + pacienteObraSocial.getNombre() + " " + pacienteObraSocial.getApellido());
        System.out.println("Número de asociado: " + pacienteObraSocial.getNumeroAsociado());
        System.out.println("Nombre de la obra social: " + pacienteObraSocial.getNombreObraSocial());
        System.out.println("Fecha de consulta: " + pacienteObraSocial.getConsulta().getFechaDeConsulta());
        System.out.println("Especialidad: " + pacienteObraSocial.getConsulta().getEspecialidad());
    }
}
