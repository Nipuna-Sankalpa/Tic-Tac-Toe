/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller.student;

import datalayer.student.AttendanceDA;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.student.Attendance;
import model.student.AttendanceSheet;
import utilities.AddRecordException;

/**
 *
 * @author Pubudu
 */
public class AttendanceController {//act as the controller that handles messages from the view layer to data access layer
                                   //and vice versa.
    AttendanceDA attendanceData;

    public AttendanceController() {
        this.attendanceData = AttendanceDA.getInstance();
    }
    
    public boolean addAttendanceSheet(AttendanceSheet sheet) {
        boolean result = false;
        try {
            result = attendanceData.addAttendance(sheet);
        } catch (SQLException | ClassNotFoundException | AddRecordException ex) {
            Logger.getLogger(AttendanceController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result;
    }
    
}
