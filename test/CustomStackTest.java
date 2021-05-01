import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class CustomStackTest {

    private CustomStack stack;

    @Test
    public void negativeSizeTest() {
	try {
	    stack = new CustomStack(-1);
	    fail("Se esperaba excepcion StackException");
	} catch (StackException e) {

	}

    }

    @Test
    public void isEmptyStackTest() throws StackException {
	stack = new CustomStack(1);
	assertTrue(stack.isEmpty());

	stack.push("1");
	assertFalse(stack.isEmpty());
    }

    @Test
    public void stackOverflowTest() {
	try {
	    stack = new CustomStack(0);
	    stack.push("1");
	    fail("Se esperaba excepcion StackException");
	} catch (StackException e) {

	}

    }

    @Test
    public void stackEmptyTest() {
	try {
	    stack = new CustomStack(0);
	    stack.pop();
	    fail("Se esperaba excepcion StackException");
	} catch (StackException e) {

	}

    }

    @Test
    public void samerElementTest() {
	try {
	    String testObj = new String("Drozdek");
	    stack = new CustomStack(1);
	    stack.push(testObj);

	    String popTest = (String) stack.pop();

	    assertEquals(testObj, popTest);

	} catch (StackException e) {

	}

    }
}
