package Lesson_6;

import java.util.LinkedList;
import java.util.List;

public class Multiplication extends Thread {

    private List<Integer> matrixVector;
    private List<Integer> vector;
    private int element = 0;

    public Multiplication(List<Integer> matrixVector, List<Integer> vector) {
        this.matrixVector = matrixVector;
        this.vector = vector;
    }

    @Override
    public void run() {
        for (int j = 0; j < vector.size(); j++) {
            element += matrixVector.get(j) * vector.get(j);
        }
    }

    public int getElement() {
        return element;
    }
}
