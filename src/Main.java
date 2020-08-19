import java.util.Scanner; 

class Main {
    public static void main(String[] args) {
        System.out.print("Enter a log size(m): ");
        Scanner input = new Scanner(System.in);
        float logSize, logMax, logMass, logTotal;
        logSize = input.nextFloat();
        logMax = 1100;
        logMass = 20;
        logTotal = logMax/(logMass/logSize);

        if(logSize == 0.5||
           logSize == 0.25||
           logSize == 1){

            System.out.print(logTotal);
        }else{
            System.out.print("Enter a valid log size please.");
        }
}
}
