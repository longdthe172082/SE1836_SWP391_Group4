/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Phong
 */
public class CV {
    
    private Mentor MentorId;
    private String FullName;
    private String AccName;
    private String Dob;
    private String PhoneNumber;
    private String Email;
    private String Avatar;
    private String Skill;
    private String Job;
    private String Job_Intro;
    private String Archivement;
    private String Service;

    public CV() {
    }

    public CV(Mentor MentorId, String FullName, String AccName, String Dob, String PhoneNumber, String Email, String Avatar, String Skill, String Job, String Job_Intro, String Archivement, String Service) {
        this.MentorId = MentorId;
        this.FullName = FullName;
        this.AccName = AccName;
        this.Dob = Dob;
        this.PhoneNumber = PhoneNumber;
        this.Email = Email;
        this.Avatar = Avatar;
        this.Skill = Skill;
        this.Job = Job;
        this.Job_Intro = Job_Intro;
        this.Archivement = Archivement;
        this.Service = Service;
    }

    public Mentor getMentorId() {
        return MentorId;
    }

    public void setMentorId(Mentor MentorId) {
        this.MentorId = MentorId;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public String getAccName() {
        return AccName;
    }

    public void setAccName(String AccName) {
        this.AccName = AccName;
    }

    public String getDob() {
        return Dob;
    }

    public void setDob(String Dob) {
        this.Dob = Dob;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAvatar() {
        return Avatar;
    }

    public void setAvatar(String Avatar) {
        this.Avatar = Avatar;
    }

    public String getSkill() {
        return Skill;
    }

    public void setSkill(String Skill) {
        this.Skill = Skill;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String Job) {
        this.Job = Job;
    }

    public String getJob_Intro() {
        return Job_Intro;
    }

    public void setJob_Intro(String Job_Intro) {
        this.Job_Intro = Job_Intro;
    }

    public String getArchivement() {
        return Archivement;
    }

    public void setArchivement(String Archivement) {
        this.Archivement = Archivement;
    }

    public String getService() {
        return Service;
    }

    public void setService(String Service) {
        this.Service = Service;
    }

    @Override
    public String toString() {
        return "CV{" + "MentorId=" + MentorId + ", FullName=" + FullName + ", AccName=" + AccName + ", Dob=" + Dob + ", PhoneNumber=" + PhoneNumber + ", Email=" + Email + ", Avatar=" + Avatar + ", Skill=" + Skill + ", Job=" + Job + ", Job_Intro=" + Job_Intro + ", Archivement=" + Archivement + ", Service=" + Service + '}';
    }

    
    
    
    
}
