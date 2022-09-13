package org.ironhack.lab104.commands;

import org.ironhack.lab104.exceptions.IncorrectArrayLengthException;

public interface ICommands {
	public int largestSmallestArrayDiff (int[] array) throws IncorrectArrayLengthException;
	public int[] printSmallestAndSecondSmallest (int[] array) throws IncorrectArrayLengthException;
	public double evaluateExpression (double x, double y);
}
