package com.java.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CompareDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("yayou");
		list.add("yuxiaoqi");
		list.add("虞琪");
		list.add("love");
		list.add("you");
		Collections.sort(list);
		sop(list);
		Collections.sort(list, new StrCompare());
		sop(list);
		
		List list2 = new ArrayList();
		list2.add("frank");
		list2.add("jade");
		list2.add("frankandjade");
		//list.add(list2);
		//sop(list);
		Collections.addAll(list, list2);
		sop(list);
	}

	private static void sop(Object obj) {
		System.out.println(obj);
		
	}
}
