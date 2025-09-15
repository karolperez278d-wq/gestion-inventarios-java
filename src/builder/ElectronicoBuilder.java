/**
 *
 * @author Dayana
 */
package builder;

import model.Electronico;
import model.Producto;

public class ElectronicoBuilder implements ProductoBuilder {
    private String nombre;
    private double precio;
    private int cantidad;
    private int garantia;
    private String voltaje;

    @Override
    public void reset() {
        nombre = null; precio = 0; cantidad = 0; garantia = 0; voltaje = null;
    }

    @Override
    public void setNombre(String nombre) { this.nombre = nombre; }

    @Override
    public void setPrecio(double precio) { this.precio = precio; }

    @Override
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public void setGarantia(int meses) { this.garantia = meses; }
    public void setVoltaje(String voltaje) { this.voltaje = voltaje; }

    @Override
    public Producto build() {
        return new Electronico(nombre != null ? nombre : "ElectronicoBuilder", precio, cantidad, garantia, voltaje != null ? voltaje : "220V");
    }
}
