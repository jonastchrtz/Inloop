package Inloop.Lesson.Inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KingTest {
    @Test
    public void testTax() {
        Inhabitant k = new King();

        k.setIncome(10);
        assertEquals("King.tax() should return the correct tax value for the king!", 0, k.tax());

        k.setIncome(0);
        assertEquals("King.tax() should return the correct tax value for the king!", 0, k.tax());

        k.setIncome(-1);
        assertEquals("King.tax() should return the correct tax value for the king!", 0, k.tax());

        k.setIncome(20);
        assertEquals("King.tax() should return the correct tax value for the king!", 0, k.tax());
    }
}
