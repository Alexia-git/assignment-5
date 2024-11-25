import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HolidayBonusStudentTest {
	private double[][] dataSet1 = {{10.0, 20.2, 30.3, 14.4}, {50.5, 65.6, 17.7}, {88.8, 19.9}};
	private double[][] dataSet2 = {{-13.0,20.0,3.0,15.0}, {150.5, -6.6, 7.7}, {40.8, 16.9}};

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testCalculateHolidayBonusA() {
		try {
			double[] result = HolidayBonus.calculateHolidayBonus(dataSet1);
			assertEquals(10.0, result[0], .001);
			assertEquals(17.7, result[1], .001);
			assertEquals(19.9, result[2], .001);
		} catch (Exception e) {
			fail("This should not have caused an Exception");
		}
	}	@Test
	public void testCalculateHolidayBonusb() {
		try {
			double[] result = HolidayBonus.calculateHolidayBonus(dataSet2);
			assertEquals(-13.0, result[0], .001);
			assertEquals(-6.6, result[1], .001);
			assertEquals(16.9, result[2], .001);
		} catch (Exception e) {
			fail("This should not have caused an Exception");
		}
	}
	
	@Test
	public void testCalculateTotalHolidayBonusA() {
		assertEquals(47.6, HolidayBonus.calculateTotalHolidayBonus(dataSet1), .001);
	}
	@Test
	public void testCalculateTotalHolidayBonusb() {
		assertEquals(-2.7, HolidayBonus.calculateTotalHolidayBonus(dataSet2), .001);
	}



}
