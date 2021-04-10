import java.util.Scanner;
public class Ahorcado {
 public static void main(String[] args) {
 Integer a;
 Integer b;
 Integer opcion;
 Integer resultado;
 do{
<<<<<<< HEAD
 System.out.println("Ingrese su operacion /n 1 para sumar /n 2 para
restar /n 3 para multiplicar /n 4 para dividir");
=======
 System.out.println("Ingrese su operación /n 1 para sumar /n 2 para restar /n 3 para multiplicar /n 4 para dividir");
>>>>>>> ed98ee73512a381afc08a3487d78c938af0d8e2e
 opcion = teclado.next();
 }while(opcion < 1 && opcion > 4)
 System.out.println("Ingrese el primer numero");
 a = teclado.next();
 System.out.println("Ingrese el segundo numero");
 a = teclado.next();
<<<<<<< HEAD


 switch(opcion)
 {
     case 1:
     resultado = a + b;
     break;

     case 2:
     resultado = a - b;
     break;

     case 3:
     resultado = a * b;
     break;

     default:
     resultado = a / b;
     break;
=======
 if(opcion.equals(3)){
 resultado = a + b; 
 }else if(opcion.equals(2)){
 resultado = a - b;
 }else if(opcion.equals(1)){
 resultado = a * b;
 }else{
 resultado = a / b;
>>>>>>> ed98ee73512a381afc08a3487d78c938af0d8e2e
 }

 System.out.println("El resultado es " + resultado.toString());
 }
}
