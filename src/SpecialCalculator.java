import java.util.Arrays;

public class SpecialCalculator {
    int numbersToGet;
    int[] numberArray;

    public void analyzeToGetPrimeNumbers(){
        numberArray = new int[numbersToGet];
        int indexTrueValue = 0;
        for (int i = 2; indexTrueValue<numbersToGet; i++){
            if(i == 2 || i == 3 || i == 5){
                numberArray[indexTrueValue] = i;
                indexTrueValue++;
            }
            else if (i%2 != 0 && i%3 != 0 && i%5 != 0 && i%7 != 0) {
                numberArray[indexTrueValue] = i;
                indexTrueValue++;
            }
        }
        printArray();
    }

    public void analyzeToGetFibonacciNumbers(){
        numberArray = new int[numbersToGet];
        numberArray[0] = 0;
        numberArray[1] = 1;
        for (int i = 1 ; i < numbersToGet-1 ; i++){
            numberArray[i+1] = (numberArray[i - 1] +  numberArray[i]);
        }
        printArray();
    }

    public void printArray(){
        for (int i = 0; i<numberArray.length; i++) {
            System.out.println(numberArray[i]);
        }
    }

    public SpecialCalculator() {
    }

    public SpecialCalculator(int numbersToGet, int[] NumberArray, int[] fibonacciNumbers) {
        this.numbersToGet = numbersToGet;
        this.numberArray = fibonacciNumbers;
    }

    public int getNumbersToGet() {
        return numbersToGet;
    }

    public void setNumbersToGet(int numbersToGet) {
        this.numbersToGet = numbersToGet;
    }

    public int[] getNumberArray() {
        return numberArray;
    }

    public void setNumberArray(int[] numberArray) {
        this.numberArray = numberArray;
    }

    @Override
    public String toString() {
        return "SpecialCalculator{" +
                "numbersToGet=" + numbersToGet +
                ", numberArray=" + Arrays.toString(numberArray) +
                '}';
    }
}
