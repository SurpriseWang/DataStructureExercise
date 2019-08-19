package com.wang.classes;

/**
 * 插入排序
 * 
 * @author SurpriseWang
 * @date 2019年8月19日下午7:34:35
 */
public class InterpolationSort {
	public int[] interpoliationSort(int[] arrs) {
		
		for (int i = 0; i < arrs.length; i++) {
			int minValue = i;
			System.out.println("i:"+i);
			for (int j = i; j < arrs.length-1; j++) {
				System.out.println("j:"+j);
				if (arrs[j] > arrs[j + 1]) {
					minValue = j+1;
				} 
			}
			int temp = arrs[i];
			arrs[i] = arrs[minValue];
			arrs[minValue] = temp;
		}
		return arrs;
	}
}
