import java.util.Date;

public class Student {
    private int ID;
    private String name;
    private Date birDate;
    //male is true, female is false.
    private boolean gender;

    public Student(){
        ID = 0;
        name = "";
        birDate = new Date();
    }

    public Student(int ID, String name, Date birDate, boolean gender){
        this.ID = ID;
        this.name = name;
        this.birDate = birDate;
        this.gender = gender;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirDate() {
        return birDate;
    }

    public void setBirDate(Date birDate) {
        this.birDate = birDate;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
