/**
 *
 * @author Dayana
 */
package comportamiento;

public class PrecioNormal implements EstrategiaPrecio {
    @Override
    public double calcular(double precioBase) {
        return precioBase;
    }
}
