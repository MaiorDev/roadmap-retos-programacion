import java.util.*;

public class Meir {
    public static void main(String[] args) {

        String texto = "Hola, Java!";

        // ── Longitud ──
        System.out.println(texto.length());

        // ── Acceso a caracteres ──
        System.out.println(texto.charAt(0));
        System.out.println(texto.indexOf("Java"));
        System.out.println(texto.lastIndexOf("a"));

        // ── Subcadenas ──
        System.out.println(texto.substring(6));
        System.out.println(texto.substring(6, 10));

        // ── Concatenación ──
        String concat = texto + " Qué tal?";
        System.out.println(concat);
        System.out.println(texto.concat(" Mundo"));

        // ── Repetición ──
        System.out.println("Java ".repeat(3));

        // ── Mayúsculas y minúsculas ──
        System.out.println(texto.toUpperCase());
        System.out.println(texto.toLowerCase());

        // ── Reemplazo ──
        System.out.println(texto.replace("Java", "Mundo"));
        System.out.println(texto.replaceAll("[aeiou]", "*"));

        // ── División ──
        String csv = "Java,Python,Kotlin";
        String[] partes = csv.split(",");
        for (String parte : partes) {
            System.out.println(parte);
        }

        // ── Unión ──
        String union = String.join(" - ", "Java", "Python", "Kotlin");
        System.out.println(union);

        // ── Interpolación ──
        String nombre = "MaiorDev";
        int edad = 25;
        System.out.println("Hola " + nombre + ", tienes " + edad + " años");
        System.out.printf("Hola %s, tienes %d años%n", nombre, edad);
        System.out.println(String.format("Hola %s, tienes %d años", nombre, edad));

        // ── Verificación ──
        System.out.println(texto.contains("Java"));
        System.out.println(texto.startsWith("Hola"));
        System.out.println(texto.endsWith("!"));
        System.out.println(texto.isEmpty());
        System.out.println("   ".isBlank());
        System.out.println(texto.equals("Hola, Java!"));
        System.out.println(texto.equalsIgnoreCase("hola, java!")); // true

        // ── Limpieza ──
        String espacios = "   Hola Mundo   ";
        System.out.println(espacios.trim());
        System.out.println(espacios.strip());

        // ── Conversión ──
        System.out.println(String.valueOf(42));
        System.out.println(String.valueOf(true));
        System.out.println(Integer.parseInt("123"));
        System.out.println(Double.parseDouble("3.14"));

        // ── Recorrido ──
        for (char c : texto.toCharArray()) {
            System.out.print(c + " ");
        }

        // ── Invertir ──
        String invertido = new StringBuilder(texto).reverse().toString();
        System.out.println(invertido);

        // ── Comparación ──
        System.out.println("Java".compareTo("Python"));
        System.out.println("Java".compareToIgnoreCase("java"));


        System.out.println("Ingresa la primera palabra: ");
        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine();
        System.out.println("Ingresa la segunda palabra: ");
        String palabra2 = sc.nextLine();

        System.out.println("PALINDROMO");
        palindromo(palabra);
        palindromo(palabra2);
        System.out.println("ANAGRAMAS");
        anagramas(palabra, palabra2);
        System.out.println("ISOGRAMAS");
        isograma(palabra);
        isograma(palabra2);
    }

    static void palindromo(String palabra){
        String invertido = new StringBuilder(palabra).reverse().toString();
        if (palabra.equals(invertido)){
            System.out.println("es palindromo");
        }
        else{
            System.out.println("no es palindromo");
        }
    }

    static void anagramas(String palabra, String palabra2){
        if (palabra.length() == palabra2.length()){
            char[] palabraArray = palabra.toCharArray();
            Arrays.sort(palabraArray);
            char[] palabra2Array = palabra2.toCharArray();
            Arrays.sort(palabra2Array);
            if (Arrays.equals(palabraArray, palabra2Array)){
                System.out.println("son anagramas");
            }
            else{
                System.out.println("no son anagramas");
            }
        }
    }

    static void isograma(String palabra){
        int[] conteo = new int[26];
        for (char c : palabra.toCharArray()){
            conteo[c - 'a']++;
        }
        for (int i : conteo){
            if (i > 1){
                System.out.println("no es un isograma");
                return;
            }
        }
        System.out.println("es un isograma");
    }
}