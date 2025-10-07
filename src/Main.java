public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();

    
        // EJERCICIO 1: Uso de atributos
        
        // System.out.println(cuenta.saldo); // ← Error: AS sALDO IS PRIVATE

        
        // EJERCICIO 2: Métodos públicos
        // 1. Ingresa 100€ usando depositar().
        // 2. Retira 30€ usando retirar().
        // 3. Imprime el saldo con getSaldo().
        cuenta.depositar(100);
        cuenta.retirar(30);
        System.out.println("Saldo actual: " + cuenta.getSaldo() + "€");

        
        // EJERCICIO 3: Métodos privados
        
        // cuenta.registrarOperacion("Hackeo", 9999); // ← Error: registrarOperacion is private

        
        // EJERCICIO 4: Libre
        
        cuenta.depositar(50);
        cuenta.retirar(20);
        System.out.println("Saldo final: " + cuenta.getSaldo() + "€");
    }
}

class CuentaBancaria {
    private double saldo;  // EX1: wE HAVE IT HERE IN THE CLASS cUENTAbANCARIA AND IT IS PRIVATE SO WE CAN NOT USE IT IN OTHER CLASSES TOO

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            registrarOperacion("Depósito", cantidad);
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            registrarOperacion("Retiro", cantidad);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    private void registrarOperacion(String tipo, double cantidad) {
        System.out.println("Operación registrada: " + tipo + " de " + cantidad + "€");
    }
}



// RESPUESTAS DE REFLEXIÓN

// Ejercicio 1: ¿por qué no puedo acceder al saldo directamente?
// Respuesta: ....................................................

// Ejercicio 2: ¿por qué sí puedo usar los métodos depositar(), retirar() y getSaldo()?
// Respuesta: beacuase they are public

// Ejercicio 3: ¿qué significa el error al intentar llamar a registrarOperacion()?
// Respuesta: because it is private and we cant call it from other classes

// Ejercicio 4: 
// - ¿Qué ventajas tiene que saldo sea private?
// - ¿Qué pasaría si saldo fuera public?
// - ¿Por qué registrarOperacion es private en lugar de public?
// Respuesta: becuase they are very confidential and for the security reason we do private.