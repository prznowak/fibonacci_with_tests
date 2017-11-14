import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

/**
 * Created by pinq on 14.11.17.
 */
public class MainTest {
    @Test
    public void fibShouldReturn377() {
        assertEquals(new BigInteger("377"), Main.fib(14));
    }
    @Test
    public void fibShouldReturn8() {
        assertEquals(new BigInteger("8"), Main.fib(6));
    }

    @Test
    public void fibShouldReturn0() {
        assertEquals(new BigInteger("0"), Main.fib(-7));
    }

    @Test
    public void fibShouldReturn4181() {
        assertEquals(new BigInteger("4181"), Main.fib(19));
    }

    @Test
    public void fibShouldReturn701408733() {
        assertEquals(new BigInteger("701408733"), Main.fib(44));
    }

    @Test
    public void fibShouldReturn12586269025() {
        assertEquals(new BigInteger("12586269025"), Main.fib(50));
    }

    @Test
    public void fibShouldReturn24157817() {
        assertEquals(new BigInteger("24157817"), Main.fib(37));
    }


}