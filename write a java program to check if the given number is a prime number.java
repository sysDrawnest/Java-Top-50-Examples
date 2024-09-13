public class PrimeNumberCheck {

	public static void main(String[] args) {
		System.out.println(isPrime(19)); // true
		System.out.println(isPrime(49)); // false
	}

	public static boolean isPrime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

}

//You can write a program to divide the given number n, by a number from 2 to n/2 and check the remainder. If the remainder is 0, then it’s not a prime number. The following example code shows one way to check if a given number is a Prime number:
//Although this program works, it’s not very memory and time-efficient. Consider that, for a given number N, if there is a prime number M between 2 to √N (square root of N) that evenly divides it, then N is not a prime number.