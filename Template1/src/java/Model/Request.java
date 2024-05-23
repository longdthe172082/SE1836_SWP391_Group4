/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Phong
 */
public class Request {
    private int RequestId;
    private String Title;
    private String Content;
    private String DeadlineDate;
    private String DeadlineHour;
    private Skill SkillId;
    private String Status;
    private Mentor MentorId;
    private Mentee MenteeId;

    public Request() {
    }

    public Request(int RequestId, String Title, String Content, String DeadlineDate, String DeadlineHour, Skill SkillId, String Status, Mentor MentorId, Mentee MenteeId) {
        this.RequestId = RequestId;
        this.Title = Title;
        this.Content = Content;
        this.DeadlineDate = DeadlineDate;
        this.DeadlineHour = DeadlineHour;
        this.SkillId = SkillId;
        this.Status = Status;
        this.MentorId = MentorId;
        this.MenteeId = MenteeId;
    }

    public int getRequestId() {
        return RequestId;
    }

    public void setRequestId(int RequestId) {
        this.RequestId = RequestId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }

    public String getDeadlineDate() {
        return DeadlineDate;
    }

    public void setDeadlineDate(String DeadlineDate) {
        this.DeadlineDate = DeadlineDate;
    }

    public String getDeadlineHour() {
        return DeadlineHour;
    }

    public void setDeadlineHour(String DeadlineHour) {
        this.DeadlineHour = DeadlineHour;
    }

    public Skill getSkillId() {
        return SkillId;
    }

    public void setSkillId(Skill SkillId) {
        this.SkillId = SkillId;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public Mentor getMentorId() {
        return MentorId;
    }

    public void setMentorId(Mentor MentorId) {
        this.MentorId = MentorId;
    }

    public Mentee getMenteeId() {
        return MenteeId;
    }

    public void setMenteeId(Mentee MenteeId) {
        this.MenteeId = MenteeId;
    }

    @Override
    public String toString() {
        return "Request{" + "RequestId=" + RequestId + ", Title=" + Title + ", Content=" + Content + ", DeadlineDate=" + DeadlineDate + ", DeadlineHour=" + DeadlineHour + ", SkillId=" + SkillId + ", Status=" + Status + ", MentorId=" + MentorId + ", MenteeId=" + MenteeId + '}';
    }
    
    
}
