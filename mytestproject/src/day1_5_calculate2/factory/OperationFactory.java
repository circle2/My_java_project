package day1_5_calculate2.factory;

import day1_5_calculate2.operation.Operation;

//设计具体的操作工厂 利用工厂对实例进行创建
public interface OperationFactory {
	public Operation getIntance();
}
