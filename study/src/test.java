public class test {

    static int partition(int[] arr, int l, int r) {
        int temp = arr[l];
        while (l < r) {
            while (l < r && temp < arr[r])
                r--;
            if (l < r) {
                arr[l] = arr[r];
                l++;
            }
            while (l < r && temp >= arr[l])
                l++;
            if (l < r) {
                arr[r] = arr[l];
                r--;
            }
        }
        arr[l] = temp;
        return l;
    }

    static void quickSort(int[] arr, int head, int tail) {
        if (head < tail) {
            int mid = partition(arr, head, tail);
            quickSort(arr, head, mid - 1);
            quickSort(arr, mid + 1, tail);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 2, 4, 6, 7, 5, 5, 3};
        for (int i : arr)
            System.out.print(i + " ");

        System.out.println();

        quickSort(arr, 0, arr.length - 1);

        for (int i : arr)
            System.out.print(i + " ");

    }
}
