public class LinearSearch {

    public static boolean find(int key, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] items = {1, 2, 3, 4, 5};
        int keyToFind = 3;

        boolean found = find(keyToFind, items);

        System.out.println(found);
    }
}
