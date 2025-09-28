/**
 *
 * @author Dayana Gonzalez
 */
package main;

import abstractfactory.FactoryProducer;
import abstractfactory.CategoriaFactory;
import builder.Director;
import builder.ElectronicoBuilder;
import builder.RopaBuilder;
import factory.ElectronicoCreator;
import factory.RopaCreator;
import model.*;
import singleton.Inventario;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = Inventario.getInstance();

        // ---------- Abstract Factory ----------
        System.out.println("=== Abstract Factory ===");
        CategoriaFactory fabricaE = FactoryProducer.getFactory("electronica");
        Producto tele = fabricaE.crearProductoBasico();
        inventario.agregarProducto(tele);

        CategoriaFactory fabricaR = FactoryProducer.getFactory("ropa");
        Producto pantalon = fabricaR.crearProductoBasico();
        inventario.agregarProducto(pantalon);

        CategoriaFactory fabricaA = FactoryProducer.getFactory("alimentos");
        Producto leche = fabricaA.crearProductoBasico();
        inventario.agregarProducto(leche);

        inventario.mostrarInventario();

        // ---------- Builder ----------
        System.out.println("=== Builder ===");
        Director director = new Director();
        ElectronicoBuilder eBuilder = new ElectronicoBuilder();
        director.construirLaptopBasica(eBuilder);
        Producto laptop = eBuilder.build();
        inventario.agregarProducto(laptop);

        RopaBuilder rBuilder = new RopaBuilder();
        director.construirCamisaBasica(rBuilder);
        Producto camisa = rBuilder.build();
        inventario.agregarProducto(camisa);

        inventario.mostrarInventario();

        // ---------- Factory Method ----------
        System.out.println("=== Factory Method ===");
        ElectronicoCreator ec = new ElectronicoCreator();
        Producto p1 = ec.factoryMethod(null);
        RopaCreator rc = new RopaCreator();
        Producto p2 = rc.factoryMethod(null);
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.mostrarInventario();

        // ---------- Prototype ----------
        System.out.println("=== Prototype ===");
        Producto clonLaptop = laptop.clonar();
        if (clonLaptop != null) {
            clonLaptop.setCantidad(2);
            inventario.agregarProducto(clonLaptop);
        }
        inventario.mostrarInventario();

        // ---------- Comprador, Administracion, Pago (uso normal) ----------
        Administracion admin = new Administracion("Carlos");
        Comprador comprador = new Comprador("Ana", "ana@mail.com");

        // Compra: Ana compra 1 laptop
        boolean ok = comprador.comprarProducto(laptop, 1);
        if (ok) {
            Pago pago = new Pago("Tarjeta", laptop.getPrecio() * 1);
            pago.procesarPago();
        }

        // Admin actualiza stock (ejemplo: repone 5 unidades de pantalon)
        admin.actualizarStock(pantalon, 5);

        inventario.mostrarInventario();

        // Ejemplo crear producto manualmente Alimento con fecha de vencimiento
        Alimento galletas = new Alimento("Galletas", 3.0, 20, LocalDate.now().plusDays(60), "Bolsa");
        inventario.agregarProducto(galletas);
        inventario.mostrarInventario();
    }
}

