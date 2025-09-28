/**
 *
 * @author Dayana
 */
/**
 *
 * @author Dayana
 */
package estructural;

import model.Producto;

public abstract class ProductoDecorator extends Producto {
    protected Producto producto;

    public ProductoDecorator(Producto producto) {
        super(producto.getNombre(), producto.getPrecio(), producto.getCantidad());
        this.producto = producto;
    }

    @Override
    public String getNombre() {
        return producto.getNombre();
    }

    @Override
    public int getCantidad() {
        return producto.getCantidad();
    }

    @Override
    public double getPrecio() {
        return producto.getPrecio();
    }
}

