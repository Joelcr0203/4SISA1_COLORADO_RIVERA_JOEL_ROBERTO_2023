public class EntradaTexto{

    public static void main(String[] args){

        //Declaracion de variable
        String nombre;
        //Mensaje para el usuario
        System.out.println("Por favor ingresa tu nombre");
        
        //Asignar que operacion o comportamiento se le otorga a la variable
        nombre = System.console().readLine();

        //System es la clase del sistema
        //Console() Es el metodo que puede obtener los datos de la consola 
        //Redline() ES el metodo que puede dar lectura a los datos introducidos en la cosnola

        System.out.println("Hola " + nombre + " Bienvenido ");





    }




}