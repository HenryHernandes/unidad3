import java.util.*;
public class Ejemplo03 { 
public static void main( String[] args ){
 Scanner sc = new Scanner( System.in );
 System.out.print("Nota: "); 
int nota = sc.nextInt();
 if (nota >= 7 ){ System.out.println("Enhorabuena!!");
 System.out.println("Has aprobado"); 
} 
else System.out.println("Lo siento, ha reprobado");
 } 
}