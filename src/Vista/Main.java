package Vista;


import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // Cargar el archivo FXML usando getClass().getResource() para buscarlo en el directorio adecuado
        FXMLLoader loader = new FXMLLoader(getClass().getResource("repDatos.fxml"));

        // Cargar el archivo FXML y obtener el root (raíz) de la escena
        Parent root = loader.load();

        // Crear la escena con el root cargado desde el FXML
        Scene scene = new Scene(root);

        // Configurar la escena en el escenario (stage)
        stage.setScene(scene);
        stage.setTitle("CONVERSOR");
        stage.setResizable(false);

        // Mostrar el escenario
        stage.show();
    }
}
