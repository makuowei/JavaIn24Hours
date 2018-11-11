package com.java24hours;

public class PrimeFinder implements Runnable {
	Thread go;
	StringBuffer primes = new StringBuffer();
	int time = 0;

	public PrimeFinder() {
		start();
		while (primes != null) {
			System.out.println(time);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// do nothing
			}
		}
	}

	public void start() {
		if (go == null) {
			go = new Thread(this);
			go.start();
		}

	}

	public void run() {
		int quantity = 1_000_000;
		int numPrimes = 0;
		int candidate = 2;
		primes.append("\nFirst ").append(quantity).append("primes:\n\n");
		while (numPrimes < quantity) {
			if (isPrimes(candidate)) {
				primes.append(candidate).append(" ");
				numPrimes++;
			}
			candidate++;
		}
		System.out.println(primes);
		primes = null;
		System.out.println("\nTime elasped: " + time + " seconds");
	}

	public static boolean isPrimes(int checkNumber) {
		double root = Math.sqrt(checkNumber);
		for (int i = 2; i < root; i++) {
			if (checkNumber % i == 0) {
				return false;
			}
		}
		return true;
	}
}