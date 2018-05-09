package com.infotech.impl;

import java.util.Collections;
import java.util.List;

import com.infotech.myinterface.MyInterface;

public class MyInterfaceImpl implements MyInterface {

	@Override
	public Integer getMaxNum(List<Integer> intList) {
		Integer max = Collections.max(intList);
		return max;
	}

}
