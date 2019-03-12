package com.clc.sample.java.fundamentals;

import java.util.HashSet;
import java.util.Set;

public class TestSetImpl {
	
	public static void main(String[] args) {
		Set<Integer> setOfNumbers = new HashSet<>();
		setOfNumbers.add(1); //int -- new Integer(1)
		setOfNumbers.add(1);//new Integer(1)
		
		
		setOfNumbers.add(12);
		setOfNumbers.add(13);
			
			setOfNumbers.add(12);
		setOfNumbers.add(null);
			setOfNumbers.add(null);
		
		System.out.println(setOfNumbers.size());
		
		
		Emp e1 = new Emp(1, "A");//1
		Emp e2 = new Emp(1, "A");//2
		Emp e3 = new Emp(2, "A");//3
		Emp e4 = new Emp(2, "B");//4
		Emp e5 = e4;//4
		Emp e6 = null;//5
		Emp e7 = null;//5
		
		System.out.println();
		
		Set<Emp> setOfEmps = new HashSet<>();
		setOfEmps.add(e1);
		setOfEmps.add(e2);
		setOfEmps.add(e3);
		setOfEmps.add(e4);
		setOfEmps.add(e5);
		setOfEmps.add(e6);
		setOfEmps.add(e7);
		setOfEmps.add(null);
		
		System.out.println(setOfEmps.size());
		System.out.println(setOfEmps);
	}

}


class Emp{
	int empId;
	String empName;
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		return true;
	}
	public Emp(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
	
}