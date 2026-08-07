public class RandOm {
    public static void main(String[] args) {
        int nums[][] = new int[3][4];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                 // In this we use Math.random() function that will generate random number
                 // but we multiply it with 10 or 100 as initially this function generates double value 1.0,2.0 etc.
                 nums[i][j] = (int)(Math.random() * 10);
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                 System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

    }
}