package com.emirates.todoapp;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<String> empNameList=new ArrayList<>();
		
		empNameList.add("Mahendra Kumar");
		empNameList.add("Alok Ranjan");
		empNameList.add("Tulsi Das");
		empNameList.add("Dhruv Raj");
		empNameList.add("Shailendra Baghel");
		empNameList.sort((e1,e2)->e1.split(" ")[1].compareTo(e2.split(" ")[1]));
		empNameList.forEach(emp->System.out.println(emp));
	}

}



