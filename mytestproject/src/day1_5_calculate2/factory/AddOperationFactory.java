package day1_5_calculate2.factory;

import day1_5_calculate2.operation.AddOperation;
import day1_5_calculate2.operation.Operation;

public class AddOperationFactory implements OperationFactory {

	@Override
	public Operation getIntance() {
		return new AddOperation();
	}

}
