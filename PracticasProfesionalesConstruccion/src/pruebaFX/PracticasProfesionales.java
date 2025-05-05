package pruebaFX;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PracticasProfesionales extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Parent root = FXMLLoader.load(getClass().getResource("/pruebaFX/FXMLOrganizacionVinculadaRegistro.fxml"));
        
        primaryStage.setTitle("Información Organizacion Vinculada");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    
    public static void main (String [] args){
        launch(args);
    }
    
}
