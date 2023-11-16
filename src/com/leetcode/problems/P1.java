package com.leetcode.problems;

import java.util.Arrays;

import com.leetcode.model.Problema;

public class P1 extends Problema {

	public int[] twoSum(int[] nums, int target) {
		int[] resp = new int[0];
		int longitudNums = nums.length;
		for (int i = 0; i < longitudNums; i++) {
			if (resp.length > 0)
				break;

			int _i = nums[i];
			int diferencia = target - _i;
//			if (Arrays.asList(nums).contains(diferencia))
//				continue;
			for (int j = i + 1; j < longitudNums; j++) {
				if (nums[j] == diferencia) {
					resp = new int[] { i, j };
					break;
				}
			}
		}
		return resp;
	}

	@Override
	public void runTest() {
		int[] nums = new int[] { 106, 8, 4, 5, 2, 6, 3, 42, 7, 11, 15 }; // 2,3
		int target = 9;

//		String[] n = Arrays.toString(nums).replace("[", "").replace("]", "").split(",");
//		System.out.println(Arrays.toString(n));

		int[] respuesta = twoSum(nums, target);
		System.out.println(Arrays.toString(respuesta));
	}

}
