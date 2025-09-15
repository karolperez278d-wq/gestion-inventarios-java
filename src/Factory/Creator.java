
/**
 *
 * @author Dayana
 */
package factory;

import model.Producto;

public abstract class Creator {
    public abstract Producto factoryMethod(String subTipo); // crea Producto concreto

    // método utilitario (opcional)
    public Producto crear(String subTipo) {
        return factoryMethod(subTipo);
    }
}
