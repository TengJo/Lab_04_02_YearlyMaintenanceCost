public class Main
{

    public static void main(String[] args)
    {
	double springMaintenanceCost;
    double summerMaintenanceCost;
    double fallMaintenanceCost;
    double winterMaintenanceCost;
    double yearlyMaintenanceCost;
        springMaintenanceCost = 1023.73;
        summerMaintenanceCost = 973.90;
        fallMaintenanceCost =  821.10;
        winterMaintenanceCost = 1149.50;
        yearlyMaintenanceCost = springMaintenanceCost + summerMaintenanceCost + fallMaintenanceCost + winterMaintenanceCost;
        System.out.println("The spring maintenance cost was: " + springMaintenanceCost);
        System.out.println("The summer maintenance cost was: " + summerMaintenanceCost);
        System.out.println("The fall maintenance cost was: " + fallMaintenanceCost);
        System.out.println("The winter maintenance cost was: " + winterMaintenanceCost);
        System.out.println("The total yearly maintenance cost was: " + yearlyMaintenanceCost);
    }
}
