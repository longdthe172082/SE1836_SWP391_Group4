/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Phong
 */
public class Schedule {
    private int ScheduleId;
    private String StartDate;
    private String EndDate;
    private String Status;
    private Mentor MentorID;

    public Schedule() {
    }

    public Schedule(int ScheduleId, String StartDate, String EndDate, String Status, Mentor MentorID) {
        this.ScheduleId = ScheduleId;
        this.StartDate = StartDate;
        this.EndDate = EndDate;
        this.Status = Status;
        this.MentorID = MentorID;
    }

    public int getScheduleId() {
        return ScheduleId;
    }

    public void setScheduleId(int ScheduleId) {
        this.ScheduleId = ScheduleId;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public Mentor getMentorID() {
        return MentorID;
    }

    public void setMentorID(Mentor MentorID) {
        this.MentorID = MentorID;
    }

    @Override
    public String toString() {
        return "Schedule{" + "ScheduleId=" + ScheduleId + ", StartDate=" + StartDate + ", EndDate=" + EndDate + ", Status=" + Status + ", MentorID=" + MentorID + '}';
    }
    
    
    
}
