class conditional{
    public static void main(String[] args) {
        // If Statement : Execute a block of code only if the condition is true.
        int age = 10;
        if (age>=18){
            System.out.println("You are a kid.");
        }
        // if-else Statement: Have to paths : One if condition is true and another if condition is false.
        if (age>=18){
            System.out.println("Adult");
        } else{
            System.out.println("Minor");
        }
        //if-else if-else Ladder: Check multiple conditions in a sequence.
        int marks = 75;
        if(marks>=90){
            System.out.println("Grade A");
        }
        else if(marks>=75){
            System.out.println("Grade B");
        }
        else if(marks>=50){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Failed");
        }
        //Nested if : An if inside an another if.
        int num = 10;
        if(num>0){
            if(num%2==0){
                System.out.println("Positive Even");
            }else{
                System.out.println("Positive Odd");
            }
        }
        //switch statement:
        int day = 3;
        switch(day) {
            case 1:System.out.println("Monday");
                break;
            case 2:System.out.println("Tuesday");
                break;
            case 3:System.out.println("Wednesday");
                break;
            case 4:System.out.println("Thursday");
                break;
            case 5:System.out.println("Friday");
                break;
            case 6:System.out.println("Saturday");
                break;
            case 7:System.out.println("Sunday");
                break;    
            default:
                throw new AssertionError("Please select day from a week !");
        }

    }
}