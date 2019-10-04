package dad.javafx.bindings.custom;

import javafx.beans.binding.DoubleBinding;
import javafx.beans.binding.DoubleExpression;

public class PowBinding extends DoubleBinding {

	private DoubleExpression x;
	private DoubleExpression y;

	public PowBinding(DoubleExpression x, DoubleExpression y) {
		super();

		bind(this.y = y, this.x = x);

	}

	@Override
	protected double computeValue() {
		return Math.pow(x.get(), y.get());
	}

}
