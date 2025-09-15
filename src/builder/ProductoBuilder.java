/**
 *
 * @author Dayana
 */
package builder;

import model.Producto;

public interface ProductoBuilder {
    void reset();
    void setNombre(String nombre);
    void setPrecio(double precio);
    void setCantidad(int cantidad);
    Producto build();
}

