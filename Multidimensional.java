class MultiDimensional {
    public static void main(String[] args) {
        int nums[][][][][] = new int[3][3][3][3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    for (int l = 0; l < 3; l++) {
                        for (int m = 0; m < 3; m++) {
                            nums[i][j][k][l][m] = (int)(Math.random() * 10);
                        }
                    }
                }
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    for (int l = 0; l < 3; l++) {
                        for (int m = 0; m < 3; m++) {
                             System.out.print(nums[i][j][k][l][m] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println("----"); // separator for clarity
                }
            }
        }

    }
}
