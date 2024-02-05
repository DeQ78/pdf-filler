package net.devquest.tools.resourceManager;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Assertions;

public class LocalResourceTest {

	private static LocalResource localResource;
	private static String workDir = "aaaaaaaaaaaaaaaaaa";
//	System.getProperty("user.home")

	@BeforeAll
	void beforeAll() {
		localResource = new LocalResource(workDir);
	}

	@Test
	static void getMountPointTest() {
		String mountPoint = localResource.getMountPoint();
		System.out.println("------------ mountPoint = " + mountPoint);
//		Assertions.assertSame(workDir, workDir);
		Assertions.assertSame(mountPoint, workDir);

//		Assertions.assertEquals(localResource.getMountPoint(),workDir);
	}

//	public void setMountPoint(String mountPoint) {
//		this.mountPoint = mountPoint;
//	}
//
//	public void readDirectory() {
//		this.readDirectory(this.curDir);
//	}

}

/*
 * public class CalculatorServiceTest {
 * 
 * private CalculatorService calculatorService;
 * 
 * @BeforeEach void beforeEach() { calculatorService = new CalculatorService();
 * }
 * 
 * @Test void shouldAddTwoCorrectNumbers() { // given String a = "10"; String b
 * = "20";
 * 
 * // when int result = calculatorService.add(a, b);
 * 
 * // then assertEquals(30, result); }
 * 
 * @Test void shouldThrowExceptionOnInvalidFirstArgument() { // given String a =
 * "wrong-number"; String b = "10";
 * 
 * // when Throwable throwable = catchThrowable(() -> calculatorService.add(a,
 * b));
 * 
 * // then assertThat(throwable) .isInstanceOf(NumberFormatException.class)
 * .hasMessage("For input string: \"wrong-number\"");
 * 
 * }
 * 
 * @Test void shouldThrowExceptionOnInvalidSecondArgument() { // given String a
 * = "10"; String b = "wrong-number";
 * 
 * // when Throwable throwable = catchThrowable(() -> calculatorService.add(a,
 * b));
 * 
 * // then assertThat(throwable) .isInstanceOf(NumberFormatException.class)
 * .hasMessage("For input string: \"wrong-number\"");
 * 
 * }
 * 
 * @Test void shouldThrowExceptionOnEmptyFirstArgument() { // given String a =
 * ""; String b = "10";
 * 
 * // when Throwable throwable = catchThrowable(() -> calculatorService.add(a,
 * b));
 * 
 * // then assertThat(throwable) .isInstanceOf(NumberFormatException.class)
 * .hasMessage("For input string: \"\"");
 * 
 * }
 * 
 * @Test void shouldThrowExceptionOnIntegerOverFlow() { // given String a =
 * Integer.MAX_VALUE + ""; String b = "11";
 * 
 * // when Throwable throwable = catchThrowable(() -> calculatorService.add(a,
 * b));
 * 
 * // then assertThat(throwable) .isInstanceOf(ArithmeticException.class)
 * .hasMessage("integer overflow"); } }
 */