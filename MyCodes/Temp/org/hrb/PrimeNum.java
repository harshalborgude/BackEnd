package org.hrb;

public class PrimeNum {

	public static boolean isPrime(int num) {

		for (int i = 2; i < (num / 2); i++) {
			if ((num % i) == 0) {
				return false;
			}

		}
		return true;

	}

	public static void main(String[] args) {
		// PrimeNum primeNum=new PrimeNum();
		for (int i = 1; i <= 100; i++) {

			if (isPrime(i)) {
				System.out.println(i);
			}

			
		}

	}

}
