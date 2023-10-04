 import java.util.Scanner;
import java.util.concurrent.ExecutionException;

import javax.sound.midi.Soundbank;

import java.lang.Math;

 public class Figura{
    double lado, altura,area,perimetro,letra,lado1,lado2,Base;
    int opcion;
    Scanner entrada = new Scanner (System.in);
    public void menu(){
        do{
System.out.println("Binevenido al programa de calculo de areas y perimetros");
System.out.println("elija una opcion deseada");
System.out.println("1.- cuadrado");
System.out.println("2.-Rectangulo");
System.out.println("3.-Triangulo");
System.out.println("salir");
opcion =entrada.nextInt();
switch(opcion){
    case 1:
    calcularcuadrado();
    break;
    case 2:
    calcularrectangulo();
    break;
    case 3:
    calcularTriangulo();
    break;
default:
System.out.println("Gracias por elegir este programa");
    break;
}
System.out.println(" deceas repetir el programa digita S ");
letra = entrada.next().charAt (0);
        }while( letra == 's'|| letra == 's');

    }
public void calcularcuadrado(){
    
System.out.println(" ingrsa el valor del lado del cuadrado");
try {
lado = entrada .nextDouble();
}catch( Exception e){
System.out.println("ingresa solo numeros ");
System.out.println("error" + e.getMessage());
    }
perimetro = lado *4;
area = lado*lado;
System.out.println("el perimetro es de "+ perimetro +" el areas es de" + area);
    


}
public void calcularrectangulo(){
    System.out.println(" ingrsa u valor para un lado del rectangulo");
try {
lado1 = entrada .nextDouble();
}catch( Exception e){
System.out.println("ingresa solo numeros ");
System.out.println("error" + e.getMessage());
    }
    System.out.println(" ingrsa el segundo valor para el lado del rectangulo");
try {
lado2 = entrada .nextDouble();
}catch( Exception e){
System.out.println("ingresa solo numeros ");
System.out.println("error" + e.getMessage());
    }
perimetro = lado1 *2 + lado2*2;
area = lado1*lado2;
System.out.println("el perimetro es de "+ perimetro +" el areas es de" + area);
    


}
public void calcularTriangulo(){
System.out.println(" ingrsa el valor del lado 1 del triangulo");
try {
lado1 = entrada .nextDouble();
}catch( Exception e){
System.out.println("ingresa solo numeros ");
System.out.println("error" + e.getMessage());
    }
    System.out.println(" ingrsa el valor del lado 2  del triangulo");
try {
lado2 = entrada .nextDouble();
}catch( Exception e){
System.out.println("ingresa solo numeros ");
System.out.println("error" + e.getMessage());
    }
    System.out.println(" ingrsa el valor de la base del triangulo");
try {
Base = entrada .nextDouble();
}catch( Exception e){
System.out.println("ingresa solo numeros ");
System.out.println("error" + e.getMessage());
    }
    System.out.println(" ingrsa el valor de la altura del triangulo");
try {
altura = entrada .nextDouble();
}catch( Exception e){
System.out.println("ingresa solo numeros ");
System.out.println("error" + e.getMessage());
    }
perimetro = lado1+ lado2+Base;
area = Base*altura/2;
System.out.println("el perimetro es de "+ perimetro +" el areas es de" + area);
    
    

}
 }