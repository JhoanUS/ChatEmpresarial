package controller;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class controllerPanelUsuario {

    @FXML
    private ImageView imageUser;

    @FXML
    private VBox vboxInfoUsuario;

    @FXML
    private Label lblNameUser;

    @FXML
    private Label lblOccupation;

    @FXML
    private ImageView imageGoOut;

    @FXML
    private ComboBox<?> ComboBoxCargos;

    @FXML
    private VBox vboxContactosActivos;

    @FXML
    private HBox HboxContacto;

    @FXML
    private ImageView imgeContact;

    @FXML
    private VBox vboxContactInfo;

    @FXML
    private Label lblNameConctact;

    @FXML
    private Label lblCargoContact;

    @FXML
    private ImageView imageContactChat;

    @FXML
    private VBox vboxInfoContactChat;

    @FXML
    private Label lblNameContactChat;

    @FXML
    private Label lblEstadoChat;

    @FXML
    private VBox vboxHistorialMensajesChat;

    @FXML
    private HBox hboxMensajeRecibido;

    @FXML
    private Label lblMensajeRecibido;

    @FXML
    private Label lblFechaMensajeRecibido;

    @FXML
    private HBox hboxMensajeEnviado;

    @FXML
    private Label lblFechaMensajeEnviado;

    @FXML
    private Label lblMensajeEnviado;

    @FXML
    private ImageView imgeEnviarDocumento;

    @FXML
    private TextField textMensajeAEnviar;

    @FXML
    private ImageView imageEnviarMensaje;

    @FXML
    void abrirChatContact(MouseEvent event) {

    }

    @FXML
    void cerrarSesionUsuario(MouseEvent event) {

    }

    @FXML
    void enviarDocumentoChat(MouseEvent event) {

    }

    @FXML
    void enviarMensajeChat(MouseEvent event) {

    }

}

