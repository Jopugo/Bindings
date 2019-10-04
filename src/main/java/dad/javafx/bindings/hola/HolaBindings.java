package dad.javafx.bindings.hola;

import javafx.application.Application;
import javafx.beans.binding.Binding;
import javafx.beans.binding.Bindings;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HolaBindings extends Application{

	
	
	private Label saludoLabel;
	private TextField textMensaje;
	public void start(Stage primaryStage) throws Exception {
		textMensaje=new TextField();
		textMensaje.setPromptText("Introduce un nombre");
		
		saludoLabel = new Label();
		saludoLabel.setText("-");
		
		
		VBox root=new VBox(4,textMensaje,saludoLabel);
		root.setAlignment(Pos.CENTER);
		root.setFillWidth(false);
		
		
		//establezco los bindeos
		
		
		
		saludoLabel.textProperty().bind(
				Bindings.when(textMensaje.textProperty().isEmpty())
				.then("No hay nadie a quien saludar")
				.otherwise(Bindings.concat("¡Hola ",textMensaje.textProperty(), "!"))
				
				);
		
	
		Scene scene=new Scene(root,320,200);
		
		primaryStage.setTitle("Bindings ");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
