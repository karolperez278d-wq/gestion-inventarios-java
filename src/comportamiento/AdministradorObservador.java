/**
 *
 * @author Dayana
 */
package comportamiento;

import model.Producto;

public class AdministradorObservador implements Observador {
    @Override
    public void actualizar(Producto p) {
        System.out.println("⚠️ Alerta: Stock bajo del producto " + p.getNombre());
    }
}
