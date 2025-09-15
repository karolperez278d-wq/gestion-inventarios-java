
/**
 *
 * @author Dayana
 */
package abstractfactory;

import model.Electronico;
import model.Producto;

public class FabricaElectronica implements CategoriaFactory {
    @Override
    public Producto crearProductoBasico() {
        return new Electronico("Televisor", 1800.0, 5, 12, "110V");
    }
}
