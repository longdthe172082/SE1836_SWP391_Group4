/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Phong
 */
public class Skill_Mentor {
    private Skill SkillId;
    private Mentor MentorId;

    public Skill_Mentor() {
    }

    public Skill_Mentor(Skill SkillId, Mentor MentorId) {
        this.SkillId = SkillId;
        this.MentorId = MentorId;
    }

    public Skill getSkillId() {
        return SkillId;
    }

    public void setSkillId(Skill SkillId) {
        this.SkillId = SkillId;
    }

    public Mentor getMentorId() {
        return MentorId;
    }

    public void setMentorId(Mentor MentorId) {
        this.MentorId = MentorId;
    }

    @Override
    public String toString() {
        return "Skill_Mentor{" + "SkillId=" + SkillId + ", MentorId=" + MentorId + '}';
    }
    
    
    
}
