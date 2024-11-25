import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class twoDimRaggedArrayTest {
	private double[][] dataSet1 = {{13,20,3},{14,-7.7,5.0},{10,7,8,29}};
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	@Test
	  public void testGetTotalSTUDENT() {
	    
	    assertEquals(101.3,TwoDimRaggedArrayUtility.getTotal(dataSet1),.001);
	}
	
	@Test
	  public void testGetAverageSTUDENT() {
		  assertEquals(10.129,TwoDimRaggedArrayUtility.getAverage(dataSet1),.001);
	}
	@Test
	public void testGetRowTotal() {
		assertEquals(11.3,TwoDimRaggedArrayUtility.getRowTotal(dataSet1,1),.001);
	}
	 @Test
	  public void testGetColumnTotalSTUDENT() {
	   
	    assertEquals(37.0,TwoDimRaggedArrayUtility.getColumnTotal(dataSet1,0),.001);
	    assertEquals(16.0,TwoDimRaggedArrayUtility.getColumnTotal(dataSet1,2),.001);
	   	 
	 }
	 @Test
	  public void testGetHighestInRowSTUDENT() {
	  
	    assertEquals(20.0,TwoDimRaggedArrayUtility.getHighestInRow(dataSet1,0),.001);
	    assertEquals(14.0,TwoDimRaggedArrayUtility.getHighestInRow(dataSet1,1),.001);
	 }
	 @Test
	  public void testGetHighestInRowIndexSTUDENT() 
	 {
	
	    assertEquals(1,TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet1,0));
	    assertEquals(0,TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet1,1));
	 }
	 @Test
	  public void testGetLowestInColumnSTUDENT() 
	 {
	   
	    assertEquals(10.0,TwoDimRaggedArrayUtility.getLowestInColumn(dataSet1,0),.001);
	    assertEquals(3.0,TwoDimRaggedArrayUtility.getLowestInColumn(dataSet1,2),.001);
	 }
	 @Test
	  public void testGetLowestInColumnIndexSTUDENT() {
	    
	    assertEquals(-1,TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet1,0));
	    assertEquals(-1,TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet1,2));
	 }
	  @Test
	  public void testGetLowestInArraySTUDENT() {
	 
	    assertEquals(-7.7,TwoDimRaggedArrayUtility.getLowestInArray(dataSet1),.001);
	    
	  }

}

