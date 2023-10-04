import java.util.Scanner;
class Ejercicios{
    //objeto para la entrada de datos
    Scanner entrada = new Scanner(System.in);
    //variables globales
    char op;
    //menu
    public void menu(){
        System.out.println("Ejercicios que ahi les quedan de tarea");
        System.out.println("a.- calculadora");
        System.out.println("b.-conversion de unidades");
        System.out.println("c.-crear cuadro magico");
        System.out.println("d.-desplazamiento de un cuadrito");
        System.out.println("elija una opcion deseada");


        op = entrada.next().charAt(0);

        switch(op){
            case 'a':
            //implemento los metodos
            Ejercicio1();
            break;
            case 'b':
            Ejercicio2();
            break;
            case 'c':
            Ejercicio3();
            case 'd':  
            Ejercicio4();
            break; 
            default:
            System.out.println("gracias por jugar");
            break;


    }

}
public void Ejercicio1(){
    //se lleman metodos vacios porque no poseen argumentos y no son metodos
    //o funciones que necesiten una entrada o salida de algun tipo de dato

    //calculadora
    double num1 = 0.00, suma = 0.00, multi = 1.00, division = 1.00 ;
    char operacion;

    System.out.println(" selecciona la operacion que deceas realizar");
    System.out.println("a.- suma y resta");
    System.out.println("b.-multiplicacion ");
    System.out.println("c.-division");

    operacion = entrada.next().charAt(0);
    switch(operacion){
        case 'a':
        //vamos a sumar tantos numeros como desee el usuario 
        // cuando coloque 0 la opercion termina 
        System.out.println("para detener la suma o resta,ingrese el 0");
        do{
           
            System.out.println("Escriba los numeros que  desee sumar o restar ");
            num1 = entrada.nextDouble();
            suma += num1;
            //suma= suma +num1;
        }while (num1 != 0);
        System.out.println("El resultado de la operacion es:"+ suma);


        break;
        case 'b':
        System.out.println("para detener la multiplicacion,ingrese el 0");
        do{
           
            System.out.println("Escriba los numeros que  desee multiplicar ");
            num1 = entrada.nextDouble();
            if(num1!=0){
                multi*=num1;
            }
            
        }while (num1 != 0);
        System.out.println("El resultado de la operacion es:"+ multi);

        break;
        case 'c':
        System.out.println("para detener la division ,ingrese el 0");
        do{
           
            System.out.println("Escriba los numeros que  desee dividir ");
            num1 = entrada.nextDouble();
            if(num1!=0){
                multi/=num1;
            }
            
        }while (num1 != 0);
        System.out.println("El resultado de la operacion es:"+ multi);
        break;
        default:
        System.out.println(" opcion na valida ");
    
    }
}
public void Ejercicio2(){
    double metros = 0.00, velocidad = 0.00, kg = 0.00, pulgadas = 0.0254,gramos =1000,cm =100, libra = 0.453592, ms = 3.60,kh = 0.278,yd =1.094,millas = 0.000621;
    metros = entrada.nextDouble();
    double conversion1,conversion2;
    System.out.print (" selecciona la cantidad que deceas convertir acorde a las siguientes unidades");
    
    System.out.print (" a.-metros a cm y pulgadas");
    System.out.print (" b.-kilogramos a libras y gramos");
    System.out.print (" c.-m/s a km/h");
    System.out.print (" d.-metrso a yardas y millas");

    op = entrada.next().charAt(0);
    switch(op){
    case 'a':
    System.out.println("ingresa los metros que deceas transformar");
    metros =entrada.nextDouble();
    conversion1 = metros * cm;
    conversion2 = metros * pulgadas;
    System.out.println("la cantidad en metros es :" + metros +" de m a cm son" 
    + conversion1 + " de m a pulgadas son:" + conversion2);

    break;
     case 'b':
     System.out.println("ingresa los kilogramos  que deceas transformar");
    metros =entrada.nextDouble();
    conversion1 = kg * gramos;
    conversion2 = kg * libra;
    System.out.println("la cantidad en kg es :" + kg +" de kg a gramos son" 
    + conversion1 + " de kg a libras son:" + conversion2);
    break;
     case 'c':
System.out.println("ingresa los mtros sobre segundo a cnevertir ");
    metros =entrada.nextDouble();
    conversion1 = ms * kh;
    System.out.println("la cantidad en metros sobre segundos es :" + ms +" de m/s a k/h son" 
    + conversion1 );
    break;
     case 'd':
     System.out.println("ingresa los metros que deceas transformar");
    metros =entrada.nextDouble();
    conversion1 = metros * yd;
    conversion2 = metros * millas;
    System.out.println("la cantidad en metros es :" + metros +" de m a yardas  son :" 
    + conversion1 + " de m a millas son:" + conversion2);
    break;
    default:
    System.out.println("opcion no valida");
    }

}
public void Ejercicio3(){

    int punto_inicial = num/2 ;
    int  num,i_ant,j_ant;
    int [][] cuadromagico = new int [num][num];
    int temp = 10;
    System.out.println(" ingresa un numero para el cuadro magico");
    num = entrada.nextInt();
    for (int i = 0; i<num; i++ ){
    for (int  j = 0; j<num; j++){
        cuadromagico[i][temp] = 0;

    }

    }
    int i = 0;
     int j= punto_inicial;
     while (temp != (num *num)+1){
        if (cuadromagico[i][j] == 0){
            cuadromagico [i][j] = temp;
        }else {
            i = i_ant +1;
            j = j_ant;
            cuadromagico[i][j]=temp;

        }
        i_ant = i;
        j_ant = j;
        temp++;
        j++;
        i--;
        if (i<0 && j==num){
        i = num -1;
        j = 0;
 }else if ( i< 0){
    i = i +num;
 }else if(j==num){
    j =0;
 }
     }
for (int x= 0 ;x<num; x++){
    String resultado = "";
    for (int y = 0 ; y<num; y++){
        resultado = resultado + " " + cuadromagico[x][y];
    }
    System.out.println(""+resultado);
}

}
public void Ejercicio4(){
    int n;
        System.out.println("Ingrese el número de filas que desea imprimir: ");
        n = entrada.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 8; j++) {
                if (i % 2 == 0) {
                if (j == 1) {
                    System.out.print(" ");
                    System.out.print("*");
                } else {
                    System.out.print("*");
                }
                } else {
                System.out.print("*");
                }
            }
            System.out.println("");
        }

}
}
 