package Inloop.Basics.Java_and_Functions;

import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.Assert.*;

public class FunctionsTest {
    @Test
    public void testFactorialIsStatic() {
        try {
            Method m = Functions.class.getDeclaredMethod("factorial", int.class);
            assertTrue("Functions.factorial() should be public!", Modifier.isPublic(m.getModifiers()));
            assertTrue("Functions.factorial() should be static!", Modifier.isStatic(m.getModifiers()));
            assertSame("The return type of Functions.factorial() should be int!", int.class, m.getReturnType());
        } catch (NoSuchMethodException e) {
            fail("The class Functions should have a method named factorial that has one int parameter!");
        }
    }

    /* Function testing the numbers from 0 to 11 */
    @Test
    public void testFactorial() {
        int[] values = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int i = 0; i < values.length; i++) {
            assertEquals("Functions.factorial() should return the correct factorial value!", factorial(values[i]),
                    Functions.factorial(values[i]));
        }
    }

    /* Function calculating the expected value of Functions.faculty() */
    private int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
