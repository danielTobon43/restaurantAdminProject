
public class ArregloIngrediente {

    Ingrediente arr_i[] = new Ingrediente[10];
    int n_i = 0;

    void agregarIngrediente(Ingrediente p) {
        arr_i[ n_i] = p;
        n_i++;
    }

    void eliminarIngrediente(int pos) {
        for (int i = pos; i < n_i - 1; i++) {
            arr_i[ i] = arr_i[ i + 1];
        }
        n_i--;
    }

    void listarIngredientes() {
        Utilitaria.imprimir("CODIGO \t NOMBRE\t DESCRIPCIÓN \t TELEFONO");

        for (int i = 0; i < n_i; i++) {
            Utilitaria.imprimir(arr_i[i].codigo);
        }
    }

    int buscarIngredienteXCodigo(String cod) {
        int i = 0;
        while (i < n_i && !arr_i[i].getCodigo().equals(cod)) {
            i++;
        }

        if (i == n_i) {
            return -1;
        } else {
            return i;
        }
    }

    void ordenarXDescripcionASC() {
        int i, j;
        Ingrediente tmp;

        for (i = 0; i < this.n_i; i++) {
            for (j = 0; j < this.n_i - 1; j++) {

                if (this.arr_i[j].getDescripcion().toUpperCase().compareTo(this.arr_i[j + 1].getDescripcion().toUpperCase()) > 0) {
                    tmp = this.arr_i[j];
                    this.arr_i[j] = this.arr_i[j + 1];
                    this.arr_i[j + 1] = tmp;
                }
            }
        }
    }

    void ordenarXNombreDESC() {
        int i, j;
        Ingrediente tmp;

        for (i = 0; i < this.n_i; i++) {
            for (j = 0; j > this.n_i - 1; j++) {

                if (this.arr_i[j].getNombre().toUpperCase().compareTo(this.arr_i[j + 1].getNombre().toUpperCase()) < 0) {
                    tmp = this.arr_i[j];
                    this.arr_i[j] = this.arr_i[j + 1];
                    this.arr_i[j + 1] = tmp;
                }
            }
        }
    }

    void ordenarXGrupoASC() {
        int i, j;
        Ingrediente tmp;

        for (i = 0; i < this.n_i; i++) {
            for (j = 0; j < this.n_i - 1; j++) {

                if (this.arr_i[j].getGrupoAlimento().toUpperCase().compareTo(this.arr_i[j + 1].getGrupoAlimento().toUpperCase()) < 0) {
                    tmp = this.arr_i[j];
                    this.arr_i[j] = this.arr_i[j + 1];
                    this.arr_i[j + 1] = tmp;
                }
            }
        }
    }

}
