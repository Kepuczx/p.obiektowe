import java.util.ArrayList;

public class Counter<T>{
    ArrayList<T> list;
    int count = 0;
    public Counter(){
        this.list = new ArrayList<>();
    }
    public void add(T item){
        list.add(item);
        count++;
    }
    public void showlist(){
        for(T item : list){
            System.out.println(item);
        }
    }
    public int getCount(){
        return count;
    }
}
