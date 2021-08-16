package demo.model.vo;

public class Liderporsalario {
    
    private String nombre;
    private String primerApellido;
    private Integer id_lider;
    private Integer salario;


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPrimerApellido() {
        return primerApellido;
    }
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }
    public int getId_lider() {
        return id_lider;
    }
    public void setId_lider(int id_lider) {
        this.id_lider = id_lider;
    }
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }

}
