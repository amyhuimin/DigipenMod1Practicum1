public class Main {

    public static void main(String[] args) {
        int times = 3;
        int base = 2;
        int finalAmount = base;
        for(int j=1; j< times; j++){
            finalAmount = finalAmount * base;
        }
        System.out.print(finalAmount);

//        String interestType= args[0]; //1st argument entered will be interest type
//
//        switch(interestType){ //switch between simple or compound interest
//            case "simple":
//                //statements
//                break;
//            case "compound":
//                //statements
//                break;
//            default:
//                System.out.print("Please enter a valid interest type.");
//        }
//
//        double principal = Double.parseDouble(args[1]);


    }

    /*To calculate the final amount based on simple interest formula given an initial principal balance of $18000,
    an annual interest rate of 6%, and a time period of 3 years, the user
 java CET1012_P01_John_Doe simple 18000 6 3
 arg[0] = interestType
 arg[1] = principal
 arg[2] = interestRate
 arg[3] = timePeriodYears

The resulting output will be:
Final amount is $21240.00

compound interest formula given an initial principal balance of $1500, an annual interest rate of 4.3%
compounded quarterly for a time period of 6 years, the user will enter the following

java CET1012_P01_John_Doe compound 1500 4.3 6 4
 arg[0] = interestType
 arg[1] = principal
 arg[2] = interestRate
 arg[3] = timePeriodYears
 arg[4] = numOfTimesPerYear

resulting output will be:
Final amount is $1938.84

An example is if the user enters only four input arguments instead of the five as required to compute the
final value based on compound interest such as
java CET1012_P01_John_Doe compound 1500 4.3 6

error message will be shown as output instead.
You did not enter the correct number of inputs
    */

    /*
    * simple interest
    * A = P(1+rt)
    * finalAmount = principal * (1 + (interestRate * timePeriodYears))
    *
    * Compound
    * finalAmount = principal * (1 + (interestRate / numOfTimesPerYear)) ^ (numOfTimesPerYear * timePeriodYears)
    * Use loop to do powerOf!
    * */
}