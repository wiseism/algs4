package com.test.main;

import com.test.main.utils.PrintUtils;

public class Shell {

	public static void main(String[] args) {
		Integer N = 100;
		String[] a = new String[N];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = String.valueOf(a.length - i);
		}
		PrintUtils.printArray(a);
//		edu.princeton.cs.algs4.Shell.sort(a);
//		PrintUtils.printArray(a);
		int h = 0;
		
		while(h < N/3){
			h = 3*h + 1;
		}
		
		while(h>=1){
			
			for (int i = h; i < N; i++) {
				for (int j = i; j >=h && isless(a[j],a[j-h]); j -=h) {
					swap(a,j,j-h);
				}
			}
			
			h = h/3;
		}
		PrintUtils.printArray(a);
	}

	private static boolean isless(Comparable v ,Comparable i){
//		try {
//			Integer int_v = Integer.parseInt(v.toString());
//			Integer int_i = Integer.parseInt(i.toString());
//			return int_v.compareTo(int_i) < 0;
//		} catch (NumberFormatException e) {
//			e.printStackTrace();
//		}
		return v.compareTo(i)<0;
	}
	
	private static void swap(Object[] a, int j, int i) {
		Object o = a[j];
		a[j] = a[i];
		a[i] = o;
	}
}
