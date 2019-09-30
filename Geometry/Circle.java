package ru.nsu.home;

class Circle extends Figure{

    private int r;

    Circle(int x, int y, int r){
        super(x, y);
        setR(r);
    }

    public void setR(int r) {
        this.r = r;
    }

    public double getR(){
        return this.r;
    }

    public double getArea(){
        return Math.PI*Math.pow(this.r,2);
    }
}
