package com.markey.test;

public class TakeStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<11; i++){
			System.out.println("步数为"+i+":"+walk(i));
		}
	}
	public static int walk(int stair){
		int num = 0;
		if(stair > 0){
			switch (stair) {
				case 1:
					num = 1;
					break;
				case 2:
					num = 2;
					break;
				default:
					num = walk(stair-1)+walk(stair-2);
			}
		}
		return num;
	}
}
