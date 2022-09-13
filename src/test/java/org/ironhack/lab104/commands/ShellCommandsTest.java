package org.ironhack.lab104.commands;

import org.ironhack.lab104.exceptions.IncorrectArrayLengthException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShellCommandsTest {
	private final ShellCommands commands = new ShellCommands();

	@Test
	void largestSmallestArrayDiff () throws IncorrectArrayLengthException {
		int[] arr1 = {1,2,3,4,5,6,7,8,9};
		assertEquals(8, commands.largestSmallestArrayDiff(arr1));

		int[] arr2 = {23,45,7,8,6,34,23,4,67,8,9,67};
		assertEquals(63, commands.largestSmallestArrayDiff(arr2));

		int[] arr3 = {3,1};
		assertEquals(2, commands.largestSmallestArrayDiff(arr3));

		int[] arr4 = {57,653,78,90,67,4,34,2,56,75,869,90,0,869,67,54};
		assertEquals(869, commands.largestSmallestArrayDiff(arr4));
	}

	@Test
	void printSmallestAndSecondSmallest () throws IncorrectArrayLengthException {
		int[] arr1 = {1,2,3,4,5,6,7,8,9};
		int[] expected = {1, 2};
		assertArrayEquals(expected, commands.printSmallestAndSecondSmallest(arr1));

		int[] arr2 = {23,45,7,8,6,34,23,4,67,8,9,67};
		int[] expected2 = {4, 6};
		assertArrayEquals(expected2, commands.printSmallestAndSecondSmallest(arr2));

		int[] arr3 = {3,1};
		int[] expected3 = {1,3};
		assertArrayEquals(expected3, commands.printSmallestAndSecondSmallest(arr3));

		int[] arr4 = {57,653,78,90,67,4,34,2,56,75,869,90,0,869,67,54};
		int[] expected4 = {0, 2};
		assertArrayEquals(expected4, commands.printSmallestAndSecondSmallest(arr4));

		int[] arr5 = {-45, -56, 0, 3, -10, -20};
		int[] expected5 = {-56, -45};
		assertArrayEquals(expected5, commands.printSmallestAndSecondSmallest(arr5));
	}

	@Test
	void evaluateExpression () {
		assertEquals(16.0, commands.evaluateExpression(4.0, 5.0));
		assertEquals(1.04, commands.evaluateExpression(1.0, 1.0));
		assertEquals(16.0, commands.evaluateExpression(0, 5));
		assertEquals(0.0, commands.evaluateExpression(0, 0));
	}
}