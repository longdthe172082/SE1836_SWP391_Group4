/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Phong
 */
public class Skill {
    private String SkillId;
    private String SkillName;
    private String Price;
    private Schedule ScheduleId;
    private String Image;

    public Skill() {
    }

    public Skill(String SkillId, String SkillName, String Price, Schedule ScheduleId, String Image) {
        this.SkillId = SkillId;
        this.SkillName = SkillName;
        this.Price = Price;
        this.ScheduleId = ScheduleId;
        this.Image = Image;
    }

    public String getSkillId() {
        return SkillId;
    }

    public void setSkillId(String SkillId) {
        this.SkillId = SkillId;
    }

    public String getSkillName() {
        return SkillName;
    }

    public void setSkillName(String SkillName) {
        this.SkillName = SkillName;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public Schedule getScheduleId() {
        return ScheduleId;
    }

    public void setScheduleId(Schedule ScheduleId) {
        this.ScheduleId = ScheduleId;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    @Override
    public String toString() {
        return "Skill{" + "SkillId=" + SkillId + ", SkillName=" + SkillName + ", Price=" + Price + ", ScheduleId=" + ScheduleId + ", Image=" + Image + '}';
    }
    
    
}
