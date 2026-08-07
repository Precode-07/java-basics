public class jaggedArray {
    public static void main(String[] args) {
        int[][] nums = new int[3][]; //Jagged Array 
        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];

        for (int[] row : nums) {
            for (int j = 0; j < row.length; j++) {
                row[j] = (int)(Math.random() * 10);
            }
        }

        for(int n[]:nums){
            for(int m:n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
