package ex8;

public class Separator {
    private int[] array;
    private int evenNumbersCount = 0;

    public Separator(int[] array) {
        this.array = array;
        evaluateEvenNumbers();

    }


    private void evaluateEvenNumbers(){

        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0) evenNumbersCount++;
        }
    }

    public int[] even(){
        int evenArray[] = new int[evenNumbersCount];
        int evenArrayIterator = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                evenArray[evenArrayIterator] = array[i];
                evenArrayIterator++;
            }
        }
        return evenArray;
    }

    public int[] odd(){
        int oddArray[] = new int[array.length - evenNumbersCount];
        int oddArrayIterator = 0;
        for(int i = 0; i < array.length; i++){
            if(!(array[i] % 2 == 0)){
                oddArray[oddArrayIterator] = array[i];
                oddArrayIterator++;
            }
        }
        return oddArray;
    }
}
