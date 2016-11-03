package org.eclipse.example.calc.internal.operations;

import org.eclipse.example.calc.BinaryOperation;

public class Power implements BinaryOperation {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "*";
	}

	@Override
	public float perform(float arg1, float arg2) {
		// TODO Auto-generated method stub
		return (float) Math.pow(arg1,arg2);
	}

}
