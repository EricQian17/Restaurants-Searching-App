package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TemplateMain extends Application {

	public static void main(String[] args) {
		Application.launch(args);

	}
	@Override
	public void start(Stage stage) throws Exception{
		
		Parent root = FXMLLoader.load(getClass().getResource("RestaurantView.fxml"));
		Scene scene = new Scene(root);
		
		stage.setTitle("Restaurant Search");
		stage.setScene(scene);
		stage.show();
	}

}
