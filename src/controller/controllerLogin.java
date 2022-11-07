package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class controllerLogin {

    @FXML
    private TextField txtUsuario;

    @FXML
    private PasswordField txtContraseniaUsuario;

    @FXML
    private Button btnEntrar;

    @FXML
    private Button btnRegistrarse;

    @FXML
    private HBox HboxVistaMensajeIn;

    @FXML
    private Label lblMensajeIn;

    @FXML
    private VBox vboxPanelRegistrar;

    @FXML
    private TextField txtUsuarioNuevo;

    @FXML
    private TextField txtNombres;

    @FXML
    private TextField txtApellidos;

    @FXML
    private TextField txtIdentificacion;

    @FXML
    private TextField txtCargo;

    @FXML
    private TextField txtContraseniaNewUsuario;

    @FXML
    private TextField txtConfirmarContraseniaNewUser;

    @FXML
    private Button btnRegistrarNuevoUsuario;

    @FXML
    private HBox HboxViewMensajeRegistrar;

    @FXML
    private Label lblMensajeRegistrar;

    @FXML
    void ingresarPanelUsuario(ActionEvent event) {

    }

    @FXML
    void mostrarPanelRegistrar(ActionEvent event) {

    }

}