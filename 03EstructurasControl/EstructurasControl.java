//Menu de 14 opciones suguientes

/*
1-Bono o descuento
2.-Convertir numero decimales a binarios 
3-Convertir Temperaturas
4.-Numero de positivos a negativos 
5-Tiendita
6.-Area y perimetro
7.-Tabla
8.-Factorial
9.-Dibujitos
10.-Figura hueca
11.-Patron 
12.-Diamante
13.-Calculadora
14.Salir
*/

//Declarar las librerias 
//Se debe de estructurar el tipo de dato acorde a la entrada (si es entero como entero si es char como caracter)

import java.util.Scanner;
class EstructurasControl{
    // metodo principal 
    public static void main(String[] args){
        // el manejo de objetos, nos ayuda a poder instancear,(mandar a llamar a el objeto)
        //para hacer una istancia , es necesario 1.- identificar el tipo de objeto 
        //2.- nombrar al objeto
        // 3.- crear al objreto
        
        Scanner entrada = new Scanner(System.in);
        // crear una instancia del objeto de la entrada por defecto de la computadora 
        // vamos a identificar on scanner el tipo de dato que se esta instanceando
        //entrada es el objeto que va a poder identificar si es int, double,float etc
        // es declarar a la bariable que se va a utilizar en el programna 
        //n las variabled son de dos tipos global y local 
        // si la declaro dentro de un metodo es lical
        @SuppressWarnings("unused")
        int opcion , numbinario , total , cantidadproducto ,num1, edad,positivos =0,negativos= 0,num = 0,factorial=1,numero,producto; 
        float resultdo= 0 , compra = 0,temperatura,precio;
        @SuppressWarnings("unused")
        double f,k,r,c,area,base,altura,volumen,perimetro,radio,descuento = 0,producto1;
        @SuppressWarnings("unused")
        String nombreproducto,respuesta,nombres;
        String binario = "";
        char letra ;
        do {
            // a qui va todo el programa 
         System.out.println(" Bienvenido al programa");
         System.out.println(" Elige alguna opcion deceada ");
         System.out.println(" 1.-Descuento por edad");
         System.out.println(" 2.-Convertir numero decimal a binario");//profe
         System.out.println(" 3.-Convertir temperaturas");
         System.out.println(" 4.-Numeros positivos y negativos");
         System.out.println(" 5.-Tiendita");//profe
         System.out.println(" 6.-Area y Perimetro");
         System.out.println(" 7.-Tabla ");//profe
         System.out.println(" 8.-Factorial");
         System.out.println(" 9.-Dibujito");//profe
         System.out.println(" 10.-Figura hueca");
         System.out.println(" 11.-Patrones de codigo ");
         System.out.println(" 12.-Diamante ");
         System.out.println(" 13.-Calculadora");
         System.out.println(" 14.- Salir");

opcion = entrada.nextInt();
// menu
switch(opcion){
    case 1:
        System.out.println(" Ingresa la edad que tienes ");
        edad=entrada.nextInt();
        if(edad>65){
                System.out.println(" descuento del 40%");
        }else if(edad<=21){
                System.out.println(" indica si tus padres son socios  (si/no)");
                respuesta = entrada.next();
          if(respuesta.equals("si")||respuesta.equals("si")){
                System.out.println(" tu descuento es del 45%");
          }  else if(respuesta.equals("no")||respuesta.equals("no")){
                System.out.println(" tu descuento es del 25%");

          } 

        }

    break;
    case 2:
    //decimal a binario
    System.out.println(" ingresa un numero positivo entero que desee convertir a binario");
    numbinario = entrada.nextInt();
    // primero tengo que saber que sea positivo
    if( numbinario > 0){
    // se cuantas veces el numero se va dividir entre 2?
    while (numbinario%2 == 0) {
        if (numbinario%2 == 0){
            binario = "0" + binario;
        }else{
            binario = "1" + binario;
        }
numbinario = (int)numbinario/2;
    }
}else if (numbinario == 0){
binario = "0" + binario;
}else {
    binario = "no se puede convertir numeros negativos solo positivos";
}
System.out.println("el numero binario es: " + binario);
    break;
    case 3:
    System.out.println(" selecciona el tipo de temperatura ");
    System.out.println(" 1.- grados celcius");
    System.out.println(" 2.- Grados fahrenheit");
    System.out.println(" 3.-Grados kelvin");
    System.out.println(" 4.-Grados Rankine");
    opcion = entrada.nextInt();
    switch(opcion){
        case 1:
            System.out.println(" ingrsa la temperaturan a convertir");
            temperatura = entrada.nextInt();
            f=(temperatura*9/5)+32;
            System.out.println("grados fahrenheit :"+f+ "fahrenheit");
            k = temperatura+273;
            System.out.println(" grados kelvin: "+k+"kelvin");
            r = (temperatura +273)* 9/5;
            System.out.println(" grados rankine ;" + r );
            break;
         case 2:
         System.out.println("Ingrese la temperatura a convertir: ");
         temperatura = entrada.nextInt();

         c = (temperatura - 32) * 5 / 9;
         System.out.println("grados celsius: " + c + "celcius");
         k = (temperatura + 459.67) * 5 / 9;
         System.out.println("grados kelvin: " + k + "kelvin");
         r = temperatura * 9 / 5;
         System.out.println("grados rankine: " + r + "rankine");
         break;

     case 3:
         System.out.println("Ingrese la temperatura a convertir : ");
         temperatura = entrada.nextInt();

         c = temperatura - 273;
         System.out.println("grados celsius: " + c + "celcius");
         f= (temperatura * 9 / 5) - 459.67;
         System.out.println("grados fahrenheit: " + f + "fahrenheit");
         r = temperatura * 9 / 5;
         System.out.println("grados rankine: " + r + "rankine");
         break;
         case 4:
         System.out.println("Ingrese la temperatura a convertir: ");
         temperatura = entrada.nextInt();

         c = (temperatura - 491.57) / 1.8;
         System.out.println("grados celsius: " + c + "celcius");
         f = temperatura - 459.67;
         System.out.println("grados fahrenheit: " + f + "fahrenheit");
         k = temperatura / 1.8;
         System.out.println("grados kelvin: " + k + "kelvin");
         break;

     default:
         System.out.println("Ingrese la opcion correcta");
         break;
    }

    break;
    case 4:
    System.out.println("ingresa la cantidad de numeros a calcular");
                    total = entrada.nextInt();

                    for (int i = 1; i <= total; i++) {
                        System.out.println("Ingrese el numero: ");
                        num1 = entrada.nextInt();

                        if (num1 > 0) {
                            positivos  ++;
                        } else {
                            negativos ++;
                        }
                    }

                    System.out.println("total de numero positivos: " + positivos);
                    System.out.println("totsl de numeros negativos: " + negativos);
                    

    break;

    case 5:
    System.out.println(" Bienvenidos a la tiendita Kawaii");
    System.out.println(" Porfavor ingrese el numero de produtos que decea comprar");
    total=entrada.nextInt();
    for(int l=1; l <= total; l++){
           System.out.println(" Ingrese el nombre del producto : ");
           nombreproducto = entrada.next();
           System.out.println(" Ingresa el precio: ");
           precio = entrada.nextFloat();
          System.out.println(" Ingrese la cantidad del producto: ");
          cantidadproducto =entrada.nextInt(); 

          producto1 = precio*cantidadproducto;
          compra = compra + resultdo;
    }
        System.out.println(" El total de la compra es: " + compra );


    break;
    case 6:
    System.out.println("Seleccione una figura para calcular sus dimenciones :");
    System.out.println("1- rectángulo" +" area y perimetro");
    System.out.println("2- triángulo"+"area y perimetro");
    System.out.println("3- esfera"+"volumen");
    System.out.println("4- cilindro"+"volumen");
    opcion = entrada.nextInt();

    switch (opcion) {
        case 1:
            System.out.print("ingrese la base del rectángulo: ");
            base = entrada.nextDouble();
            System.out.print("ingrese la altura del rectángulo: ");
            altura = entrada.nextDouble();

            area = base * altura;
            perimetro = 2 * (base + altura);

            System.out.println("el area del rectángulo es: " + area);
            System.out.println(" el perímetro del rectángulo es : " + perimetro);
            break;

        case 2:
            System.out.print("ingrese la base del triángulo: ");
            base = entrada.nextDouble();
            System.out.print("ingrese la altura del triángulo: ");
            altura = entrada.nextDouble();

            area = (base * altura) / 2;
            perimetro = base * 3;

            System.out.println("el area del triángulo es : " + area);
            System.out.println("el perímetro del triángulo es: " + perimetro);
            break;

        case 3:
            System.out.print("ingrese el radio de la esfera: ");
            radio = entrada.nextDouble();

            volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);

            System.out.println("el volumen de la esfera  es: " + volumen);
            break;

        case 4:
            System.out.print("ingrese el radio de la base del cilindro: ");
            radio = entrada.nextDouble();
            System.out.print("ingrese la altura del cilindro: ");
            altura = entrada.nextDouble();
            volumen = Math.PI * Math.pow(radio, 2) * altura;

            System.out.println("el volumen del cilindro es: " + volumen);
            break;

        default:
            System.out.println("opción no válida.");
            break;
}

    break;
    case 7:
    //bamos a imprimir una tabla
    //

 
 for (int n = 1; n <= 10; n ++){
    System.out.println(n + " " + (n*10) + " " +(n*100) + " " + (n*1000) +"");
 }


    
    break;
    case 8:
     System.out.println("Factorial de un numero ");
     System.out.println("Igrese un numero para calcular su factorial ");
     numero = entrada.nextInt();
     while (numero != 0){
        for (int i=1; i<=num; i++){
            factorial *= factorial;
        }
        System.out.println();
     } 
      System.out.println("el factorial de " + numero + " es "+ factorial);



    break;
    case 9:
    System.out.println(" cuadrado magico");
    System.out.println(" ingrese el tamaño del cuadrado a pintar ");
    num = entrada.nextInt();
    if (num>=1 && num<20){
        //ciclo de filas
        for(int i = 1; i<=num; i++){
            //columnas
            for (int j =1; j <=num; j++){
                 System.out.print("*");

            }
           System.out.println("");// salto de linea 
        }
        
    }else{
        System.out.println(" solo numeros de 1 a 20");
    }
    break;
    case 10:
     System.out.println(" cuadrado hueco");
    System.out.println(" ingrese el lado de un cuadreado para obtener su imagen ");
    num = entrada.nextInt();
    if (num>=1 && num<20){
        //filas
        for(int i = 1; i<=num; i++){
         System.out.print("*");
         }
         System.out.println();
         //centro
         for(int i = 1; i<=num-2; i++){
            System.out.print("*");
         for(int j = 1; j<=num-2; j++){

         System.out.print(" ");
         }
          System.out.println("*");
         }
         
         //columnas
         for (int j =1; j <=num; j++){
        System.out.print("*");
           
         } 
         
        }else{
        System.out.println(" solo numeros de 1 a 20");
    }
    break;
    case 11:
    System.out.println(" patron de codigo");
    System.out.println(" ingrese un numero para obtemer un patron");
    num = entrada.nextInt();
 for(int i=1; i <=num ;i ++){
    for(int x = 1; x<= num; x++){
        if ( (i + x)% 2 == 0){
            System.out.println("*");
        }else { System.out.print("");
    }
    }
    System.out.println();
 }
 
    break;
    case 12:
    System.out.println(" diamante");
    System.out.println("ingrese un numero para el tamaño que lo decees");
num = entrada.nextInt();
for(int i = 0 ; i < num; i ++){
for(int j=num-1-i; j>= 0; j --){
    System.out.print(" ");
}
for(int j= 0; j <= i; j++){
    System.out.print(" *");
}
System.out.println("");
}

for(int i = 0 ; i < num; i++){//filas
    for(int j =0; j <=i; j++){//columnas
        System.out.print(" ");
    }
   for(int j = num -1-i; j>=0; j--){
    System.out.print(" *");
   }
   System.out.println("");
}

    break;
    case 13:
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
    break;
    case 14:
    
    break;
    default:
    System.out.println(" elija una opcion valida ");
    break;
}

            // a qui debo de preguntar 
            System.out.println( " deceas repetir el programa ?, escribe s para si");
            //vamos a leer el primer caracter de la entrada por defecto de la coputadora 
           letra = entrada.next().charAt(0);

            
           

        } while(letra =='s'|| letra =='S');
    }
    }



}while(letra == 's' || letra == 'S');
 

}



}