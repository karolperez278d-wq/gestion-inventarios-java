/**
 *
 * @author Dayana
 */
package abstractfactory;

public class FactoryProducer {
    public static CategoriaFactory getFactory(String tipo) {
        switch (tipo.toLowerCase()) {
            case "electronica":
                return new FabricaElectronica();
            case "ropa":
                return new FabricaRopa();
            case "alimentos":
                return new FabricaAlimentos();
            default:
                throw new IllegalArgumentException("Tipo de fábrica no válido.");
        }
    }
}

