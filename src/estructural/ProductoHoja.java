/**
 *
 * @author Dayana
 */
package estructural;

import model.Producto;

public class ProductoHoja implements ComponenteInventario {
    private Producto producto;

    public ProductoHoja(Producto producto) {
        this.producto = producto;
    }

    @Override
    public void mostrar() {
        System.out.println("- " + producto.getNombre() + " | Stock: " + producto.getCantidad());
    }
}

