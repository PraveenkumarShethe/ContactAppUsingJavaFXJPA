package sample.org.plank.life.bean;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import javax.xml.soap.Text;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Praveenkumar on 24-08-2015.
 */
public class LoginBean implements Initializable {

    @FXML
    private TextField UserName ;

    @FXML
    private TextField UserPwd ;


    public TextField getUserName() {
        return UserName;
    }

    public void setUserName(TextField userName) {
        UserName = userName;
    }

    public TextField getUserPwd() {
        return UserPwd;
    }

    public void setUserPwd(TextField userPwd) {
        UserPwd = userPwd;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
