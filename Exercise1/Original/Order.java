package SOLID.Exercise1.Original;

import java.util.List;

public class Order {
    @SuppressWarnings("unused")
    private List<String> items;
    @SuppressWarnings("unused")
    private double totalAmount;

    public Order(List<String> items) {
        this.items = items;
        this.totalAmount = calculateTotal();
    }

    private double calculateTotal() {
        // Lógica para calcular el total de la orden
        return 100.0; // simplificado
    }

    public void printOrder() {
        // Lógica para imprimir la orden
    }

    public void saveToDatabase() {
        // Lógica para guardar la orden en la base de datos
    }
}