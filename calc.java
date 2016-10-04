import java.util.Scanner; //Import the scanner class
public class BMICalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Part 1 
        //First name
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstn = input.next();
        //Last name
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter your last name: ");
        String lastn = input2.next();
        //Height in feet
        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter your height in feet only: ");
        int feet = input3.nextInt();
        //Leftover inches in height
        Scanner input4 = new Scanner(System.in);
        System.out.print("Enter the leftover inches in your height: ");
        int inches = input4.nextInt();
        //Weight in pounds
        Scanner input5 = new Scanner(System.in);
        System.out.print("Enter your weight in pounds: ");
        Double weight = input5.nextDouble();
        
        //Part 2 Calculations
        int feet2 = feet * 12; //There are 12 inches per foot
        int height = feet2 + inches; //Add the leftover inches with the inches that were converted from feet
        double BMI = (703 * weight)/(height * height); //BMI formula = (703*lbs)/height*height)
        
        //Part 3 Display information
        System.out.println(); //Skip line to separate computed info
        System.out.println("Your computed information:");
        System.out.println("Name: " + firstn + " " + lastn);
        System.out.println("Height: " + feet +" ft, "+ inches + " in = " + height + " in");
        System.out.println("Weight: " + weight + " lbs");
        System.out.printf("BMI: " + "%.2f",BMI);
        System.out.println(); //Skip line to separate categories
        
        
        //Part 4 Categorize
        if (BMI < 18.5) {
            System.out.println("Underweight");
        } else {
            if (BMI >= 18.5 && BMI <= 24.9) {
                System.out.println("Normal Weight");
            } else {
                if (BMI >= 25 & BMI <=29.9) {
                    System.out.println("Overweight");
                } else {
                    if (BMI >= 30) {
                        System.out.println("Obesity");
                    }
                       
                }
            }
        }
        System.out.println();
        System.out.println("BMI Categories:");
        System.out.println("Underweight <= 18.5");
        System.out.println("Normal weight = 18.5 to 24.9");
        System.out.println("Overweight = 25 to 29.9");
        System.out.println("Obesity = BMI of 30 or greater");
      
        // TODO code application logic here
    }
    
}
