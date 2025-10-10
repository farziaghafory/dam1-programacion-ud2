public class GestorTareas {
    public static void main(String[] args) {
        bienvenida(); // call bienvanida method
        int totalMinutes = duracionTotal(45, 30);// ren the method called duracionTotal give the result and store in
                                                 // totalMinutes Variable
        System.out.println("Total duration: " + totalMinutes + "Minutes");
        convertTiempo(150);
        recordatorio("Revisar correo", 2);
        System.out.println(estadoTarea(true)); // booleano
        System.out.println(estadoTarea(false)); // booleano
        System.out.println("Productividad: " + productividad(10, 7) + "%");
        sobrecarga(); // wihtout Parameter
        sobrecarga("Farzia", 5); // with parameter
        String plan = bonus("Estudiar matemáticas", 135);
        System.out.println(plan);
    }

    public static void bienvenida() {
        System.out.println("Bienvenida al programa");
    }

    public static int duracionTotal(int min1, int min2) {
        return min1 + min2;
    }

    public static void convertTiempo(int minutos) {
        int horas = minutos / 60; // a full hour
        int otherminutes = minutos % 60; // leftover of the time
        System.out.println("Son" + horas + "horas &" + otherminutes + "minutes");

    }

    public static void recordatorio(String tarea, int prioridad) {
        System.out.println("prioridad" + prioridad + ": " + tarea);
    }

    public static String estadoTarea(boolean completada) { // True or False
        return completada ? "Completada" : "Pendiente";
    }

    public static double productividad(int total, int completadas) {
        if (total == 0) // if it is = 0 return 0%
            return 0.0;
        double resultado = (completadas * 100.0) / total; // otherwise do this 
        return Math.round(resultado * 10) / 10.0; // Round the result for me
    }

    public static void sobrecarga() { // method without parameters
        System.out.println("Hola crack!");
    }

    public static void sobrecarga(String user, int tareasConpletadas) {// methos with parameters
        System.out.println("Hola" + user + " completaste" + tareasConpletadas);
    }

public static String bonus(String nombreTarea, int duracionMinutos){ // same as convertTiempo
    int horas = duracionMinutos / 60; // Complete hour
    int minutos = duracionMinutos %60; // the leftover of the time
    return "La tarea"+ nombreTarea + "durará aproximadamente" + horas + "Y" + minutos;
}

}
