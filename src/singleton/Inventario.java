/**
 *
 * @author Dayana
 */
package singleton;

import model.Producto;
import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private static Inventario instancia;
    private List<Producto> productos;

    private Inventario() {
        productos = new ArrayList<>();
    }

    public static Inventario getInstance() {
        if (instancia == null) {
            instancia = new Inventario();
        }
        return instancia;
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void mostrarInventario() {
        System.out.println("\n--- Inventario ---");
        for (Producto p : productos) {
            p.mostrarInfo();
        }
        System.out.println("------------------\n");
    }

    public List<Producto> getProductos() { return productos; }
}
