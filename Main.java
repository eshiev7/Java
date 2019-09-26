package nsu.ru;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] A = {5, 2, 7, 6, 7, 89, 0, 768, 678, 9, 78, 4242};
        int[][] twoArray = {{5, 7, 3, 17}, {7, 0, 1, 12}, {8, 1, 2, 3}, {0, 0, 0, 0}, {7, 6, 5, 0}};
        Collection<Integer> intArray = Arrays.asList(1,1,1,1,2,3,4,6,7,89,0);
        System.out.println("Summ " + sumCollection(intArray));
        System.out.println(getQuniqNumberCollection(intArray));
        System.out.println(getNumCount(intArray));
    }

    private static int sumCollection(Collection<Integer> myCollection){
        int sum = 0;
        for (Integer num : myCollection) {
            sum += num;
        }
        return sum;
    }

    public static Collection<Integer> getQuniqNumberCollection(Collection<Integer> myCollection){
    return new HashSet<>(myCollection);
    }

    public static Map<Integer, Integer> getNumCount(Collection<Integer> myCollection){
        Map<Integer, Integer> retutnMap = new HashMap<>();
        for(Integer num : myCollection){
            retutnMap.put(num, retutnMap.containsKey(num) ? retutnMap.get(num) + 1 : 1);
        }
     return retutnMap;
    }

}






