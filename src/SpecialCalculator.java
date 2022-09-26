import java.util.Arrays;

public class SpecialCalculator {
    int numbersToGet;
    int[] primeNumbers;
    int[] fibonacciNumbers;

    public void analyzeToGetPrimeNumbers(){
        primeNumbers = new int[numbersToGet];
        int indexTrueValue = 0;
        for (int i = 2; indexTrueValue<numbersToGet; i++){
            if(i == 2 || i == 3 || i == 5){
                primeNumbers[indexTrueValue] = i;
                indexTrueValue++;
            }
            else if (i%2 != 0 && i%3 != 0 && i%5 != 0 && i%7 != 0) {
                primeNumbers[indexTrueValue] = i;
                indexTrueValue++;
            }
        }
        printArray(primeNumbers);
    }

    public void analyzeToGetFibonacciNumbers(){
        fibonacciNumbers = new int[numbersToGet];
        fibonacciNumbers[0] = 0;
        fibonacciNumbers[1] = 1;
        for (int i = 1 ; i < numbersToGet-1 ; i++){
            fibonacciNumbers[i+1] = (fibonacciNumbers[i - 1] +  fibonacciNumbers[i]);
        }
        printArray(fibonacciNumbers);
    }

    public void printArray(int[] myArray){
        for (int i = 0; i<myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

    public SpecialCalculator() {
    }

    public SpecialCalculator(int numbersToGet, int[] primeNumbers, int[] fibonacciNumbers) {
        this.numbersToGet = numbersToGet;
        this.primeNumbers = primeNumbers;
        this.fibonacciNumbers = fibonacciNumbers;
    }

    public int getNumbersToGet() {
        return numbersToGet;
    }

    public void setNumbersToGet(int numbersToGet) {
        this.numbersToGet = numbersToGet;
    }

    public int[] getPrimeNumbers() {
        return primeNumbers;
    }

    public void setPrimeNumbers(int[] primeNumbers) {
        this.primeNumbers = primeNumbers;
    }

    public int[] getFibonacciNumbers() {
        return fibonacciNumbers;
    }

    public void setFibonacciNumbers(int[] fibonacciNumbers) {
        this.fibonacciNumbers = fibonacciNumbers;
    }

    @Override
    public String toString() {
        return "SpecialCalculator{" +
                "numbersToGet=" + numbersToGet +
                ", primeNumbers=" + Arrays.toString(primeNumbers) +
                ", fibonacciNumbers=" + Arrays.toString(fibonacciNumbers) +
                '}';
    }
}
