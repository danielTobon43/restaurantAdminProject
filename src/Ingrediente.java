
public class Ingrediente {

    String codigo;
    String descripcion;
    String unidadMedida;
    int stock;
    int cantidadIngrediente;
    double costo;
    String nombre;
    String grupoAlimento;

    public Ingrediente(String codigo, String nombre, String descripcion, String unidadMedida, double costo, int stock, String grupoAlimento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.unidadMedida = unidadMedida;
        this.costo = costo;
        this.stock = stock;
        this.grupoAlimento = grupoAlimento;

    }

    public Ingrediente(String nombre, String codigo, String descripcion, String unidadMedida, double costo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.unidadMedida = unidadMedida;
        this.costo = costo;
    }

    public Ingrediente(String nombre, int cantidadIngrediente) {
        this.nombre = nombre;
        this.cantidadIngrediente = cantidadIngrediente;
    }

    public String getGrupoAlimento() {
        return grupoAlimento;
    }

    public void setGrupoAlimento(String grupoAlimento) {
        this.grupoAlimento = grupoAlimento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCantidadIngrediente() {
        return cantidadIngrediente;
    }

    public void setCantidadIngrediente(int cantidadIngrediente) {
        this.cantidadIngrediente = cantidadIngrediente;
    }

    @Override
    public String toString() {
        return codigo + "\n" + descripcion + "\n" + unidadMedida + "\n" + stock + "\n" + cantidadIngrediente + "\n" + costo + "\n" + nombre + "\n" + grupoAlimento;
    }

}
