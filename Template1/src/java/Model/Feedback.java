/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Phong
 */
public class Feedback {
    
    private int FeedbackId;
    private String Rating;
    private String Comment;
    private Mentee MenteeId;
    private Mentor MentorId;
    private String MenteeName;
    private String MentorName;

    public Feedback() {
    }

    public Feedback(int FeedbackId, String Rating, String Comment, Mentee MenteeId, Mentor MentorId, String MenteeName, String MentorName) {
        this.FeedbackId = FeedbackId;
        this.Rating = Rating;
        this.Comment = Comment;
        this.MenteeId = MenteeId;
        this.MentorId = MentorId;
        this.MenteeName = MenteeName;
        this.MentorName = MentorName;
    }

    public int getFeedbackId() {
        return FeedbackId;
    }

    public void setFeedbackId(int FeedbackId) {
        this.FeedbackId = FeedbackId;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String Rating) {
        this.Rating = Rating;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public Mentee getMenteeId() {
        return MenteeId;
    }

    public void setMenteeId(Mentee MenteeId) {
        this.MenteeId = MenteeId;
    }

    public Mentor getMentorId() {
        return MentorId;
    }

    public void setMentorId(Mentor MentorId) {
        this.MentorId = MentorId;
    }

    public String getMenteeName() {
        return MenteeName;
    }

    public void setMenteeName(String MenteeName) {
        this.MenteeName = MenteeName;
    }

    public String getMentorName() {
        return MentorName;
    }

    public void setMentorName(String MentorName) {
        this.MentorName = MentorName;
    }

    @Override
    public String toString() {
        return "Feedback{" + "FeedbackId=" + FeedbackId + ", Rating=" + Rating + ", Comment=" + Comment + ", MenteeId=" + MenteeId + ", MentorId=" + MentorId + ", MenteeName=" + MenteeName + ", MentorName=" + MentorName + '}';
    }
    
    
    
    
}
