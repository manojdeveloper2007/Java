public class JaggedArray {
    public static void main(String[] args) {
        int[][] newArr = new int[3][];

        newArr[0] = new int[]{1,4,2,7};
        newArr[1] = new int[]{5,1,14};
        newArr[2] = new int[]{0,1,7,22,9,4};

        // Display
        for(int i=0;i<newArr.length;i++){
            for(int j=0;j<newArr[i].length;j++){
                System.out.print(newArr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
