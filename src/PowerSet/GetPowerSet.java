package PowerSet;

import java.util.ArrayList;

import primeRange.PrimeCheck;

public class GetPowerSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums = getArrayList(3);
		ArrayList<Integer> result = new ArrayList<Integer>();
		DFS(nums, result);
	}
	static void DFS(ArrayList<Integer> numsInput, ArrayList<Integer>resultInput){
		ArrayList<Integer> result = (ArrayList<Integer>) resultInput;
		ArrayList<Integer> nums = (ArrayList<Integer>) numsInput;
		if(nums.size() <= 1){
			System.out.println(result);
			result.add(nums.get(0));
			System.out.println(result);
			return;
		}else{
			DFS(remove(nums, nums.get(0).intValue()), (ArrayList<Integer>) result.clone());
			DFS(remove(nums, nums.get(0).intValue()), add(result, nums.get(0).intValue()));
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
