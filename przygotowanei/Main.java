import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.*;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static <T> void printUnique(Collection<T> items){
        HashSet<T> set = new HashSet<>(items);
        for(T item : set){
            System.out.println(item);
        }
    }

    public static <T> ArrayList<T> mergeLists(ArrayList<T> list1, ArrayList<T> list2){
        ArrayList<T> result = new ArrayList<>();
        result.addAll(list1);
        result.addAll(list2);
        return result;
    }

    public static <T> boolean isPalindrome(LinkedList<T> list){
        int size = list.size();
        for(int i = 0; i < size/2; i++){
            if(!list.get(i).equals(list.get(list.size()-1-i))){
                return false;
            }
        }
        return true;
    }

    public static <T> HashSet<T> findUniqueElements(List<T> list){
        HashSet<T> result = new HashSet<>();
        for(T element : list){
            result.add(element);
        }
        return result;
    }

    public static <T> TreeSet<T> findElementsInRange(TreeSet<T> treeSet, T lowerBound, T upperBound){
        return new TreeSet<>(treeSet.subSet(lowerBound, true, upperBound, true));
    }

    public static void main(String[] args) {
        Collection<Integer> numbers = List.of(1,2,2,3,4,4,5,5,6,6,7,7);
        printUnique(numbers);

        LinkedList<Integer> list1 = new LinkedList<>(List.of(1,2,1));
        LinkedList<Integer> list2 = new LinkedList<>(List.of(4,5,6));

        System.out.println(list1);
        System.out.println(isPalindrome(list1));

        List<Integer> list = new ArrayList<>(List.of(1,1,44,2,44));

        HashSet<Integer> lsita = findUniqueElements(list);
        System.out.println(lsita);

        TreeSet<Integer> treeSet = new TreeSet<>(List.of(1,2,3,4,5,6));
        TreeSet<Integer> treeSet1 = findElementsInRange(treeSet, 3, 4);
        System.out.println(treeSet1);





    }
}