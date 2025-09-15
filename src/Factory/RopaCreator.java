
/**
 *
 * @author Dayana
 */
package factory;

import model.Producto;
import model.Ropa;

public class RopaCreator extends Creator {
    @Override
    public Producto factoryMethod(String subTipo) {
        return new Ropa("Camisa", 50.0, 100, "M", "Algodón");
    }
}

