import utilidades.Cancion;

public class InstanciacionReferenciaYComparacion {
public static void main(String[] args) {
    // ================================
        // EJERCICIO 1: Crear objetos con new
        // ================================
        // 1. Crea un objeto Cancion (c1) usando el constructor por defecto.
        // 2. Crea otro objeto Cancion (c2) usando el constructor parametrizado,
        // por ejemplo: "Clocks", "Coldplay".
        // 3. Muestra por consola ambas canciones con System.out.println().
        // 4. Observa qué valores se imprimen en cada caso.
        // ¿Qué diferencia hay entre el constructor por defecto y el parametrizado?
 
        // Tu código aquí ↓
 
            Cancion c1 = new Cancion();
            Cancion c2 = new Cancion("Clocks","Coldplay");
 
            System.out.println(c1==c2);
            
 
        // ================================
        // EJERCICIO 2: Comparación con ==
        // ================================
        // 1. Crea dos objetos Cancion (c3 y c4) distintos, con los mismos valores
        // (ejemplo: "Clocks", "Coldplay").
        // 2. Imprime el resultado de (c3 == c4).
        // 3. Piensa: ¿por qué da false aunque los datos sean iguales?
 
        // Tu código aquí ↓
 
            //Cancion c3 = new Cancion("Tengo la camisa negra","Juanes");
            //Cancion c4 = new Cancion("Tengo la camisa negra","Juanes");
 
            //System.out.println(c3 == c4);
            //Respuesta: Sale false debido a que al usar "new" se crea dos objetos dife
 
        // ================================
        // EJERCICIO 3: Comparación con equals()
        // ================================
        // 1. Usando los mismos objetos c3 y c4 del ejercicio anterior,
        // imprime el resultado de (c3.equals(c4)).
        // 2. ¿Qué diferencia hay con el resultado de (c3 == c4)?
        // 3. Explica por qué ahora sí devuelve true (pista: en Cancion equals está
        // sobrescrito).
 
        // Tu código aquí ↓
 
           // Cancion c3 = new Cancion("Tengo la camisa negra","Juanes");
           // Cancion c4 = new Cancion("Tengo la camisa negra","Juanes");
           // System.out.println(c3 == c4); // false poruqe no son el mismo objeto
          //  System.out.println(c3.equals(c4)); 
            // RESPUESTA: Aquí se estás sobreescribiendo el contenido de c3 en c4 lo 
            // que hace que dé true al tener el mismo contenido de los objetos

 
        // ================================
        // EJERCICIO 4: Comparación en Pelicula
        // ================================
        // 1. Crea dos objetos Pelicula (p1 y p2) con el mismo título y año
        // (ejemplo: "Inception", 2010).
        // 2. Imprime ambas películas por consola.
        // 3. Imprime (p1 == p2).
        // 4. Imprime (p1.equals(p2)).
        // 5. Pregunta: ¿por qué en Pelicula equals no funciona como en Cancion?
 
        // Tu código aquí ↓
 
         //   Pelicula p1 = new Pelicula("Transformers", 2007);
          //  Pelicula p2 = new Pelicula("Transformers", 2007);
 
           // System.out.println(p1 == p2);
           // System.out.println(p1.equals(p2));
            //RESPUESTA: Aquí, al igual que en la canción, se sobreescribio el contenid
 
        // ================================
        // EJERCICIO 5: Referencias
        // ================================
        // 1. Crea un objeto Cancion (c5) con el constructor parametrizado.
        // 2. Declara otra variable Cancion (c6) y haz que apunte al mismo objeto que
        // c5.
        // 3. Imprime (c5 == c6).
        // 4. Imprime (c5.equals(c6)).
        // 5. Cambia el título de la canción desde c6.
        // 6. Imprime c5 de nuevo. ¿Qué ha ocurrido?
        // (Pista: c5 y c6 apuntan al mismo objeto en memoria).
 
        // Tu código aquí ↓
 
        //    Cancion c5 = new Cancion("fuente de ortiz","Ed Maverick");
         //   Cancion c6 = new Cancion("fuente de ortiz", "Ed Maverick");
 
          //  System.out.println(c5 == c6);
          //  System.out.println(c5.equals(c6));
          //  c6.setTitutlo("Tren al Sur");
         //   System.out.println(c5);

 
 
        // ================================
        // EJERCICIO 6: null
        // ================================
        // 1. Declara una variable Pelicula (p3) y asígnale null.
        // 2. Imprime p3 por consola.
        // 3. Ahora intenta acceder a un método de p3, por ejemplo p3.get.
        // (Comenta esa línea después de probar, porque lanzará un error).
        // 4. ¿Qué error aparece en la consola?
        // 5. Explica: ¿qué significa realmente que una variable valga null?
 
        // Tu código aquí ↓
 
           // Pelicula p2;
 
}
}
