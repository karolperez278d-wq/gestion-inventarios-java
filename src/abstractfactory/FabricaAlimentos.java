/**
 *
 * @author Dayana
 */
package abstractfactory;

import model.Alimento;
import model.Producto;
import java.time.LocalDate;

public class FabricaAlimentos implements CategoriaFactory {
    @Override
    public Producto crearProductoBasico() {
        return new Alimento("Leche", 4.5, 30, LocalDate.now().plusDays(15), "Tetrapak");
    }
}

