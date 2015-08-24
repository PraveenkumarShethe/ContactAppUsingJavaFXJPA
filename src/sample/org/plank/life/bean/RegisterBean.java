package sample.org.plank.life.bean;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Praveenkumar on 24-08-2015.
 */
public class RegisterBean{


    private String UserName ;


    private String pwd ;


    private String conpwd ;


    private String mobileNo ;


    private String postalPin ;


    private String address ;

    private boolean male ;

    private boolean female ;

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getConpwd() {
        return conpwd;
    }

    public void setConpwd(String conpwd) {
        this.conpwd = conpwd;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getPostalPin() {
        return postalPin;
    }

    public void setPostalPin(String postalPin) {
        this.postalPin = postalPin;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public boolean isFemale() {
        return female;
    }

    public void setFemale(boolean female) {
        this.female = female;
    }
}
