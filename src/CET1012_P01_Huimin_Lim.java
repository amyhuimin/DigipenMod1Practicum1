public class CET1012_P01_Huimin_Lim {

    public static void main(String[] args) {

        if(args.length < 4){ //if inputs less than required, prints error msg w info
            System.out.print("You have entered a wrong number of inputs. Please check your inputs and try again.");
            return;
        }

        String interestType= args[0].toLowerCase(); //1st arg entered is interest type
        double p = Double.parseDouble(args[1]); //2nd arg entered is principal amount
        if(p <= 0){ //if input is 0 or less, prints error msg w info
            System.out.print("Your principal amount must be mossssre than 0. Please enter a valid principal amount.");
            return;
        }
        double r = Double.parseDouble(args[2]) / 100; //3rd arg is interest rate
        if (r <0){ //if input is -ve, prints error msg w info
            System.out.print("Interest rate cannot be negative. Please enter a valid interest rate.");
            return;
        }
        int t = Integer.parseInt(args[3]); //4th arg is time period in years
        if(t<0){ //if input is -ve, prints error msg w info
            System.out.print("Please enter a valid time period in years. It cannot be less than 0.");
            return;
        }

        double finalAmt;

        switch(interestType){ //switch between simple or compound interest depending on user input
            case "simple":
                finalAmt = p * (1 + r * t ); //calculate finalAmt base on simple interest formula
                String formattedFinalAmt= String.format("%.2f", finalAmt);
                System.out.print("Your final amount is $" + formattedFinalAmt + ", with a principal amount of $" + args[1] + " and " + args[2] + "% interest rate over a period of " + args[3] + " years.");
                break;

            case "compound":
                if(args.length < 5){ //if wrong num of inputs, show error message for user to rectify
                    System.out.print("You have entered a wrong number of arguments for calculating compound interest. Are you trying to calculate simple interest? Please check your inputs and try again.");
                    return;
                }

                int n = Integer.parseInt(args[4]); //5th arg entered is the num of times interest applied per year
                if(n <=0){ //if input is -ve, prints informative error msg
                    System.out.print("Banks apply compound interest rates at least once a year. Please enter a valid number - it must be more than 0.");
                    break;
                }
                int numCompounded = n * t; //to find num of times to loop
                double base = 1 + (r / n) ; //to find base amt for loop calculation
                double compoundedAmt = base; //we need base amt to stay the same for calculation purposes
                for (int j=1; j< numCompounded; j++) { //j is the num of times to multiply (nt) in the formula
                    compoundedAmt *= base;
                }
                finalAmt = p * compoundedAmt; //calculate final amount
                String formattedCompoundAmt= String.format("%.2f", finalAmt); //convert to 2 dec places
                System.out.print("Your final amount is $" + formattedCompoundAmt + ", with a principal amount of $" + args[1] + " and " + args[2] + "% interest rate over a period of " + args[3] + " years, compounded " + args[4] + " times yearly."); //print readable statement instead of just number
                break;

            default: //if 1st arg entered is wrong, prints error msg w info
                System.out.print("Please enter a valid interest type, either simple or compound. Otherwise, please check your spelling. Input is not case-sensitive.");
        }
    }
}