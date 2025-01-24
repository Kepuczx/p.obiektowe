public class TemperatureSensor implements Sensor{
    double value = 21.37;
    String status = "działa";

    @Override
    public double readValue(){
        if(status.equals("działa")){
            return value;
        }else{
            return 0;
        }
    }
    @Override
    public String getStatus(){
        return status;
    }
    @Override
    public void reset(){
        System.out.println("Resetowanie urządzenia.");
    }
}
