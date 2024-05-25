public class NuevoServicio{

private String nombreServicio;//Nombre de la empresa
private String nombre;
private String contrasenia;


public void PagoServicio(String nombre,String contrasenia){

    System.out.println("Pago realizado por: "+nombre+": "+nombreServicio.toLowerCase());
}

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}

