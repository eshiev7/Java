package Lesson_6;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileWorker {

    private String fileName;
    private List<List<Integer>> matrixList = new LinkedList<>();
    private List<Integer> vectorList = new LinkedList<>();

    public FileWorker(String fileName) throws IOException {
        this.fileName = fileName;
        this.setMatrixList();
    }

    private void setMatrixList() throws IOException {
        List<String> separation = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        for (int i = 0; i < separation.size(); i++) {
            if (separation.get(i).length() > 0) {
                List<Integer> intLine = new LinkedList<>();
                for (String strElement : separation.get(i).split(",")) {
                    intLine.add(Integer.parseInt(strElement));
                }
                matrixList.add(intLine);
            } else {
                break;
            }
        }

        for (String strElement : separation.get(separation.size() - 1).split(",")) {
            vectorList.add(Integer.parseInt(strElement));
        }
    }

    public List<List<Integer>> getMatrixList() {
        return matrixList;
    }

    public List<Integer> getVectorList() {
        return vectorList;
    }

}
