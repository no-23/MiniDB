import java.util.Date;

//定义学生类
public class Student {
    //定义ID
    private int ID;
    //定义姓名
    private String name;
    //定义生日
    private Date birDate;
    //male is true, female is false.
    private boolean gender;

    //定义学生对象
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

    //获取和设置ID
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    //获取和设置姓名
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //获取和设置生日
    public Date getBirDate() {
        return birDate;
    }

    public void setBirDate(Date birDate) {
        this.birDate = birDate;
    }

    //获取和设置性别
    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
