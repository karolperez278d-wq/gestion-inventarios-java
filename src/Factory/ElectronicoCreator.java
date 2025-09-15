
/**
 *
 * @author Dayana
 */
package factory;

import model.Electronico;
import model.Producto;

public class ElectronicoCreator extends Creator {
    @Override
    public Producto factoryMethod(String subTipo) {
        // subTipo puede usarse para variar configuraciones
        return new Electronico("Laptop", 2500.0, 10, 24, "220V");
    }
}

