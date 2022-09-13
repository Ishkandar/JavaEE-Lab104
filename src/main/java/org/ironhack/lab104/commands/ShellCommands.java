package org.ironhack.lab104.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.ironhack.lab104.exceptions.IncorrectArrayLengthException;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.stereotype.Component;

/**
 * @class: ShellCommands.
 * Provides implementation of methods specified at ICommands interface.
 */
@Getter
@Setter
@NoArgsConstructor
@ShellComponent
@Component
class ShellCommands implements ICommands {
	Throwable err = new Throwable();
	/**
	 * Evaluates the difference between the maximum and minimum
	 * values in a given array.
	 * @method LargestSmallestArrayDiff
	 * @param array
	 * @return array[max] - array[min]
	 */
	@Override
	@ShellMethod(value = "Find the difference between max and min.", key = "diff")
	public int largestSmallestArrayDiff (int[] array) throws IncorrectArrayLengthException {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		if (array.length < 2) {
			throw new IncorrectArrayLengthException("Please, introduce 2 values at least", err);
		}

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}

			if (min > array[i]) {
				min = array[i];
			}
		}

		System.out.println("Max number is " + max + ", min is " + min + "; this is the difference: " + (max - min));

		return max - min;
	}

	/**
	 * Prints on screen the smallest and the second-smallest
	 * values of a given array.
	 * @method printSmallestAndSecondSmallest
	 * @param array
	 */
	@Override
	@ShellMethod(value = "Print smallest and second smallest.", key = "smallest")
	public int[] printSmallestAndSecondSmallest (int[] array) throws IncorrectArrayLengthException {
		if (array.length < 2) {
			throw new IncorrectArrayLengthException("Please, introduce 2 values at least", err);
		}

		int first, second, array_size = array.length;
		int[] solution = new int[2];
		first = second = Integer.MAX_VALUE;

		for (int i = 0; i < array_size ; i ++)
		{
			if (array[i] < first)
			{
				second = first;
				first = array[i];
			}
			else if (array[i] < second && array[i] != first)
				second = array[i];
		}

		if (second == Integer.MAX_VALUE)
			System.out.println("There is no second" +
			"smallest element");
		else
			solution[0] = first;
			solution[1] = second;
			System.out.println("The smallest element is " +
			first + " and second Smallest" +
			" element is " + second);

			return solution;
}

	/**
	 * Evaluates the expression x^2 + ((4y/5) - x).
	 * @method evaluateExpression
	 * @param x
	 * @param y
	 */
	@Override
	@ShellMethod(value = "Evaluate expression.", key = "eval")
	public double evaluateExpression (double x, double y) {
		int param_1 = 4;
		int param_2 = 5;
		int powerOf = 2;

		double result = Math.pow(x, powerOf) + Math.pow((((param_1 * y) / param_2) - x), powerOf);
		System.out.println("\nEvaluate x^2 + ((4y/5) - x)^2: " + result + "\n");

		return result;
	}
}
