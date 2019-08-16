public class SortedSearch {

    private static int findMid(int[] sortedArray, int left, int right, int lessThan) {
        int middle = left + (right - left) / 2;

        if (sortedArray[middle] == lessThan) {
            while (middle - 1 > 0 && sortedArray[middle - 1] == lessThan)
                --middle;
            return middle;
        }
        if (middle <= left) {
            while (middle <= right && sortedArray[middle] < lessThan)
                ++middle;
            return middle;
        }
        if (sortedArray[middle] < lessThan) {
            left = middle;
        } else {
            right = middle;
        }
        return findMid(sortedArray, left, right, lessThan);
    }

    public static int countNumbers(int[] sortedArray, int lessThan) {
        int left = 0;
        int right = sortedArray.length - 1;
        return findMid(sortedArray, left, right, lessThan);
    }

    public static void main(String[] args) {
        System.out.println(SortedSearch.countNumbers(new int[] { 1, 3, 5, 7 }, 4));
    }
}