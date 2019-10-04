package dad.javafx.bindings.custom;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class Main {

	public static void main(String[] args) {

		DoubleProperty a = new SimpleDoubleProperty(9);
		DoubleProperty b = new SimpleDoubleProperty(4);

		DoubleProperty c = new SimpleDoubleProperty();
		// o=observable,ov=oldValue, nv=newValue
		// c.addListener((o,ov,nv) -> {
		// System.out.println("c antes valía "+ov+" y ahora vale "+nv);
		// });

		c.bind(MathBindings.sqrt(MathBindings.pow(a, b).divide(2)));

		System.out.println(c.get());

		a.set(8);

		System.out.println(c.get());

	}

}
