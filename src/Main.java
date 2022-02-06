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
        System.out.println("The spring maintenance was " +springMaintenanceCost + ", the summer maintenance was " + summerMaintenanceCost + ", the fall maintenance was " + fallMaintenanceCost + ", the winter maintenance cost " + winterMaintenanceCost + ", and the yearly maintenance was " + yearlyMaintenanceCost);
    }
}
