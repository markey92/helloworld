package primeRange;

public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPrime(7));
	}

	public static boolean isPrime(int x){
		boolean result = true;
		for(int i=2; i*i<=x; i++){
			if(x%i==0){
				result = false;
			}
		}
		return result;
	}
}
