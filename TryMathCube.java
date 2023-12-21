package com.infy.assignment.exceptionhandling;
public class TryMathCube {
public int cube(int n) {
return n * n * n;
}
public static void main(String[] args) {
TryMathCube tc = new TryMathCube();
int num = Integer.parseInt(args[0]);
System.out.println(tc.cube(num));
}
}
