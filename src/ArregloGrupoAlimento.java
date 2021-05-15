
public class ArregloGrupoAlimento {
    GrupoAlimento arr_i [] = new GrupoAlimento[10];
    int n_i = 0;
    
    void agregarGrupoAlimento( GrupoAlimento p ) {
        arr_i[ n_i ] = p;
        n_i++;
    }

    void eliminarGrupoAlimento( int pos ) {
        for ( int i=pos; i < n_i-1; i++ ) {
            arr_i[ i ] = arr_i[ i+1 ];    
            } 
        n_i--;
    }
    
    int buscarIngredienteXCodigo(String cod) {
        int i = 0;
        while (i < n_i && !arr_i[i].codigo.equals(cod)) {
            i++;
        }

        if (i == n_i) {
            return -1;
        } else {
            return i;
        }
    }

  

   void ordenarXCodigoDESC() {
        int i, j;
        GrupoAlimento tmp;

        for (i = 0; i < this.n_i; i++) {
            for (j = 0; j > this.n_i - 1; j++) {

                if (this.arr_i[j].getCodigo().toUpperCase().compareTo(this.arr_i[j + 1].getCodigo().toUpperCase()) < 0) {
                    tmp = this.arr_i[j];
                    this.arr_i[j] = this.arr_i[j + 1];
                    this.arr_i[j + 1] = tmp;
                }
            }
        }
    }

    void ordenarXNombreDESC( ) {
        int i, j;
        GrupoAlimento tmp;
        
        for (i=0; i<this.n_i; i++ ) {
            for ( j=0; j>this.n_i-1; j++ ) {
              
                if ( this.arr_i[j].getNombreGrupoAlimento().toUpperCase().compareTo( this.arr_i[j+1].getNombreGrupoAlimento().toUpperCase() )  < 0 ) {
                    tmp = this.arr_i[j];
                    this.arr_i[j] = this.arr_i[j+1];
                    this.arr_i[j+1] = tmp;
                }
            }
        }
    }
 
    
    }


