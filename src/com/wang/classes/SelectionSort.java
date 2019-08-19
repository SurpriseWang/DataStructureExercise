package com.wang.classes;

/**
 * 选择排序
 * 
 * @author SurpriseWang
 * @date 2019年8月19日下午7:15:40
 */
public class SelectionSort {
	public static Integer[] selectionSort(Integer[] arrs) {
		for (int i = 0; i < arrs.length - 1; i++) {
			int index = i;
			int j;
			for (j = i + 1; j < arrs.length; j++) {
				if (arrs[j] < arrs[index]) {
					index = j;
				}
			}
			int tmp = arrs[index];
			arrs[index] = arrs[i];
			arrs[i] = tmp;
		}
		return arrs;
	}
}
