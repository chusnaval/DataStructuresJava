public class CustomStack {

    /**
     * Array to save the items
     */
    private Object[] items;

    /**
     * Keeps the items size
     */
    private int size;

    /**
     * Count the last pushed element
     */
    private int count;

    /**
     *
     * @param size
     * @throws StackException
     */
    public CustomStack(final int size) throws StackException {
	if (size < 0) {
	    throw new StackException("Negative size?");
	}
	this.size = size;
	this.items = new Object[size];
	this.count = 0;
    }

    /**
     * Add one item to the stack
     *
     * @param obj
     * @throws StackException
     */
    public void push(Object obj) throws StackException {

	if (count == size) {
	    throw new StackException("Stack overflow");
	}
	this.items[count++] = obj;
    }

    /**
     * Retrieves the top element of stack
     *
     * @return
     * @throws StackException
     */
    public Object pop() throws StackException {
	if (isEmpty()) {
	    throw new StackException("Stack empty");
	}
	return this.items[--count];
    }

    /**
     * Test if stack is empty
     *
     * @return
     */
    public boolean isEmpty() {
	return count < 1;
    }
}
