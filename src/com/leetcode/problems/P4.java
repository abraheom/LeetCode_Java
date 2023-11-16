package com.leetcode.problems;

import java.util.Arrays;

import com.leetcode.model.Problema;

public class P4 extends Problema {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] union = unirArreglos(nums1, nums2);
		int[] mediana = obtenerMedia(union);

		double sumaFinal = 0;
		for (int n : mediana) {
			sumaFinal += n;
		}

		return sumaFinal / mediana.length;
	}

	public int[] obtenerMedia(int[] a) {
		double mediana = (a.length - 1) / 2;
		int index = (int) mediana;
		if (a.length % 2 == 0) {
			return new int[] { a[index], a[index + 1] };
		} else {
			return new int[] { a[index] };
		}

	}

	public int[] unirArreglos(int[] a1, int[] a2) {
		int longitudArregloFinal = a1.length + a2.length;
		int[] resp = new int[longitudArregloFinal];
		for (int i = 0; i < longitudArregloFinal; i++) {
			if (i < a1.length) {
				resp[i] = a1[i];
			} else {
				resp[i] = a2[i - a1.length];
			}
		}
		Arrays.sort(resp);
		return resp;
	}

	@Override
	public void runTest() {
		int[] nums1 = new int[] { 1, 3 };
		int[] nums2 = new int[] { 2 };

//		int[] union = unirArreglos(nums1, nums2);
//		Arrays.sort(union);
//		
//		int[] mediana = obtenerMedia(union);
//		
//		System.out.println(Arrays.toString(union));
//		System.out.println(Arrays.toString(mediana));

		System.out.println(findMedianSortedArrays(nums1, nums2));
	}

}
