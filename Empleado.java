public class Empleado {
    // Atributos de la clase
    private String nombre;         
    private double salario;        
    private String departamento;   

    // Constructor para inicializar los atributos
    public Empleado(String nombre, double salario, String departamento) {
        this.nombre = nombre;
        this.salario = salario;       
        this.departamento = departamento; 
    }

    // Método para obtener el nombre del empleado
    public String getNombre() {
        return nombre;
    }

    // Método para obtener el departamento del empleado
    public String getDepartamento() {
        return departamento;
    }

    // Método para aumentar el salario
    public void aumentarSalario(double incremento) {
        if (incremento > 0) {
            salario += incremento; 
        } else {
            System.out.println("El incremento debe ser positivo.");
        }
    }

    // Método para mostrar información del empleado
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Departamento: " + departamento);
        // No mostramos el salario directamente porque es privado
    }

    // Método para obtener el salario 
    public double obtenerSalario() {
        return salario; 
    }

    public static void main(String[] args) {
        // Crear un objeto de Empleado
        Empleado empleado1 = new Empleado("Juan Pérez", 3000.0, "Desarrollo");

        // Mostrar la información del empleado
        empleado1.mostrarInfo();

        // Aumentar el salario
        empleado1.aumentarSalario(500.0);
        System.out.println("Salario después del aumento: " + empleado1.obtenerSalario()); // Mostrar el salario
    }
}
