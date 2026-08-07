public class Arrays {
    public static void main(String[] args) {
        /* Arrays - In Java Arrays is a fixed-sized, homogenous data structure
        that store multiple values of same data types in contigenous memory locations. */
        String cars[] = {"Audi","BMW","Fortuner","Mahindra","Volkswagon"};
        for(int i=0;i<=4;i++){
            System.out.println(cars[i]);
        }

        int nums[][] = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                 System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

    }
}
