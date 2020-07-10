package fArraysListsAutoboxingUnboxing.hAutoboxingAndUnboxing;

import java.util.ArrayList;

class IntClass{
	private int myValue;

	public IntClass(int myValue) {
		this.myValue = myValue;
	}

	public int getMyValue() {
		return myValue;
	}

	public void setMyValue(int myValue) {
		this.myValue = myValue;
	}
	
}
//#######################################################################################

public class Main {

	public static void main(String[] args) {
		
		String[] StringArray = new String[10];
		int[] intArray = new int[10];
		
		ArrayList<String> stringArrayList = new ArrayList<String>();
		stringArrayList.add("Tim");
		System.out.println(stringArrayList.get(0).toString());
		
	//	ArrayList<int> intArrayList = new ArrayList<int>();
		
		ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
		intClassArrayList.add(new IntClass(54));
		intClassArrayList.get(0).setMyValue(55);
		intClassArrayList.add(new IntClass(69));
		System.out.println(intClassArrayList.get(0).getMyValue());
		System.out.println(intClassArrayList.get(1).getMyValue());
		
		Integer integer = new Integer(54);
		
		ArrayList<Integer> intArrayList = new ArrayList<Integer>();
		for(int i = 0; i <= 10; i++) {
			intArrayList.add(Integer.valueOf(i));
		}
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(i + " --> " + intArrayList.get(i).toString());
		}
		
		Integer myIntValue = 56; //Integer.valueOf(56);
		int myInt = myIntValue;  //myIntValue.intValue();
		
		ArrayList<Double> myDoubleValues = new ArrayList<Double>();
		for(double dbl = 0.0; dbl <= 10.0; dbl+= 0.5) {
			myDoubleValues.add(Double.valueOf(dbl));
		}
		
		for(int i = 0; i < myDoubleValues.size(); i++) {
			System.out.println(i + " --> " + myDoubleValues.get(i).doubleValue());
		}
		
	}
}
