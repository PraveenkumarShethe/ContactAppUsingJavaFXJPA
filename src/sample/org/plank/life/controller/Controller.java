package sample.org.plank.life.controller;

import com.sun.org.apache.xpath.internal.SourceTree;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.org.plank.life.bean.RegisterBean;

public class Controller extends Application{

     /*   */
     @FXML
     private TextField UserName ;

    @FXML
    private PasswordField pwd ;

    @FXML
    private PasswordField conpwd ;

    @FXML
    private TextField mobileNo ;

    @FXML
    private TextField postalPin ;

    @FXML
    private TextField address ;

    @FXML
    private RadioButton she ;

    @FXML
    private RadioButton he ;
    /*    */

    @Override
    public void start(Stage primaryStage) throws Exception {

    }

    @FXML
    public void registerAction(ActionEvent event ) {

        //User Values
        String userName = UserName.getText();
        String userPwd = pwd.getText();
        String userConPwd = conpwd.getText();
        String userMobileNo = mobileNo.getText();
        String userPostalPin = postalPin.getText();
        String userAddress = address.getText();

        if(UserName != null && !UserName.equals("")&&userPwd != null && !userPwd.equals("")&&userConPwd != null && !userConPwd.equals("")&&userMobileNo != null && !userMobileNo.equals("")&&userAddress != null && !userAddress.equals("")&&userPostalPin != null && !userPostalPin.equals("")) {
            /* Check for the data  */
            System.out.println("*****************IF************************");
            System.out.println(userName);
            System.out.println(userPwd);
            System.out.println(userConPwd);
            System.out.println(userMobileNo);
            System.out.println(userPostalPin);
            System.out.println(userAddress);

            RegisterBean rb = new RegisterBean();
            rb.setUserName(userName);
            rb.setPwd(userPwd);
            rb.setConpwd(userConPwd);
            rb.setMobileNo(userMobileNo);
            rb.setPostalPin(userPostalPin);
            rb.setAddress(userAddress);

        }
        else{
            System.out.println("*************ELSE****************************");
            System.out.println(userName);
            System.out.println(userPwd);
            System.out.println(userConPwd);
            System.out.println(userMobileNo);
            System.out.println(userPostalPin);
            System.out.println(userAddress);


        }





    }
}
