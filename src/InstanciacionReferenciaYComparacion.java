import utilidades.Cancion;
import utilidades.Pelicula;

public class InstanciacionReferenciaYComparacion {
    public static void main(String[] args) {
        
    
        Cancion c1 = new Cancion();
        Cancion c2 = new Cancion("Clocks", "Coldplay");
        System.out.println(c1);
        System.err.println(c2);
       
    
        // EJERCICIO 2: 
        Cancion c3 = new Cancion("Yellow", "Coldplay");
        Cancion c4 = new Cancion("Yellow", "Coldplay");
        System.out.println(c3 == c4);

 
        // EJERCICIO 3: Comparación con equals()
         System.out.println(c3.equals(c4));


        // EJERCICIO 4: Comparación en Pelicula
        Pelicula p1 = new Pelicula("Inception", 2010);
        Pelicula p2 = new Pelicula("Inception", 2010);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));


        // EJERCICIO 5: Referencias
        Cancion c5 = new Cancion("Viva la Vida", "Coldplay");
        Cancion c6 = c5;
        System.out.println(c5 == c6);
        c6.setTitutlo("Paradise");
        System.out.println(c5);
 
        // EJERCICIO 6: null
        Pelicula p3 = null;
        System.out.println(p3);
         p3.getTitulo();
}
}

// RESPUESTAS DE REFLEXIÓN
// ================================
// Ejercicio 1: ¿Qué diferencia hay entre el constructor por defecto y el parametrizado?
// Respuesta: ...

// Ejercicio 2: ¿Por qué da false al comparar con == dos objetos con los mismos datos?
// Respuesta: ...

// Ejercicio 3: ¿Qué diferencia hay entre == y equals()? ¿Por qué ahora sí devuelve true?
// Respuesta: ...

// Ejercicio 4: ¿Por qué en Pelicula equals no funciona como en Cancion?
// Respuesta: ...

// Ejercicio 5: ¿Qué ocurre cuando modificas el objeto a través de c6? ¿Qué demuestra?
// Respuesta: ...

// Ejercicio 6: ¿Qué error aparece al acceder a un método de p3 siendo null?
// ¿Qué significa realmente que una variable valga null?
// Respuesta: ...

       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
        /*// EJERCICIO 2: Comparación con ==
        /
        Cancion c3 = new Cancion("Yellow", "Coldplay");
        Cancion c4 = new Cancion("Yellow", "Coldplay");
        System.out.println(c3 == c4);
 
 
        // ================================
        // EJERCICIO 3: Comparación con equals()
        // ================================
        // Tu código aquí ↓
        System.out.println(c3.equals(c4));
 
 
        // ================================
        // EJERCICIO 4: Comparación en Pelicula
        // ================================
        // Tu código aquí ↓
        Pelicula p1 = new Pelicula("Inception", 2010);
        Pelicula p2 = new Pelicula("Inception", 2010);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
 
 
        // ================================
        // EJERCICIO 5: Referencias
        // ================================
        // Tu código aquí ↓
        Cancion c5 = new Cancion("Viva la Vida", "Coldplay");
        Cancion c6 = c5;
        System.out.println(c5 == c6);
        c6.setTitulo("Paradise");
        System.out.println(c5);
 
 
        // ================================
        // EJERCICIO 6: null
        // ================================
        // Tu código aquí ↓
        Pelicula p3 = null;
        System.out.println(p3);
        // p3.getTitulo(); /
    }
}
 */

