package Vista;

import Fachada.FachadaDatos;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class repDatosController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> cboUnidadEntrada;

    @FXML
    private ComboBox<String> cboUnidadSalida;

    @FXML
    private Button cmdConvertir;

    @FXML
    private TextField txtIngresarValor;

    @FXML
    private TextField txtResultadoConversion;

    private FachadaDatos facade;

    @FXML
    void ConvertirUnidad(ActionEvent event) {
        try {
            double valor = Double.parseDouble(txtIngresarValor.getText());
            String entrada = cboUnidadEntrada.getValue();
            String salida = cboUnidadSalida.getValue();

            if (entrada == null || salida == null) {
                alertError("Seleccione ambas unidades.");
                return;
            }

            String tipo = tipoConversion(entrada, salida);

            double resultado = facade.convertir(tipo, valor, entrada, salida);

            txtResultadoConversion.setText(String.valueOf(resultado));
        } catch (NumberFormatException e) {
            alertError("Error: ingrese un número válido.");
        } catch (IllegalArgumentException e) {
            alertError(e.getMessage());
        }
    }

    @FXML
    void initialize() {
        assert cboUnidadEntrada != null : "fx:id=\"cboUnidadEntrada\" was not injected: check your FXML file 'repDatos.fxml'.";
        assert cboUnidadSalida != null : "fx:id=\"cboUnidadSalida\" was not injected: check your FXML file 'repDatos.fxml'.";
        assert cmdConvertir != null : "fx:id=\"cmdConvertir\" was not injected: check your FXML file 'repDatos.fxml'.";
        assert txtIngresarValor != null : "fx:id=\"txtIngresarValor\" was not injected: check your FXML file 'repDatos.fxml'.";
        assert txtResultadoConversion != null : "fx:id=\"txtResultadoConversion\" was not injected: check your FXML file 'repDatos.fxml'.";

        facade = new FachadaDatos();
        unidadEntrada();
        unidadSalida();
        valorDefectoCbo();
    }

    private void unidadEntrada() {
        cboUnidadEntrada.getItems().addAll(
                "b", "kb", "Mb", "Gb", "Tb", "Pb", "Eb", "Zb", "Yb",
                "Kib", "Mib", "Gib", "Tib", "Pib", "Eib", "Zib", "Yib",
                "B", "kB", "MB", "GB", "TB", "PB", "EB", "ZB", "YB",
                "KiB", "MiB", "GiB", "TiB", "PiB", "EiB", "ZiB", "YiB"
        );
    }

    private void unidadSalida() {
        cboUnidadSalida.getItems().addAll(cboUnidadEntrada.getItems());
    }

    private String tipoConversion(String entrada, String salida) {
        if (extraerTipo(entrada).equals("Bytes") && extraerTipo(salida).equals("Bits")) {
            return "BytesABits";
        } else if (extraerTipo(entrada).equals("Bits") && extraerTipo(salida).equals("Bytes")) {
            return "BitsABytes";
        } else {
            return "Iguales";
        }
    }

    private void valorDefectoCbo() {
        cboUnidadEntrada.setValue("b");
        cboUnidadSalida.setValue("B");
    }

    private String extraerTipo(String unidad) {
        if (unidad.contains("B")) {
            return "Bytes";
        } else {
            return "Bits";
        }
    }

    private void alertError(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR, message, ButtonType.OK);
        alert.setTitle("ERROR");
        alert.setHeaderText("Algo va mal... ");
        alert.showAndWait();
    }

}
