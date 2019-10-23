package Lesson_6;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException, IncorrectInputData, InterruptedException {

        FileWorker newFile = new FileWorker("tetx.txt");
        List<List<Integer>> matrix = newFile.getMatrixList();
        List<Integer> vector = newFile.getVectorList();

        if (matrix.get(0).size() != vector.size()) {
            throw new IncorrectInputData("Количество столбцов в матрице не совпадает с количестром элементов в векторе - перемножение невозможно");
        }

        long begin = System.currentTimeMillis();
        SimpleMultiplication simpleMultiplication = new SimpleMultiplication(matrix, vector);
        List<Integer> firstResult = simpleMultiplication.getResult();
        try(FileWriter fileWriter = new FileWriter("SimpleMultilication.txt")){
            fileWriter.write(firstResult.toString().replace("[","").replace("]",""));
        }
        long out = System.currentTimeMillis() - begin;
        System.out.println("Результат работы однопоточной программы: " + firstResult + "; затрачено времени: " + out);

        List<Integer> secocdResult = new LinkedList<>();
        long rebegin = System.currentTimeMillis();
        for (int i = 0; i < matrix.size(); i++) {
            Multiplication bob = new Multiplication(matrix.get(i), vector);
            bob.start();
            bob.join();
            secocdResult.add(i, bob.getElement());
        }
        try(FileWriter fileWriter = new FileWriter("Multilication.txt")){
            fileWriter.write(secocdResult.toString().replace("[","").replace("]",""));
        }
        long reout = System.currentTimeMillis() - rebegin;
        System.out.println("Результат работы многопоточной программы: " + secocdResult + "; затрачено времени: " + reout);

    }
}
