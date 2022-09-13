# Ironhack Java Enterprise Backend Development
## Lab 1 - 04

### Requirements
1. Write a method in Java to get the difference between the largest and smallest values in an array of integers. The length of the array must be 1 and above.

2. Write a method in Java to find the smallest and second smallest elements of a given array and print it in the console.

3. Write a method in Java that resolves this mathematical expression where <mark>x</mark> and <mark>y</mark> are two variables preset in your code:

> $$(x^2) + ((4y / 5) - x)^2$$

### Technical specifications and dependencies

* Unit testing: JUnit5
* Annotation framework: Lombok
* Custom exceptions
* JavaDoc API documentation
* Shell prompt: Spring Shell
* Grammar checking: CheckStyle

### Usage:

Available custom commands:
> diff -> finds the difference between maximum and minimum values in an array. Example: ***shell> diff 1,2,3,4,5*** returns 4 (max: 5 - min: 1)

> smallest -> prints smallest and second smallest values from a given array. Example: ***shell> smallest 1,2,3,4,5*** returns (1, 2)

> eval -> evaluates the expression given in the requirements section. Example: ***shell> eval 1, 1*** returns 1.04

Available default commands:
* quit: exits the application
* exit: quits the application
