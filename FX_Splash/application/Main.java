package application;
	
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	Stage stage;

	@FXML
	Label logoLabel;
	
	@Override
	public void start(Stage myStage) throws Exception {

		stage = myStage;

		MainWindow();

	}
	
	
	
	private void MainWindow() {
		// TODO Auto-generated method stub
		
		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource(
					"Splash.fxml"));
			AnchorPane pane = loader.load();

			Scene scene = new Scene(pane);

			// Fuente desde Google fonts
			scene.getStylesheets().add(
					"https://fonts.googleapis.com/css?family=Allerta+Stencil");

			stage.initStyle(StageStyle.UNDECORATED);
			stage.setScene(scene);
			stage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}



	public static void main(String[] args) {
		launch(args);
	}
}
