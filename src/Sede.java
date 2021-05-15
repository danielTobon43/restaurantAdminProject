public class Sede {
    String codigo;
    String nombre;
    String direccion;
    String nomAdministrador;
    String telefono;
    char estado;
    Plato plato;

    public Sede(String codigo, String nombre, String direccion,String nomAdmin, String telefono, char estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.nomAdministrador = nomAdmin;
        this.telefono = telefono;
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNomAdministrador() {
        return nomAdministrador;
    }

    public void setNomAdministrador(String nomAdministrador) {
        this.nomAdministrador = nomAdministrador;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Sede{" + "codigo=" + codigo + ", nombre=" + nombre + ", direccion=" + direccion + ", nomAdministrador=" + nomAdministrador + ", telefono=" + telefono + ", estado=" + estado + '}';
    }
    
    
    
}
