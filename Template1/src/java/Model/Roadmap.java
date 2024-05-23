/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Phong
 */
public class Roadmap {
    private String RoadId;
    private Skill SkillId;
    private String RoadmapName;
    private String Image;

    public Roadmap() {
    }

    public Roadmap(String RoadId, Skill SkillId, String RoadmapName, String Image) {
        this.RoadId = RoadId;
        this.SkillId = SkillId;
        this.RoadmapName = RoadmapName;
        this.Image = Image;
    }

    public String getRoadId() {
        return RoadId;
    }

    public void setRoadId(String RoadId) {
        this.RoadId = RoadId;
    }

    public Skill getSkillId() {
        return SkillId;
    }

    public void setSkillId(Skill SkillId) {
        this.SkillId = SkillId;
    }

    public String getRoadmapName() {
        return RoadmapName;
    }

    public void setRoadmapName(String RoadmapName) {
        this.RoadmapName = RoadmapName;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    @Override
    public String toString() {
        return "Roadmap{" + "RoadId=" + RoadId + ", SkillId=" + SkillId + ", RoadmapName=" + RoadmapName + ", Image=" + Image + '}';
    }
    
    
}
