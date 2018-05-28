package org.eclipse.example.calc.internal.operations;

import org.eclipse.example.calc.BinaryOperation;

public class Times2 implements BinaryOperation {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "*2";
	}

	@Override
	public float perform(float arg1, float arg2) {
		// TODO: what shall we do with arg2?
		System.out.println("ignoring arg2=" + arg2);
		return arg1 * 2;
	}

}
