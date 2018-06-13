import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import javax.xml.soap.Node;

import java.util.NoSuchElementException;

import static java.time.Duration.ofMillis;
import static java.time.Duration.ofSeconds;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class LinkedStackTest {


	// 	test to push 1000 integers to the LinkedStack
	//	within 5 miliseconds
	@Test
	public void add1000In5MiliSec() {
		LinkedStack lStack = new LinkedStack();
		assertTimeout(ofMillis(5), () -> {
			int i = 0;
			// add 1000 items in 5 miliseconds
			for(i = 0; i < 1000; i++){
				lStack.push(i);
			}
		});
	}

	//	pop()
	//	Exception for empty Stack
	@Test
	public void emptyPop(){
		LinkedStack lStack = new LinkedStack();
		assertThrows(Exception.class, ()->{
			lStack.pop();
		});
	}
	// test NoSuchElementException
	@Test
	public void emptyPopSpecific(){
		LinkedStack lStack = new LinkedStack();
		assertThrows(NoSuchElementException.class, ()->{
			lStack.pop();
		});
	}

	//	peek()
	//	Exception for empty Stack
	@Test
	public void emptyPeek(){
		LinkedStack lStack = new LinkedStack();
		assertThrows(Exception.class, ()->{
			lStack.peek();
		});
	}
	// test NoSuchElementException
	@Test
	public void emptyPeekSpecific(){
		LinkedStack lStack = new LinkedStack();
		assertThrows(NoSuchElementException.class, ()->{
			lStack.peek();
		});
	}







}
