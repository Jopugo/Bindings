package dad.javafx.bindings.custom;

import javafx.beans.binding.DoubleBinding;
import javafx.beans.binding.DoubleExpression;

public class SqrtBindig extends DoubleBinding {
		
	
	private DoubleExpression x;
	
	public SqrtBindig(DoubleExpression x) {
		super();
		this.x=x;
		bind(x);
	}
	protected double computeValue() {
		return Math.sqrt(x.get());
	}

}
