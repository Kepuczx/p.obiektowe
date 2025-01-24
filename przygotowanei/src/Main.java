



public class Main {

    public static <T> boolean isEqual(T pierwszy, T drugi){
        if(pierwszy == drugi){
            return true;
        }
        return false;
    }

    public static <T> T[] swap(T[] array, int first, int second){
        if(first < 0 || second >= array.length){
            System.out.println("Nieprawidlowe indeksy!");
            return null;
        }else{
            T temp = array[first];
            array[first] = array[second];
            array[second] = temp;
            return array;
        }

    }

    public static <T extends Comparable<T>> T minValue(T[] array){
        T min = array[0];
        for(int i = 1; i < array.length; i++){
            if(min.compareTo(array[i]) > 0){
                min = array[i];
            }
        }
        return min;
    }

    public static <T extends Animal> T findMax(T element1, T element2){
        if(element1.getWiek() > element2.getWiek()){
            return element1;
        }else{
            return element2;
        }
    }

    public static <T extends Animal> T findMin(Pair<? extends T> pair){
        if(pair.getFirst().getWiek() > pair.getSecond().getWiek()){
            return pair.getFirst();
        }
        else{
            return pair.getSecond();
        }


    }





    public static void main(String[] args) {


    }
}