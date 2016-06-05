package joerajeev.streams;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.OptionalDouble;

import org.junit.Test;

public class PrimitiveStreamsTest {

	@Test
	public void test() {
		int sum = Arrays.stream(new int[]{ 5, 10, 15})
				.map( i -> i*2 )
				.sum();
		assertEquals(60, sum);
	}
	
	@Test
	public void test2() {
		OptionalDouble avg = Arrays.stream(new int[]{ 5, 10, 15})
						.map( i -> i*2)
						.average();
		assertEquals(20, avg.getAsDouble(), 0.1);
	}

}
