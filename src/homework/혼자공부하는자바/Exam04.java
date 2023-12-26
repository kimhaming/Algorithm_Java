package homework.혼자공부하는자바;

public class Exam04 {
    public static void main(String[] args) {
        int max = 0;
        int[] array = {1, 20, 3, 8, 2};

        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        System.out.println(max);
    }
}
