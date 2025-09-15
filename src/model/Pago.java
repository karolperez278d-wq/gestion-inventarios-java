
/**
 *
 * @author Dayana
 */
package model;

public class Pago {
    private String metodo; // "Efectivo", "Tarjeta"
    private double monto;

    public Pago(String metodo, double monto) {
        this.metodo = metodo;
        this.monto = monto;
    }

    public void procesarPago() {
        System.out.println("Pago procesado con " + metodo + " por valor de $" + monto);
    }
}
