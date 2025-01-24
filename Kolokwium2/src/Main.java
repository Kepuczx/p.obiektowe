//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static <T extends Comparable<T>> boolean isEqualorNull(T a, T b) {
        if(a==b){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 1;
        System.out.println(isEqualorNull(a,b));
    }
}