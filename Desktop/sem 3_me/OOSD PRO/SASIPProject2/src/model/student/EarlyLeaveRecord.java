/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.student;

/**
 *
 * @author Pubudu
 */
public class EarlyLeaveRecord {
    private String entryId;
    private String classId;
    private String studentId;
    private String reason;

    public EarlyLeaveRecord(String entryId, String classId, String studentId, String reason) {
        this.entryId = entryId;
        this.classId = classId;
        this.studentId = studentId;
        this.reason = reason;
    }

    public String getEntryId() {
        return entryId;
    }

    public String getClassId() {
        return classId;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getReason() {
        return reason;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
