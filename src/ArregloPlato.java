
public class ArregloPlato {
    Plato arr_i [] = new Plato[10];
    int n_i = 0;
    
    void agregarIngrediente( Plato p ) {
        arr_i[ n_i ] = p;
        n_i++;
    }

    void eliminarPlato( int pos ) {
        for ( int i=pos; i < n_i-1; i++ ) {
            arr_i[ i ] = arr_i[ i+1 ];    
            } 
        n_i--;
    }

    void listarPlatos() {
        Utilitaria.imprimir("CODIGO \t NOMBRE\t DESCRIPCIÓN \t PRECIO \t INGREDIENTES \t CANTIDAD INGREDIENTES \t ESTADO");

        for (int i = 0; i < n_i; i++) {
            Utilitaria.imprimir( arr_i[i].toString() );
        }
    }
    
    int buscarPlatoXCodigo( String cod ) {
        int i=0;
                
        while ( i<n_i &&  !arr_i[i].getCodigo().equals( cod ) ) 
            i++;
        
        if ( i== n_i )
            return -1;
        else
            return i;
    }
    

    void ordenarPlatoXPrecioASC( ) {
        int i, j;
        Plato tmp;
        int mayor=0;
        
        for (i=0; i<this.n_i; i++ ) {
            for ( j=0; j<this.n_i-1; j++ ) {
 
                if ( mayor == 0 || this.arr_i[j].getPrecio()>  this.arr_i[j+1].getPrecio()) {
                    tmp = this.arr_i[j];
                    this.arr_i[j] = this.arr_i[j+1];
                    this.arr_i[j+1] = tmp;
                }
            }
        }
    }

     void ordenarPlatoXNombreDESC( ) {
        int i, j;
        Plato tmp;
        
        
        for (i=0; i<this.n_i; i++ ) {
            for ( j=0; j>this.n_i-1; j++ ) {
              
                if ( this.arr_i[j].getNombre().toUpperCase().compareTo( this.arr_i[j+1].getNombre().toUpperCase() )  < 0 ) {
                    tmp = this.arr_i[j];
                    this.arr_i[j] = this.arr_i[j+1];
                    this.arr_i[j+1] = tmp;
                }
            }
        }
    }
 
   

}
