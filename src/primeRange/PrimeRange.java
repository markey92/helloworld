package primeRange;

import java.util.ArrayList;

import com.sun.org.apache.regexp.internal.recompile;

public class PrimeRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums = getArrayList(8);
//		System.out.println(remove(nums, 1));
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(new Integer(1));
		DFS(remove(nums, 1), result, 1);
	}
	static void DFS(ArrayList<Integer> numsInput, ArrayList<Integer>resultInput, int n){
		ArrayList<Integer> result = (ArrayList<Integer>) resultInput.clone();
		ArrayList<Integer> nums = (ArrayList<Integer>) numsInput.clone();
		if(nums.size() <= 1){
			if(PrimeCheck.isPrime(nums.get(0)+n) && PrimeCheck.isPrime(nums.get(0)+1)){
				System.out.println(add(result, nums.get(0)) + "yes");
			}else {
//				System.out.println(result + "no");
			}
			return;
		}else{
			for (Integer integer : nums) {
//				System.out.println("integer:" + integer);
//				System.out.println("result:"+result);
//				System.out.println("nums="+nums);
				if(PrimeCheck.isPrime(integer+n)){
					DFS(remove(nums, integer.intValue()), add(result, integer.intValue()), integer.intValue());
				}
				else {
					
//					System.out.println(result.toString() + "+"+integer+"=no");
				}
			}
		}
		
	}
	static ArrayList<Integer> remove(ArrayList<Integer> nums, int n){
		ArrayList<Integer> result = (ArrayList<Integer>) nums.clone();
		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i).intValue() == n) {
				result.remove(i);
				return result;
			}
		}
		return result;
	}
	static ArrayList<Integer> add(ArrayList<Integer> nums, int n){
		ArrayList<Integer> result = (ArrayList<Integer>) nums.clone();
		result.add(new Integer(n));
		return result;
	}
	static ArrayList<Integer> getArrayList(int n){
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i=1; i<=n; i++){
			result.add(new Integer(i));
		}
		return result;
	}
}
