import java.util.Scanner;

public class CarRunner {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter total miles driven in gas mode:");
        double miles = scn.nextDouble();

        System.out.print("Enter total gallons used in gas mode:");
        double gallons = scn.nextDouble();

        System.out.print("Enter total miles used in electric mode:");
        double totalElectricMiles = scn.nextDouble();

        System.out.print("Enter total kWh used in electric mode:");
        double totalkWh = scn.nextDouble();

        scn.close();

        Hybrid hy = new Hybrid();
        hy.setMilesfromGas(miles);
        hy.setGallonsfromGas(gallons);
        hy.setElectricMiles(totalElectricMiles);
        hy.setTotalkWh(totalkWh);
        
        if (hy.calcMPGe() == 0 & hy.calcgasMPG() == 0) {
            System.out.print("You went nowhere!" + '\n');
        }
        
        if (hy.calcMPGe() == 0 & hy.calcgasMPG() > 0) {
            System.out.print("You used your car in Full Gas Mode!" + '\n');
            System.out.print("This is the MPG:" + '\n' + hy.calcgasMPG() + '\n');
        }
       
        if (hy.calcgasMPG() == 0 & hy.calcMPGe() > 0) {
            System.out.print("You used your car in Full Electric Mode!" + '\n');
            System.out.print("This is the MPGe:" + '\n' + hy.calcMPGe() + '\n');
        }
        
        if (hy.calcgasMPG() > 0 & hy.calcMPGe() > 0) {
            System.out.print("You used your car in Hybrid Mode!" + '\n');
            System.out.print("This is the AvgMPG" + '\n' + ((hy.calcgasMPG() + hy.calcMPGe())/2) + '\n');
        }
    }
}