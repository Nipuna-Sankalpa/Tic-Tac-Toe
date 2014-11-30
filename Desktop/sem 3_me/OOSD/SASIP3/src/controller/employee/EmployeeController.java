/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller.employee;

import datalayer.employee.EmployeeDA;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import model.employee.Employee;

/**
 *
 * @author Mampitiya
 */
public class EmployeeController { //act as the controller that handles messages from the view layer to data access layer
                                   //and vice versa.
    private final EmployeeDA employeeDA;

    public EmployeeController() {
        employeeDA = new EmployeeDA();
    }
    
    public int addEmployee(Employee emp) throws SQLException, ClassNotFoundException, FileNotFoundException {//add Employee
        return employeeDA.addEmployee(emp);
    }
    
    public int updateEmployee(Employee emp) throws ClassNotFoundException, SQLException, FileNotFoundException {//update Employee
        return employeeDA.updateEmployee(emp);
    }
    
    public int deleteEmployee(String employeeID) throws ClassNotFoundException, SQLException {//delete Employee
        return employeeDA.deleteEmployee(employeeID);
    }
    
    public Employee searchEmployeeByName(String name) throws ClassNotFoundException, SQLException {//search Employee By Name
        return employeeDA.searchEmployeeByName(name);
    }
    
    public Employee searchEmployeeByID(String employeeID) throws ClassNotFoundException, SQLException {//search Employee By Name
        return employeeDA.searchEmployeeByID(employeeID);
    }
    
    public String updateId() throws SQLException, ClassNotFoundException {//return the next new id
        return employeeDA.updateId();
    }
    
    public int updatePassword(String employeeID, String newPw) throws ClassNotFoundException, SQLException{//update Password
        return employeeDA.updatePassword(employeeID, newPw);
    }
}
