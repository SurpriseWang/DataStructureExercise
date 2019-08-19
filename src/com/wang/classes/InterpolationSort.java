package com.wang.classes;

/**
 * 插入排序
 * 
 * @author SurpriseWang
 * @date 2019年8月19日下午7:34:35
 */
public class InterpolationSort {
	public static Integer[] interpoliationSort(Integer[] arrs) {
		for (Integer i = 0; i < arrs.length; i++) {
			Integer minValue = i;
			for (int j = i; j < arrs.length - 1; j++) {
				if (arrs[j] > arrs[j + 1]) {
					minValue = j + 1;
				}
			}
			Integer temp = arrs[i];
			arrs[i] = arrs[minValue];
			arrs[minValue] = temp;
		}
		return arrs;
	}
}
