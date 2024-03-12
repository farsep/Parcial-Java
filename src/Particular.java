public class Particular extends Paciente {
    private String dni;
    private double tarifaConsulta;

    public Particular(Date fechaDeNacimiento, String nombre, String apellido, boolean primeraConsulta, Consulta consulta, String dni, double tarifaConsulta) {
        super(fechaDeNacimiento, nombre, apellido, primeraConsulta, consulta);
        this.dni = dni;
        this.tarifaConsulta = tarifaConsulta;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getTarifaConsulta() {
        return tarifaConsulta;
    }

    public void setTarifaConsulta(double tarifaConsulta) {
        this.tarifaConsulta = tarifaConsulta;
    }
}
