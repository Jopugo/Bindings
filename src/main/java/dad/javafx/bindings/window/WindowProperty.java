package dad.javafx.bindings.window;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.DoubleExpression;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class WindowProperty extends Application {

	private Label ancho;
	private Label alto;
	private Label area;

	@Override
	public void start(Stage primaryStage) throws Exception {

		ancho = new Label();
		DoubleExpression anchoVentana = primaryStage.widthProperty();
		ancho.textProperty().bind(Bindings.concat("Ancho: " , primaryStage.widthProperty()));
		
		alto = new Label();
		DoubleExpression altoVentana = primaryStage.heightProperty();
		alto.textProperty().bind(Bindings.concat("Alto: " , primaryStage.heightProperty()));
		
		area = new Label();
		DoubleExpression areaVentana = anchoVentana.multiply(altoVentana);
		area.textProperty().bind(Bindings.concat("Area: " ,areaVentana));

		VBox root = new VBox(ancho, alto, area);
		root.setAlignment(Pos.CENTER);
		root.setFillWidth(false);

		Scene scene = new Scene(root, 320, 200);

		primaryStage.setTitle("Window Propety: ");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}

}
