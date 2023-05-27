package com.example.freshly;

import javafx.animation.FadeTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.util.Duration;
import javafx.scene.control.PasswordField;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class FreshlyController implements Initializable {
    @FXML
    private Hyperlink BackToLoginPage;

    @FXML
    private ComboBox<?> ChooseRoleComboBox;

    @FXML
    private Button ConfirmEmailButton;

    @FXML
    private Button CreateAccountButton;

    @FXML
    private Label CreateAccountText;

    @FXML
    private Hyperlink DontHaveAnAccount;

    @FXML
    private TextField EmailTextField;

    @FXML
    private Label EnterEmailText;

    @FXML
    private TextField FamilyTextField;

    @FXML
    private Pane ForgotPasswordPane;

    @FXML
    private Hyperlink HaveAnAccount;

    @FXML
    private Button LoginButton;

    @FXML
    private Pane LoginPane;

    @FXML
    private Label LoginText;

    @FXML
    private TextField NameTextField;

    @FXML
    private PasswordField PasswordTextField;

    @FXML
    private PasswordField PasswordfTextFieldLoginPane;

    @FXML
    private TextField PhoneNumberTextField;

    @FXML
    private Label RetrivalPasswordText;

    @FXML
    private Hyperlink SendAgain;

    @FXML
    private Pane SignupPane;

    @FXML
    private TextField UsenameTextFieldLoginPane;

    @FXML
    private TextField UsernameTextField;

    @FXML
    private TextField VerificationٍEmailTextField;


    public void SetChooseRole(){
        String[]RoleList = {"خریدار" , "فروشنده"};
        List<String> ItemList = new ArrayList<>();

        for (String data : RoleList){
            ItemList.add(data);
        }

        ObservableList DataList= FXCollections.observableArrayList(ItemList);
        ChooseRoleComboBox.setItems(DataList);
    }

    @FXML
    public void SwitchToForgotPasswordPage(ActionEvent actionEvent) {
        LoginPane.setVisible(false);
        ForgotPasswordPane.setVisible(true);
    }

    @FXML
    public void SwitchToLoginPageFromForgotPasswordPage(ActionEvent actionEvent) {
        ForgotPasswordPane.setVisible(false);
        LoginPane.setVisible(true);
    }

    @FXML
    public void SwitchToForgotLoginPage(ActionEvent actionEvent) {
        SignupPane.setVisible(false);
        LoginPane.setVisible(true);
    }

    @FXML
    public void SwitchToForgotSignupPage(ActionEvent actionEvent) {
        LoginPane.setVisible(false);
        SignupPane.setVisible(true);
    }



    public void FadeIn(ImageView imageView){
        FadeTransition fd = new FadeTransition();

        //set the duration for the Fade transition
        fd.setDuration(Duration.millis(2000));
        fd.setFromValue(0);
        fd.setToValue(100);

        //the transition will set to be auto reversed by setting this to true
        fd.setAutoReverse(false);

        //set Circle as the node onto which the transition will be applied
        fd.setNode(imageView);

        //playing the transition
        fd.play();
    }

    public void FadeOut(ImageView imageView){
        FadeTransition fd = new FadeTransition();

        //set the duration for the Fade transition
        fd.setDuration(Duration.millis(2000));
        fd.setFromValue(100);
        fd.setToValue(0);

        //the transition will set to be auto reversed by setting this to true
        fd.setAutoReverse(false);

        //set Circle as the node onto which the transition will be applied
        fd.setNode(imageView);

        //playing the transition
        fd.play();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        SetChooseRole();
    }
}