
    import java.util.Scanner;

    class Converter
    {

        public static void main(String[] args) {
            // Exchange rates for conversion
            double usdToEuroRate = 0.82;
            double usdToGBP = 0.72;
            double usdToINR = 74.93;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the amount in USD:");
            double amountUSD = scanner.nextDouble();

            System.out.println("Choose the currency to convert to:");
            System.out.println("1. Euro");
            System.out.println("2. GBP");
            System.out.println("3. INR");
            int choice = scanner.nextInt();

            double convertedAmount = 0;

            switch (choice) {
                case 1:
                    convertedAmount = amountUSD * usdToEuroRate;
                    System.out.println("Converted amount: " + convertedAmount + " Euro");
                    break;
                case 2:
                    convertedAmount = amountUSD * usdToGBP;
                    System.out.println("Converted amount: " + convertedAmount + " GBP");
                    break;
                case 3:
                    convertedAmount = amountUSD * usdToINR;
                    System.out.println("Converted amount: " + convertedAmount + " INR");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

            scanner.close();
        }
    }


