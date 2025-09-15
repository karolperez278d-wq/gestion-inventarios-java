
/**
 *
 * @author Dayana
 */
package model;

import java.time.LocalDate;

public class Alimento extends Producto {
    private LocalDate fechaVencimiento;
    private String tipoEmpaque;

    public Alimento(String nombre, double precio, int cantidad, LocalDate fechaVencimiento, String tipoEmpaque) {
        super(nombre, precio, cantidad);
        this.fechaVencimiento = fechaVencimiento;
        this.tipoEmpaque = tipoEmpaque;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Alimento: " + getNombre() + " | $" + getPrecio() +
                           " | Stock: " + getCantidad() + " | Vence: " + fechaVencimiento + " | Empaque: " + tipoEmpaque);
    }

    public LocalDate getFechaVencimiento() { return fechaVencimiento; }
    public String getTipoEmpaque() { return tipoEmpaque; }
}

