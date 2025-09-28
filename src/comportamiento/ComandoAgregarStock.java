/**
 *
 * @author Dayana
 */
package comportamiento;

import model.Producto;

public class ComandoAgregarStock implements ComandoInventario {
    private Producto producto;
    private int cantidad;

    public ComandoAgregarStock(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    @Override
    public void ejecutar() {
        producto.setCantidad(producto.getCantidad() + cantidad);
    }

    @Override
    public void deshacer() {
        producto.setCantidad(producto.getCantidad() - cantidad);
    }
}
