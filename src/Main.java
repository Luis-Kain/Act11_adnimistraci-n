import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        SpecialCalculator myCalculator = new SpecialCalculator();
        Scanner sc = new Scanner(System.in);
        int controlVar;
        int num1;
        int num2;
        boolean isTrue = false;

        System.out.println("Calculadora");
        System.out.println("Lista de opciones, inserte un número de la lista siguiente");
        System.out.print("1.- Sumar\n2.- Restar\n3.- Multiplicar\n4.- Dividir\n5.- Salir");
        controlVar = sc.nextInt();
        System.out.println("Ingrese los números para realizar la operación seleccionada");
        System.out.print("Numero 1:");
        num1 = sc.nextInt();
        System.out.print("\nNumero 2:");
        num2 =sc.nextInt();
        do {
            switch (controlVar) {
                case 1:
                    myCalculator.addition(num1,num2);
                    break;
                case 2:
                    myCalculator.subtraction(num1,num2);
                    break;
                case 3:
                    myCalculator.multiplication(num1,num2);
                    break;
                case 4:
                    myCalculator.division(num1,num2);
                    break;
                case 5:
                    isTrue=true;
                    break;
                default:
                    System.out.println("insert un número del 1 al 5");
                    break;
            }
        }while (!isTrue);
    }
}