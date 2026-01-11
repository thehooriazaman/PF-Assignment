import.java.util.Scanner;

    public.static.void.main(String[] args) {
    {
        double discount dsp;
        Scanner.ki = new Scanner(System.in); 
            System.out.println("Enter Current Price: ");
            doublecsp = ki.nextDouble();
        {
            if (actPrice < 0) 
                System.out.println("Price must not be negative!");
            
        } while (actPrice < 0);

        {
            System.out.println("Enter Discount Percent: ");
            discdp = ki.nextDouble();

            if (discPercent < 0) {
                System.out.println("Discount must be greater than zero!");
            }
        } while (discPercent < 0);

        discPrice = actPrice * discPercent / 100;
        discFinal = actPrice - discPrice;

        System.out.println("Final Price after Discount: " + discFinal);

        ki.close();
    }
}
