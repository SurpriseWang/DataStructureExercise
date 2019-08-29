package com.wang.sort;

/**
 * @author SurpriseWang
 * @date 2019年8月24日上午11:41:53
 */
public class RecursionSort {
	/**
	 * 归并排序的外壳，在这个方法内部会创建一个临时数组，用来为内部真正的归并排序提供辅助空间
	 * 
	 * @param array 待排序数组
	 */
	public void mergeSort(int[] array) {
		int[] tmp = new int[array.length];
		mergeSortInner(array, 0, array.length - 1, tmp);
	}

	/**
	 * 16 使用递归实现的归并排序 17
	 * 
	 * @param array 待排序数组 18
	 * @param start 数组元素进行归并排序的起点下标 19
	 * @param end   数组元素进行归并排序的终点下标 20
	 * @param tmp   用来作为归并排序操作辅助空间的临时数组，临时数组长度等于原始数组长度，并且是一个空数组 21
	 */
	private void mergeSortInner(int[] array, int start, int end, int[] tmp) {
		if (end - start > 0) {
			int middle = (start + end) / 2;
			// 递归调用，分别对左右两个部分进行归并排序
			mergeSortInner(array, start, middle, tmp);
			mergeSortInner(array, middle + 1, end, tmp);
			// [2]在对左右两个部分分别进行归并排序之后，左右两个部分都已经是有序的了，将左右两个部分进行有序数组合并
			for (int i = start; i <= middle; i++) {
				// 将左半部分拷贝到临时空间中
				tmp[i] = array[i];
			}
			for (int i = middle + 1; i <= end; i++) {
				// 将右半部分拷贝到临时空间中
				tmp[i] = array[i];
			}
			// 对左右两半部分的数组进行有序数组合并操作，最终合并结果合并到原始数组中
			// 控制左半部分有序数组拷贝的下标变量
			int left = start;
			// 控制右半部分有序数组拷贝的下标变量
			int right = middle + 1;
			// 控制原始数组array中，有序部分合并的下标
			int index = start;
			while (left <= middle && right <= end) {
				if (tmp[left] < tmp[right]) {
					array[index] = tmp[left];
					left++;
				} else {
					array[index] = tmp[right];
					right++;
				}
				index++;
			}
			// 左边没有合并完成
			if (left <= middle) {

				while (left <= middle) {
					array[index++] = tmp[left++];
				}
			}
			// 右半部分没有合并完成
			if (right <= end) {
				while (right <= end) {
					array[index++] = tmp[right++];
				}
			}
		} else if (end - start == 0) {
			return;
		}
	}
}
