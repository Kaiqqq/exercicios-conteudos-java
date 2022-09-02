package Entities;

public class Student {

    public String name;
    public double a, b, c;

    public double total() {
        return a + b + c;
    }

    public double missing() {
        if(total() < 60.0) {
            return 60.0 - total();
        } else {
            return 0.0;
        }
    }
}
