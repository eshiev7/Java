package ru.nsu.Geometry;

class Rectangle extends Figure{

    private double x1;
    private double x2;
    private double y1;
    private double y2;
    private double a;
    private double b;

    Rectangle(int x1, int y1, int x2, int y2){
        setTopLeft(x1, y1);
        setBottomRight(x2, y2);
        setSides();
    }

    public void setTopLeft(int x, int y) {
        this.x1 = x;
        this.y1 = y;
    }

    public void setBottomRight(int x, int y) {
        this.x2 = x;
        this.y2 = y;
    }

    public void setSides(){
        this.a = Math.abs(this.x1-this.x2);
        this.b = Math.abs(this.y1-this.y2);
    }

    public double getLenght() {
        return Math.max(this.a, this.b);
    }

    public double getWidth() {
        return Math.min(this.a, this.b);
    }

    @Override
    public double getArea(){
        return this.a*this.b;
    }

    @Override
    public void moveX(int x) {
        this.x1 += x;
        this.x2 += x;
    }

    @Override
    public void moveY(int y) {
        this.y1 += y;
        this.y2 += y;
    }

    @Override
    public String getCoords(){
        return "x1: " + this.x1 + ", y1: " + this.y1 + ", x2: " + this.x2 + ", y2: " + this.y2;
    }

    public void changeSize(double n){
        double newA = a*n;
        double newB = b*n;
        double sideA = this.a - newA;
        double sideB = this.b - newB;
        if (this.x1 > this.x2){
            this.x1 -= sideA/2;
            this.y1 -= sideB/2;
            this.x2 += sideA/2;
            this.y2 += sideB/2;
        }
        else{
            this.x1 += sideA/2;
            this.y1 += sideB/2;
            this.x2 -= sideA/2;
            this.y2 -= sideB/2;
        }
        this.a = newA;
        this.b = newB;

    }

    public void changeASize(int a){
        if (this.x1 > this.x2){
        this.x2 += a;
        this.a += a;
        }else{
            this.x1 += a;
            this.a += a;
        }
    }

    public void changeBSize(int b){
        if (this.y1 > this.y2){
            this.y2 += b;
            this.b += b;
        }else{
            this.y1 += b;
            this.b += b;
        }
    }

}
