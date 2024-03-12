public class ObraSocial extends Paciente {
    private String nombreObraSocial;
    private String numeroAsociado;

    public ObraSocial(Date fechaDeNacimiento, String nombre, String apellido, boolean primeraConsulta, Consulta consulta, String nombreObraSocial, String numeroAsociado) {
        super(fechaDeNacimiento, nombre, apellido, primeraConsulta, consulta);
        this.nombreObraSocial = nombreObraSocial;
        this.numeroAsociado = numeroAsociado;
    }

    public String getNombreObraSocial() {
        return nombreObraSocial;
    }

    public void setNombreObraSocial(String nombreObraSocial) {
        this.nombreObraSocial = nombreObraSocial;
    }

    public String getNumeroAsociado() {
        return numeroAsociado;
    }

    public void setNumeroAsociado(String numeroAsociado) {
        this.numeroAsociado = numeroAsociado;
    }

    public int comparar(ObraSocial otro) {
        return this.numeroAsociado.compareTo(otro.numeroAsociado);
    }
}
