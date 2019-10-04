package dad.javafx.bindings.sample;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class Main {

	public static void main(String[] args) {
		
		DoubleProperty a=new SimpleDoubleProperty(2.1);
		DoubleProperty b=new SimpleDoubleProperty(14.14);
		
		
		DoubleProperty c=new SimpleDoubleProperty();
		//o=observable,ov=oldVlaue, nv=newValue
		c.addListener((o,ov,nv) -> {
				System.out.println("c antes valía "+ov+" y ahora vale "+nv);
		});
		
		c.bind(a.multiply(b));
		
		a.set(5);
		
	}

}
