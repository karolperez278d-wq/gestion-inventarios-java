/**
 *
 * @author Dayana
 */
package model;

public abstract class Producto implements Cloneable {
    protected String nombre;
    protected double precio;
    protected int cantidad;
    protected Categoria categoria; // opcional para enlazar al tipo de categoría

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public abstract void mostrarInfo();

    public Producto clonar() {
        try {
            return (Producto) this.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }
}
