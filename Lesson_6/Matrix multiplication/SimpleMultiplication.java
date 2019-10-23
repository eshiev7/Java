package Lesson_6;

import java.util.LinkedList;
import java.util.List;

public class SimpleMultiplication {

    private List<List<Integer>> matrix;
    private List<Integer> vector;
    private List<Integer> resultVector = new LinkedList<>();

    public SimpleMultiplication(List<List<Integer>> matrix, List<Integer> vector) {
        this.matrix = matrix;
        this.vector = vector;
    }

    public List<Integer> getResult() throws IncorrectInputData {
        for (int i = 0; i < matrix.size(); i++) {
            int element = 0;
            for (int j = 0; j < vector.size(); j++) {
                element += matrix.get(i).get(j) * vector.get(j);
            }
            resultVector.add(element);
        }
        return resultVector;
    }
}
