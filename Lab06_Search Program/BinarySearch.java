public class BinarySearch {

    public static boolean find(int key, int arr[]) {
    int upper = arr.length - 1;
    int lower = 0;

    while (lower <= upper) {
        int mid = (lower + upper)/2;
        if (arr[mid] == key){
            return true;
        }
        else if (arr[mid] < key){
            lower = mid+1;
        } else {
            upper = mid -1;
        }
    }
    return false;
    }

    public static void main(String[] args) {
        int[] items = {1, 2, 3, 4, 5};
        int keyToFind = 6;

        boolean found = find(keyToFind, items);

        System.out.println(found);
    }
}
