/**
 *
 * @author Dayana
 */
package estructural;

import java.util.ArrayList;
import java.util.List;

public class CategoriaCompuesta implements ComponenteInventario {
    private String nombre;
    private List<ComponenteInventario> hijos = new ArrayList<>();

    public CategoriaCompuesta(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(ComponenteInventario c) {
        hijos.add(c);
    }

    @Override
    public void mostrar() {
        System.out.println("Categoria: " + nombre);
        for (ComponenteInventario c : hijos) {
            c.mostrar();
        }
    }
}

