package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {
	@FXML
	private ImageView pan;

	@FXML
	public void openStage() {
		try {

			// BorderPane root = new BorderPane();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Vista_2.fxml"));
			// BorderPane root = new BorderPane();
			AnchorPane root = (AnchorPane) loader.load();
			Stage sendStage = new Stage();
			Scene scene = new Scene(root);

			sendStage.setScene(scene);
			sendStage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

//Para enfocar y desenfocar
	@FXML
	public void blur() {
		pan.setEffect(new GaussianBlur(5));
	}

	@FXML
	public void focus() {
		pan.setEffect(null);
	}

	@FXML
	public void close() {
		System.exit(0);
	}
}
//			FXMLLoader loader = new FXMLLoader(getClass().getResource("view/Superheader.fxml"));
//            AnchorPane page = (AnchorPane) loader.load();
//            Stage sendStage = new Stage();    
//            sendStage.setTitle("Send Profile");
//            Scene scene = new Scene(page);
//            sendStage.setScene(scene);          
//            sendStage.show();
