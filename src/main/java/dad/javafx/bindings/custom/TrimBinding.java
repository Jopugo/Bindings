package dad.javafx.bindings.custom;

import javafx.beans.binding.StringBinding;
import javafx.beans.binding.StringExpression;

public class TrimBinding extends StringBinding{
	
	StringExpression x;
	public TrimBinding(StringExpression x) {
		super();
		this.x=x;
		this.bind(x);
	}
	protected String computeValue() {
	
		return null;
	}

}
