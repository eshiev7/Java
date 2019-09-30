package ru.nsu.home;

class Square extends Figure{

    private int a;

    Square(int x, int y, int a){
        super(x, y);
        this.a = a;
    }
    public void setA(int a) {
        this.a = a;
    }

    public double getA() {
        return this.a;
    }

    public double getArea(){
        return Math.pow(this.a,2);
    }

}
