public class Plato {
    String codigo;
    String descripcion;
    double precio;
    boolean estado;
    Ingrediente[] cod_ingrediente;
    Ingrediente[] cantIngrediente;
    String nombre;

    public Plato(String codigo, String nombre, String descripcion, double precio, boolean estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.estado = estado;
        
    }

    public Plato(Ingrediente[] cod_ingrediente, Ingrediente[] cantIngrediente) {
        this.cod_ingrediente = cod_ingrediente;
        this.cantIngrediente = cantIngrediente;
    }

    public Plato(String codigo, String nombre, String descripcion, double precio, boolean estado, Ingrediente[] cod_ingrediente, Ingrediente[] cantIngrediente) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.estado = estado;
        this.cod_ingrediente = cod_ingrediente;
        this.cantIngrediente = cantIngrediente;
        this.nombre = nombre;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Ingrediente[] getCod_ingrediente() {
        return cod_ingrediente;
    }

    public void setCod_ingrediente(Ingrediente[] cod_ingrediente) {
        this.cod_ingrediente = cod_ingrediente;
    }

    public Ingrediente[] getCantIngrediente() {
        return cantIngrediente;
    }

    public void setCantIngrediente(Ingrediente[] cantIngrediente) {
        this.cantIngrediente = cantIngrediente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Plato{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + ", estado=" + estado + ", cod_ingrediente=" + cod_ingrediente + ", cantIngrediente=" + cantIngrediente + ", nombre=" + nombre + '}';
    }

   

   

   
    
            
            
}
