package com.wang.search;

/**
 * 二分搜索
 * 使用递归实现的二分搜索算法
 * @param array 待搜索序列的数组
 * @param target 目标元素
 * @param start 搜索范围的起点
 * @param end 搜索范围的终点
 * @return 如果目标元素再搜索序列中存在，则返回目标元素在搜索序列中的下标；否则返回-1
 * @author SurpriseWang
 * @date 2019年8月21日上午8:43:08
 */
public class BinarySearch {
	public int binarySearchRecursion(int[] array, int target, int start, int end) {
		if (start > end) {
			return -1; 
		}
		int m = (start + end) / 2;
		if (target < array[m]) {
			return binarySearchRecursion(array, target, start, m - 1); 
		} else if (target > array[m]) {
			return binarySearchRecursion(array, target, m + 1, end); 
		} else { 
			return m; 
		}
	}
}
