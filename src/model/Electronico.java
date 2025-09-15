
/**
 *
 * @author Dayana
 */
package model;

public class Electronico extends Producto {
    private int garantiaMeses;
    private String voltaje;

    public Electronico(String nombre, double precio, int cantidad, int garantiaMeses, String voltaje) {
        super(nombre, precio, cantidad);
        this.garantiaMeses = garantiaMeses;
        this.voltaje = voltaje;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Electrónico: " + getNombre() + " | $" + getPrecio() +
                           " | Stock: " + getCantidad() + " | Garantía: " + garantiaMeses + " meses | Voltaje: " + voltaje);
    }

    // Getters
    public int getGarantiaMeses() { return garantiaMeses; }
    public String getVoltaje() { return voltaje; }
}
