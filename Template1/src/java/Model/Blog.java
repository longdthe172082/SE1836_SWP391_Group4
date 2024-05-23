/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Phong
 */
public class Blog {
    
    private int BlogId;
    private String Title;
    private String Description;
    private String Author;
    private String Status;
    private String Intro;
    private String Image;
    private String Update_Time;

    public Blog() {
    }

    public Blog(int BlogId, String Title, String Description, String Author, String Status, String Intro, String Image, String Update_Time) {
        this.BlogId = BlogId;
        this.Title = Title;
        this.Description = Description;
        this.Author = Author;
        this.Status = Status;
        this.Intro = Intro;
        this.Image = Image;
        this.Update_Time = Update_Time;
    }

    public int getBlogId() {
        return BlogId;
    }

    public void setBlogId(int BlogId) {
        this.BlogId = BlogId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getIntro() {
        return Intro;
    }

    public void setIntro(String Intro) {
        this.Intro = Intro;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    public String getUpdate_Time() {
        return Update_Time;
    }

    public void setUpdate_Time(String Update_Time) {
        this.Update_Time = Update_Time;
    }

    @Override
    public String toString() {
        return "Blog{" + "BlogId=" + BlogId + ", Title=" + Title + ", Description=" + Description + ", Author=" + Author + ", Status=" + Status + ", Intro=" + Intro + ", Image=" + Image + ", Update_Time=" + Update_Time + '}';
    }
    
    
    
}
