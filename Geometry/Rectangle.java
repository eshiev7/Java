package ru.nsu.home;

class Rectangle extends Figure{

    private int a;
    private int b;

    Rectangle(int x, int y, int a, int b){
        super(x, y);
        setA(a);
        setB(b);
    }

    Rectangle(int x, int y, int a){
        super(x, y);
        setA(a);
        setB(a);
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getArea(){
        return this.a*this.b;
    }

}
