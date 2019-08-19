package com.wang.classes;

/**
 * 冒泡排序
 * 
 * @author SurpriseWang
 * @date 2019年8月19日下午7:28:31
 */
public class BubbleSort {
	public static Integer[] bubbleSort(Integer[] arrs) {
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs.length - i - 1; j++) {
				if (arrs[j] > arrs[j + 1]) {
					Integer temp = arrs[j];
					arrs[j] = arrs[j + 1];
					arrs[j + 1] = temp;
				}
			}
		}
		return arrs;
	}
}
