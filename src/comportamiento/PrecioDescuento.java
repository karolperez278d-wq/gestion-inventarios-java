/**
 *
 * @author Dayana
 */
package comportamiento;

public class PrecioDescuento implements EstrategiaPrecio {
    private double porcentaje;

    public PrecioDescuento(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double calcular(double precioBase) {
        return precioBase * (1 - porcentaje / 100);
    }
}

