/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.login;

import accessLevels.AccessLevelManager;
import datalayer.employee.EmployeeDA;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import main.MainGUI;
import model.employee.Employee;

/**
 *
 * @author Yellow Flash
 */
public class LoginController {

    public static void login(LoginWindowInterface window) {
        Employee employee = null;
        String userID;
        int accessLevel;
        char[] password, password1 = null;
        userID = window.getUserTxtFld().getText();
        password = window.getPswrdField().getPassword();
        try {
            employee = new EmployeeDA().searchEmployeeByID(userID);
            password1 = employee.getPassword().toCharArray();
            accessLevel = employee.getAccessLevel();
            if (Arrays.equals(password, password1)) {
                window.setVisible(false);
                MainGUI mainGUI = new MainGUI();
                mainGUI.setExtendedState(JFrame.MAXIMIZED_BOTH);
                mainGUI.setUserName(userID);

                AccessLevelManager alm = new AccessLevelManager(mainGUI);

                switch (accessLevel) {
                    case 2:
                        alm.cashierAccess();
                        break;

                    case 3:
                        alm.teamLeaderAccess();
                        break;

                    case 4:
                        alm.cardMarkerAccess();
                        break;
                }
                mainGUI.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(window, "Access Denide");
            }
        } catch (ClassNotFoundException | SQLException ex) {
        }
    }

    public static void enterLogin(final LoginWindowInterface window) {
        window.getPswrdField().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    Employee employee = null;
                    String userID;
                    int accessLevel;
                    char[] password, password1 = null;
                    userID = window.getUserTxtFld().getText();
                    password = window.getPswrdField().getPassword();                   
                    
                    try {
                        employee = new EmployeeDA().searchEmployeeByID(userID);
                        
                        if(employee != null){
                        password1 = employee.getPassword().toCharArray();
                        accessLevel = employee.getAccessLevel();
                        if (Arrays.equals(password, password1)) {
                            window.setVisible(false);
                            MainGUI mainGUI = new MainGUI();
                            mainGUI.setExtendedState(JFrame.MAXIMIZED_BOTH);
                            mainGUI.setUserName(userID);

                            AccessLevelManager alm = new AccessLevelManager(mainGUI);

                            switch (accessLevel) {
                                case 2:
                                    alm.cashierAccess();
                                    break;

                                case 3:
                                    alm.teamLeaderAccess();
                                    break;

                                case 4:
                                    alm.cardMarkerAccess();
                                    break;
                            }

                            mainGUI.setVisible(true);
                        } 
                        }else {
                            JOptionPane.showMessageDialog(window, "Access Denide");
                        }
                    } catch (ClassNotFoundException | SQLException ex) {
                    }
                }
            }
        });
    }
}
