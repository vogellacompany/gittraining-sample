package org.eclipse.example.calc.internal.operations;

import org.eclipse.example.calc.BinaryOperation;

public class Power implements BinaryOperation {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "^";
	}

	@Override
	public float perform(float arg1, float arg2) {
		float f = 0;
		if (arg2 < 0) {
			System.out.println("arg2 kleiner 0, arg2=" + arg2);
		}
		else { 
			f = (float) Math.pow(arg1, arg2);
		}
		return f;
	}

}
