/**
 *
 * @author Dayana
 */
package comportamiento;

import java.util.ArrayList;
import java.util.List;
import model.Producto;

public class InventarioObservable {
    private List<Observador> observadores = new ArrayList<>();

    public void agregarObservador(Observador o) {
        observadores.add(o);
    }

    public void notificar(Producto p) {
        for (Observador o : observadores) {
            o.actualizar(p);
        }
    }
}
