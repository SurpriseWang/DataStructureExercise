package com.wang.sort;

/**
 * 希尔排序
 * @author SurpriseWang
 * @date 2019年8月21日上午8:29:32
 */
public class ShellSort {
	public void shellSort(int[] array) {
		int step = array.length / 2;
		while (step > 0) {
			for (int start = 0; start < step; start++) {
				insertionSort(array, start, step);
			}
			step /= 2;
		}
	}

	private void insertionSort(int[] array, int start, int step) {
		for (int i = start + step; i < array.length; i += step) {
			for (int j = i; j - step >= 0 && array[j] < array[j - step]; j -= step) {
				int tmp = array[j];
				array[j] = array[j - step];
				array[j - step] = tmp;
			}
		}
	}
}
