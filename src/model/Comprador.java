
/**
 *
 * @author Dayana
 */
package model;

public class Comprador {
    private String nombre;
    private String email;

    public Comprador(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public boolean comprarProducto(Producto producto, int cantidad) {
        if (producto != null && producto.getCantidad() >= cantidad) {
            producto.setCantidad(producto.getCantidad() - cantidad);
            System.out.println(nombre + " compró " + cantidad + " de " + producto.getNombre());
            return true;
        } else {
            System.out.println("No hay suficiente stock para realizar la compra.");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Comprador: " + nombre + " | Email: " + email;
    }
}

