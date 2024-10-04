class CuentaBancaria {
    // definimos los atributos
    private String titular;
    private String numeroCuenta;
    private double saldo;

    // inicializamos los atributos con el constructor
    public CuentaBancaria(String titular, String numeroCuenta, double saldoInicial) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    // método para depositar dinero
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Se han depositado " + monto + ". Nuevo saldo: " + saldo);
        } else {
            System.out.println("El monto a depositar debe ser positivo.");
        }
    }

    // método para retirar dinero
    public void retirar(double monto) {
        if (monto > 0) {
            if (monto <= saldo) {
                saldo -= monto;
                System.out.println("Se han retirado " + monto + ". Nuevo saldo: " + saldo);
            } else {
                System.out.println("Fondos insuficientes. Saldo actual: " + saldo);
            }
        } else {
            System.out.println("El monto a retirar debe ser positivo.");
        }
    }

    // método para consultar el saldo
    public double consultarSaldo() {
        return saldo;
    }


    // método main
    
    public static void main(String[] args) {
        // Crear un objeto de CuentaBancaria
        CuentaBancaria miCuenta = new CuentaBancaria("Juan Pérez", "123456", 1000.0);

        // Consultar el saldo
        System.out.println("Saldo inicial: " + miCuenta.consultarSaldo());

        // Depositar dinero
        miCuenta.depositar(500.0);

        // Retirar dinero
        miCuenta.retirar(300.0);

        // Intentar retirar más de lo que hay en la cuenta
        miCuenta.retirar(1500.0);

        // Consultar el saldo final
        System.out.println("Saldo final: " + miCuenta.consultarSaldo());
    }
}















