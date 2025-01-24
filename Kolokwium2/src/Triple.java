public class Triple <T>{
    private T First;
    private T Second;
    private T Third;
    public Triple(T First, T Second, T Third){
        this.First = First;
        this.Second = Second;
        this.Third = Third;
    }

    public T getFirst() {
        return First;
    }

    public T getSecond() {
        return Second;
    }

    public T getThird() {
        return Third;
    }
}
