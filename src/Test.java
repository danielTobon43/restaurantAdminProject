
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Test {
    
    
    static ArregloIngrediente ai;
    static ArregloPlato menu;
    static ArregloGrupoAlimento grupo;
    static ArregloSede sede;

    
    public static void main ( String args[]) {
        Ingrediente i;
        Plato p;
        GrupoAlimento f;
        Sede m;
        
        
        ai = new ArregloIngrediente();
        menu = new ArregloPlato();
        grupo = new ArregloGrupoAlimento();
        sede = new ArregloSede();
        
       //precarga sedes
        
       m = new Sede("4562", "Pasiones", "Cra 3N #56-65","Ezneider","3215698", 'A');
        sede.agregarSede(m);
        
         m = new Sede("4623", "Pasiones", "Cra 5A #6-65","Carlos Amparo", "452698", 'I');
        sede.agregarSede(m);
         m = new Sede("4485", "Antojos", "Calle 13B #2-20","Yaritza Mondongo", "1234567", 'A');
        sede.agregarSede(m);
         m = new Sede("4715", "La Caleñita", "Calle 15A #15-15","Leidy Vanessa", "4825965", 'A');
        sede.agregarSede(m);
         m = new Sede("4026", "Dame Dame", "Km 21 #100-20", "Eloy","5621236", 'I');
        sede.agregarSede(m);
         m = new Sede("4965", "YUM", "Km 18 #32-6","Ya tu sabe men", "6562352", 'A');
        sede.agregarSede(m);
        
        
        
        //precarga Ingredientes
        i = new Ingrediente("01","Harina","Harina de avena Quaker","Gramos", 1500,65, "Granos");
        ai.agregarIngrediente( i );
        
        i = new Ingrediente("02","Sal","Sal Refisal", "Kilogramo",1500,55, "Mineral");
        ai.agregarIngrediente( i );
        
        i = new Ingrediente("03","Leche","Leche Colanta", "Litro",2500,30, "Lacteos");
        ai.agregarIngrediente( i );
        
        i = new Ingrediente("04","Huevos","Huevos Napoles AAA", "Unidad",300,60, "Huevos");
        ai.agregarIngrediente( i );
        
        i = new Ingrediente("05","Coca Cola","Bebiba saborizada", "Litro",3500,70, "Bebidas");
        ai.agregarIngrediente( i );
        
        i = new Ingrediente("06","Frijoles","Granos de frijol SuperInter", "Libra",1500,20, "Granos");
        ai.agregarIngrediente( i );
        
        i = new Ingrediente("07","Mango","Mango Tommi", "Unidad",950,350, "Frutas");
        ai.agregarIngrediente( i );
        
        //Precarga Ingredientes
        
        //Precarga Platos
        
        p = new Plato("1","Arroz con Pollo", "Arroz con pollo deli deli bebe", 3500, true);
        menu.agregarIngrediente(p);
        
        
        
        SimpleDateFormat formateador = new SimpleDateFormat("d 'de' MMMM 'del' yyyy", new Locale("es"));        
        Date fechaDate = new Date();
        String fecha=formateador.format(fechaDate);  
        
        
        //Precarga Grupo de Alimentos
        
        f = new GrupoAlimento("1431", "Carnes", "Ricas Carnes");
        grupo.agregarGrupoAlimento(f);
        
        f = new GrupoAlimento("1436", "Verduras", "Ricas Verduras");
        grupo.agregarGrupoAlimento(f);
        
        f = new GrupoAlimento("1432", "Lácteos", "Ricos Lácteos");
        grupo.agregarGrupoAlimento(f);
        
        f = new GrupoAlimento("1439", "Huevos", "Ricos Huevos");
        grupo.agregarGrupoAlimento(f);
        
        f = new GrupoAlimento("1434", "Frutas", "Ricas Frutas");
        grupo.agregarGrupoAlimento(f);
        
        f = new GrupoAlimento("1435", "Cereales", "Ricos Cereales");
        grupo.agregarGrupoAlimento(f);
        
        f = new GrupoAlimento("1430", "Bebidas", "Ricas Bebidas");
        grupo.agregarGrupoAlimento(f);
        
         FormPrincipal obj = new FormPrincipal(); 
         obj.setVisible(true);
        
        
         
    }
}
 