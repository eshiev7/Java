package ru.nsu.Geometry;

class Square extends Rectangle{

    private double a;
    private double b;
    private double x1;
    private double x2;
    private double y1;
    private double y2;

    public Square(int x1, int y1, int x2, int y2){
        super(x1,y1,x2,y2);
        setA(Math.abs(x1-x2));

    }
    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return this.a;

    }

    @Override
    public double getArea(){
        return Math.pow(this.a,2);
    }

    @Override
    public String getCoords(){
        return "x1: " + this.x1 + ", y1: " + this.y1 + ", x2: " + this.x2 + ", y2: " + this.y2;
    }

}
