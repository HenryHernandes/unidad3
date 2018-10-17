/*
*programa que lee numeros hasta que se lee un negativo y muestra la suma de los numeros leidos
*/
import java.util.*;
public class Ejemplo10{
public static void main(String[]args){
int suma = 0,num;
Scanner sc = new Scanner (System.in);
System.out.print("introdusca un numero:");
num = sc.nextInt();
while(num>=0){
suma = suma + num;
System.out.print("introdusca un numero:");
}
System.out.println("la suma es:"+suma);
}
}