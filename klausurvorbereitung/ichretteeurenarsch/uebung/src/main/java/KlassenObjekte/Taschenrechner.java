package KlassenObjekte;

public class Taschenrechner {
    private double value;

    public Taschenrechner(){
        value = value;
    }

    public void add(double a){
       value = value + a;

    }
    public double getValue(){
        return value;
    }
    public void clear(){
        value = 0;
    }

    public static void main(String[] args) {
        Taschenrechner tr = new Taschenrechner();
        tr.add(10);
        tr.add(5);
        System.out.println(tr.getValue());
    }


}
