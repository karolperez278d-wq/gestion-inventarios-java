
/**
 *
 * @author Dayana
 */
package model;

public class Ropa extends Producto {
    private String talla;
    private String material;

    public Ropa(String nombre, double precio, int cantidad, String talla, String material) {
        super(nombre, precio, cantidad);
        this.talla = talla;
        this.material = material;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Ropa: " + getNombre() + " | $" + getPrecio() +
                           " | Stock: " + getCantidad() + " | Talla: " + talla + " | Material: " + material);
    }

    public String getTalla() { return talla; }
    public String getMaterial() { return material; }
}
