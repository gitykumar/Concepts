package com.yogesh.LambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface AddValues{
	
	void show(int a);
}

public class LambdaExpression {

	public static void main(String[] args) {
		
		
		  List<Integer> num =Arrays.asList(1,2,3,4,5,6,7,9);
		  
		  num.forEach(i -> System.out.println(i));
		 
		
	
	}

}
