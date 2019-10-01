package ru.nsu.home;

public abstract class Figure {

    private int x;
    private  int y;

    public Figure(int x, int y){
        setX(x);
        setY(y);
    }

    public double getArea(){
        return 0;
    }
    
}

