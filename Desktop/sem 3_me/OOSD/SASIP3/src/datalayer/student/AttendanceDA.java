/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datalayer.student;

import com.sun.rowset.CachedRowSetImpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import model.exam.MarkSheet;
import model.exam.StudentMark;
import model.student.Attendance;
import model.student.AttendanceSheet;
import utilities.AddRecordException;
import utilities.DBConnection;
import utilities.DBHandler;

/**
 *
 * @author Mampitiya
 */
public class AttendanceDA {
    private static AttendanceDA attendanceData;
    private Connection con;
    private  PreparedStatement statement;
    
    private AttendanceDA(){}
    
    public static AttendanceDA getInstance() {
        if(attendanceData == null)
            attendanceData = new AttendanceDA();
        
        return attendanceData;
    }
//if the commit failed throw an enter mark exception
    public  boolean addAttendance(AttendanceSheet sheet) throws SQLException, ClassNotFoundException, AddRecordException {
        con = DBConnection.getConnection();
        Iterator<Attendance> it = sheet.iterator();
        Attendance record;
        String query = "INSERT INTO attendance (studentID,classID,date,time,employeeID) values (?,?,?,?,?)";
        con.setAutoCommit(false);
        statement = con.prepareStatement(query);

        while (it.hasNext()) {
            record = it.next();
            statement.setString(1, record.getStudentId());
            statement.setString(2, sheet.getClassID());
            statement.setDate(3, record.getDate());
            statement.setTime(4, record.getTime());
            statement.setString(5, record.getEmployeeID());
            statement.addBatch();
            System.out.println(statement);
        }

        if (!it.hasNext()) {
            statement.executeBatch();
            con.commit();
            return true;
        } else {
            con.rollback();
            throw new AddRecordException();
        }

    }

//    public static void main(String[] args) throws SQLException, ClassNotFoundException, AddRecordException {
//        AttendanceDA at=getInstance();
//        AttendanceSheet sheet=new AttendanceSheet();
//        sheet.setClassID(4+"");
//        
//        sheet.addRecord(new Attendance("00000100", System.currentTimeMillis(), "120339"));
//        sheet.addRecord(new Attendance("1", System.currentTimeMillis(), "120339"));
//        sheet.addRecord(new Attendance("10", System.currentTimeMillis(), "120339"));
//        sheet.addRecord(new Attendance("11", System.currentTimeMillis(), "120339"));
//    
//        at.addAttendance(sheet);
//    }
    public  int updateAttendance(Attendance newEntry, Attendance oldEntry) throws ClassNotFoundException, SQLException {
        con = DBConnection.getConnection();
        String query = "UPDATE attendance SET studentID=?,examID=?,date=?,time=?,employeeID=? WHERE studentID='" + oldEntry.getStudentId() + "' AND classID='" + oldEntry.getClassID() + "' AND date='" + oldEntry.getDate() + "' AND time='" + oldEntry.getTime() + "'";
        statement = con.prepareStatement(query);

        statement.setString(1, newEntry.getStudentId());
        statement.setString(2, newEntry.getClassID());
        statement.setDate(3, newEntry.getDate());
        statement.setTime(4, newEntry.getTime());
        statement.setString(5, newEntry.getEmployeeID());

        int temp = statement.executeUpdate();
        con.close();

        return temp;
    }

    public  CachedRowSetImpl retrieveSingleStudentMarks(String studentID, String classID) throws ClassNotFoundException, SQLException {
        CachedRowSetImpl rs = new CachedRowSetImpl();
        con = DBConnection.getConnection();

        String query = "SELECT * FROM attendance WHERE StudentID='" + studentID + "' AND classID='" + classID + "' ORDER BY date";
        rs.populate(DBHandler.getData(con, query));
        con.close();
        return rs;
    }

}
