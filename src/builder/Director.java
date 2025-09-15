/**
 *
 * @author Dayana
 */
package builder;

public class Director {
    public void construirLaptopBasica(ElectronicoBuilder builder) {
        builder.reset();
        builder.setNombre("Laptop - Director");
        builder.setPrecio(2000.0);
        builder.setCantidad(5);
        builder.setGarantia(12);
        builder.setVoltaje("110V");
    }

    public void construirCamisaBasica(RopaBuilder builder) {
        builder.reset();
        builder.setNombre("Camisa - Director");
        builder.setPrecio(45.0);
        builder.setCantidad(30);
        builder.setTalla("L");
        builder.setMaterial("Algodón");
    }
}

