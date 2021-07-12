/**
 * This is JUnit that tests the sleepIn method that is available in SleepIn class.
 * This contains 4 testcases.
 * 
 * Please don't run this file.
 * You can add your own test cases to this file by just copy and paste the last three 
 * lines of the code (TestCase4).
 * 
 * @author: Siva Sankar
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJUnit {
   @Test
   public void testCase1() {
      IsEvenPositiveInt isEvenPositiveInt = new IsEvenPositiveInt();
      assertEquals("1.", false, isEvenPositiveInt.isEvenPositiveInt(1));
      assertEquals("2.", false, isEvenPositiveInt.isEvenPositiveInt(-1));
      assertEquals("3.", false, isEvenPositiveInt.isEvenPositiveInt(-2));
      assertEquals("4.", false, isEvenPositiveInt.isEvenPositiveInt(-3));
      assertEquals("5.", true, isEvenPositiveInt.isEvenPositiveInt(2));
   }

   @Test
   public void testCase2() {
      IsEvenPositiveInt isEvenPositiveInt = new IsEvenPositiveInt();
      assertEquals("1.", false, isEvenPositiveInt.isEvenPositiveInt(3));
      assertEquals("2.", true, isEvenPositiveInt.isEvenPositiveInt(123456));
   }
}