
public class GrupoAlimento {
    
   
     String codigo;      
     String nombreGrupoAlimento;      
     String descripcion;
     
     

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    
    public GrupoAlimento(String codigo, String nombreGrupoAlimento, String descripcion) {
        this.codigo = codigo;
        this.nombreGrupoAlimento = nombreGrupoAlimento; 
        this.descripcion = descripcion;
    }
    
   
    public String getNombreGrupoAlimento() {
        return nombreGrupoAlimento;
    }

   
    public void setNombreGrupoAlimento(String nombreGrupoAlimento) {
        this.nombreGrupoAlimento = nombreGrupoAlimento;
    }
  

   
    public String getCodigo() {
        return codigo;
    }

   
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "GrupoAlimento{" + "codigo=" + codigo + ", nombreGrupoAlimento=" + nombreGrupoAlimento + ", descripcion=" + descripcion + '}';
    }

    
    
}
