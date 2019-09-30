package ru.nsu.home;

public class Figure {

    private int x;
    private  int y;

    public Figure(int x, int y){
        setX(x);
        setY(y);
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }


}

