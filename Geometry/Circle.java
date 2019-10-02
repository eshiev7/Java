package ru.nsu.Geometry;

class Circle extends Figure{

    private int r;
    private int x1;
    private int y1;

    Circle(int x, int y, int r){
        setR(r);
        setCenter(x, y);
    }

    public void setR(int r) {
        this.r = r;
    }

    public void setCenter(int x, int y){
        this.x1 = x;
        this.y1 = y;
    }

    public double getR(){
        return this.r;
    }

    @Override
    public double getArea(){
        return Math.PI*Math.pow(this.r,2);
    }

    @Override
    public String getCoords() {
        return "x1: " + this.x1 + ", y1: " + this.y1;
    }

    @Override
    public void moveX(int x){
        this.x1 += x;
    }
    @Override
    public void moveY(int y){
        this.y1 += y;
    }
    public void  changeR(int r){
        setR(r);
    }

    public void cangeCoords(int x, int y){
        setCenter(x, y);
    }

}
