package com.greedy.section01.method;

public class Application7 {

	public static void main(String[] args) {
		
		/* 매개변수와 리턴값 복합 활용 */
		int first = 20;
		int second = 10;
		
		Application7 app7 = new Application7();
		System.out.println("두 수를 더한 결과 : " + app7.plusTwoNumbers(first, second));
		System.out.println("두 수를 뺀 결과  : " + app7.minusTwoNumbers(first, second));
		System.out.println("두 수를 곱한 결과 : " + app7.multipleTwoNumbers(first, second));
		System.out.println("두 수를 나눈 결과 : " + app7.divideTwonumbers(first, second));

	}
	
	/**
	 * <pre>
	 * 	매개변수로 전달 받은 두 수를 더하여 결과 값을 반환받는 기능을 제공한다.
	 * </pre>
	 * @param first 더하기를 할 첫 번째 정수
	 * @param second 더하기를 할 두 번째 정수
	 * @return 매개변수로 전달 받은 두 수를 더한 결과를 반환
	 * */
	public int plusTwoNumbers(int first, int second) {
		
		return first + second;
	}
	
	public int minusTwoNumbers(int first, int second) {
		
		return first - second;
	}
	
	public int multipleTwoNumbers(int first, int second) {
		
		return first * second;
	}
	
	public int divideTwonumbers(int first, int second) {
		
		return first / second;
	}

}






