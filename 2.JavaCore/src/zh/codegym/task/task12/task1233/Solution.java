package zh.codegym.task.task12.task1233;

/* 
同形体即将来临
*/

public class Solution {

    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndIndex(data);

        System.out.println("最小值为 " + result.x);
        System.out.println("最小元素的索引为 " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }

        //在此编写你的代码
        int min = array[0];
        int index = 0;
        int minimum = array[index];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimum) {
                index = i;
                minimum = array[i];
            }

        }

        return new Pair<Integer, Integer>(minimum, index);
    }


    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
