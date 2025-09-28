/**
 *
 * @author Dayana
 */
package estructural;

import model.Producto;

public class ProductoConDescuento extends ProductoDecorator {
    private double descuento; // en porcentaje

    public ProductoConDescuento(Producto producto, double descuento) {
        super(producto);       // llama al constructor de ProductoDecorator
        this.descuento = descuento;
    }

    @Override
    public double getPrecio() {
        // aplica el descuento sobre el precio original
        return producto.getPrecio() * (1 - descuento / 100);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Producto con descuento: " + getNombre() +
                " | Precio final: " + getPrecio() +
                " | Cantidad: " + getCantidad());
    }
}


    

