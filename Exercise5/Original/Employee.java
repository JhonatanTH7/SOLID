package Exercise5.Original;

public class Employee {
    @SuppressWarnings("unused")
    private String name;
    @SuppressWarnings("unused")
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void calculatePay() {
        // Lógica para calcular el salario
    }

    public void generateReport() {
        // Lógica para generar un reporte del empleado
    }

    public void saveToDatabase() {
        // Lógica para guardar el empleado en la base de datos
    }
}