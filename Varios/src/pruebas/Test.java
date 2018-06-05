package pruebas;


public class Test {

    public static int atributo1;

    Test (int atrib) {atributo1 = 0;}

    public static void main (String[ ] Args) {

        System.out.println ("Mensaje 1");

        System.out.println ("Atributo 1 vale" + Test.getAtrib1());

    } //Cierre del main

    public static int getAtrib1() {return atributo1;}

} //Cierre de la clase