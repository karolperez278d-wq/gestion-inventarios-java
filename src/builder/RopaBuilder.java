/**
 *
 * @author Dayana
 */
package builder;

import model.Producto;
import model.Ropa;

public class RopaBuilder implements ProductoBuilder {
    private String nombre;
    private double precio;
    private int cantidad;
    private String talla;
    private String material;

    @Override
    public void reset() {
        nombre = null; precio = 0; cantidad = 0; talla = null; material = null;
    }

    @Override
    public void setNombre(String nombre) { this.nombre = nombre; }

    @Override
    public void setPrecio(double precio) { this.precio = precio; }

    @Override
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public void setTalla(String talla) { this.talla = talla; }
    public void setMaterial(String material) { this.material = material; }

    @Override
    public Producto build() {
        return new Ropa(nombre != null ? nombre : "RopaBuilder", precio, cantidad, talla != null ? talla : "M", material != null ? material : "Algodón");
    }
}
