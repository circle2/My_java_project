package day_1_3_calaulate.factory;

import day_1_3_calaulate.bean.Calculate;
import day_1_3_calaulate.mytool.AddResult;
import day_1_3_calaulate.mytool.Div;
import day_1_3_calaulate.mytool.Mul;
import day_1_3_calaulate.mytool.SubResult;

public class Factory {
	public Calculate newCal(String value) {
		Calculate cal=null;
		if(value.contains("+")) {
			cal=new AddResult();
		}
		else if(value.contains("-")) {
			cal=new SubResult();
		}
		else if(value.contains("*")){
			cal=new Mul();
		}
		else if(value.contains("/")){
			cal=new Div();
		}
		return cal;
	}
	
}
