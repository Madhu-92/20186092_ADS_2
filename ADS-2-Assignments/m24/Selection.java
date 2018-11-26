/**
 * Class for selection sort.
 */
final class Selection {
    /**
     * Constructs the object.
     */
    private Selection() {
        //unused.
    }
    /**
     * SORT THE ARRAY.
     * @param arr : array
     * @return sorted array
     */
    public static int[] sort(final int[] arr) {
        int n = arr.length;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first
            // element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}