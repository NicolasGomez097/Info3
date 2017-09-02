package Eje1;

public class Cita {
    private String nombre;
    private Integer tel;
    private String hora;
    private String fecha;
    
    //Constructor por omisión.
    public Cita(){}
    
    //Constructor que carga los parametros de la cita.
    public Cita(String nom, Integer tel, String hora, String fecha){
        this.nombre = nom;
        this.tel = tel;
        this.hora = hora;
        this.fecha = fecha;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer obtenerTelefono() {
        return tel;
    }

    public void establecerTelefono(Integer tel) {
        this.tel = tel;
    }

    public String obtenerHoraDeCita() {
        return hora;
    }

    public void establecerHoraDeCita(String hora) {
        this.hora = hora;
    }
    
    public String obtenerFechaDeCita() {
        return fecha;
    }

    public void establecerFechaDeCita(String fecha) {
        this.fecha = fecha;
    }
    
    
}
