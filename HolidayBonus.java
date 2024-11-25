
public class HolidayBonus 
{
	public HolidayBonus()
	{	
	}
	public static double[] calculateHolidayBonus(double[][] data) {

		double[] bonuses = new double[data.length];
		for (int i = 0; i < data.length; i++) 
		{
			bonuses[i] = TwoDimRaggedArrayUtility.getLowestInRow(data, i);
		}
		return bonuses;		
	}


    public static double calculateTotalHolidayBonus(double[][] data) {
        
        double[] bonuses = calculateHolidayBonus(data);

    
        double totalBonus = 0;
        for (double bonus : bonuses) {
            totalBonus += bonus;
        }

        return totalBonus;
    }

}




