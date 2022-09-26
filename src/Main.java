import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        SpecialCalculator myCalculator = new SpecialCalculator();
        Scanner sc = new Scanner(System.in);
        boolean isTrue = true;
        do{
            System.out.print("calculadora de numeros primos y fibonacci\npara elegir que tipo de calculo" +
                    " que quieres hacer deberas ingresar el numero correspondiente a la lista siguiente\n" +
                    "1) numeros primos\n2) fibonacci\ningresa el numero:");
            switch(sc.nextInt()){
                case 1:
                    System.out.print("\nahora ingresa la cantidad de numeros a obtener:");
                    myCalculator.setNumbersToGet(sc.nextInt());
                    myCalculator.analyzeToGetPrimeNumbers();
                    break;
                case 2:
                    System.out.print("\nahora ingresa la cantidad de numeros a obtener:");
                    myCalculator.setNumbersToGet(sc.nextInt());
                    myCalculator.analyzeToGetFibonacciNumbers();
                    break;
                default:
                    System.out.println("favor de escoger un numero del 1 al 3");
            }
            System.out.print("¿Deseas usar la calculadora de nuevo?\n ingresa 1 para si, ingresa cualquier otro numero" +
                    "para no:");
            if(sc.nextInt() != 1){
                isTrue = false;
            }
        }while(isTrue);


    }
}