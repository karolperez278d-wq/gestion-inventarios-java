
/**
 *
 * @author Dayana
 */
package model;

import singleton.Inventario;

public class Administracion {
    private String usuario;

    public Administracion(String usuario) {
        this.usuario = usuario;
    }

    public void agregarProducto(Producto producto) {
        Inventario.getInstance().agregarProducto(producto);
        System.out.println("Administrador " + usuario + " agregó el producto: " + producto.getNombre());
    }

    public void actualizarStock(Producto producto, int cantidad) {
        producto.setCantidad(producto.getCantidad() + cantidad);
        System.out.println("Stock actualizado de " + producto.getNombre() + ": " + producto.getCantidad());
    }
}
