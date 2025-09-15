
/**
 *
 * @author Dayana
 */
package abstractfactory;

import model.Producto;
import model.Ropa;

public class FabricaRopa implements CategoriaFactory {
    @Override
    public Producto crearProductoBasico() {
        return new Ropa("Pantalón", 80.0, 50, "L", "Mezclilla");
    }
}
