package com.infotech.client;

import java.util.ArrayList;
import java.util.List;

import com.infotech.impl.MyInterfaceImpl;
import com.infotech.model.Student;
import com.infotech.myinterface.MyInterface;

public class ClientTest {

	public static void main(String[] args) {
		MyInterface myInterface = new MyInterfaceImpl();
		List<Student> stuList = new ArrayList<Student>();
		stuList.add(new Student("Sean", 20));
		stuList.add(new Student("Nancy", 16));
		stuList.add(new Student("Piku", 26));
		stuList.add(new Student("Hemanth", 24));
		stuList.add(new Student("Sonal", 34));
		stuList.add(new Student("Andrew", 36));
		stuList.add(new Student("Abcd", 14));
		myInterface.sortStudents(stuList);
		for (Student student : stuList) {
			System.out.println(student.getName()+"\t"+student.getAge());
		}
		
		System.out.println("--------------------------");
		MyInterface.greet("Saurabh");
		System.out.println("--------------------------");
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1000);
		intList.add(1060);
		intList.add(1050);
		intList.add(10);
		intList.add(1010);
		intList.add(2100);
		intList.add(3000);
		intList.add(2000);
		intList.add(90);
		intList.add(900);
		intList.add(10000);
		intList.add(9000);
		
		
		System.out.println(myInterface.getMaxNum(intList));
	}
}
