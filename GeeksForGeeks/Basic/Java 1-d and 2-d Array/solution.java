class Complete {
     public static ArrayList<Integer> array(int[][] arr, int[][] brr, int n) {
        int[] oneDArray = brr[0]; 
        return array(arr, oneDArray, n);
    }

    public static ArrayList<Integer> array(int[][] arr, int[] brr, int n) {
        int diagonalSum = 0;
        int maxElement = brr[0];
        for (int i = 0; i < n; i++) {
            diagonalSum += arr[i][i]; 
            if (brr[i] > maxElement) {
                maxElement = brr[i]; 
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.add(diagonalSum);
        result.add(maxElement);
        return result;
    }
}
