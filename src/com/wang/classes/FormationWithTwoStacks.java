package com.wang.classes;

import java.util.Stack;

/**
 * @author SurpriseWang
 * @date 2019年8月19日下午2:11:23
 */
public class FormationWithTwoStacks {
	//两个栈模拟一个队列
	private Stack<String> cacheStack = new Stack<>();
	private Stack<String> popupStack = new Stack<>();

	public void init(String[] datas) {
		for (String date : datas) {
			cacheStack.add(date);
		}
	}
	public void offer(int numvalue) {
		if(popupStack.empty()){
			while (!cacheStack.isEmpty()) {
				String temp = cacheStack.pop();
				popupStack.add(temp);
			}
		}
		String[] returnValue = new String[numvalue];
		int i;
		for (i=0;i<numvalue&&!popupStack.isEmpty();i++) {
			String temp = popupStack.pop();
			returnValue[i] = temp;
		}
		if(i<numvalue) {
			for(;i!=numvalue;i++) {
				while(!cacheStack.empty()) {
				String temp = cacheStack.pop();
				popupStack.add(temp);
				}
				String temp = popupStack.pop();
				returnValue[i] = temp;
			}
		}
		for (String string : returnValue) {
			System.out.println(string);
		}
		
	}
}
