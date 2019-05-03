import java.util.Date;

<<<<<<< HEAD
//定义学生类
public class Student {
    //定义ID
    private int ID;
    //定义姓名
    private String name;
    //定义生日
=======
public class Student {
    private int ID;
    private String name;
>>>>>>> 68b8c2f132b1c8271494d7a5c5ef589c56f7ebfa
    private Date birDate;
    //male is true, female is false.
    private boolean gender;

<<<<<<< HEAD
    //定义学生对象
=======
>>>>>>> 68b8c2f132b1c8271494d7a5c5ef589c56f7ebfa
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

<<<<<<< HEAD
    //获取和设置ID
=======
>>>>>>> 68b8c2f132b1c8271494d7a5c5ef589c56f7ebfa
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
<<<<<<< HEAD
    //获取和设置姓名
=======

>>>>>>> 68b8c2f132b1c8271494d7a5c5ef589c56f7ebfa
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
<<<<<<< HEAD
    //获取和设置生日
=======

>>>>>>> 68b8c2f132b1c8271494d7a5c5ef589c56f7ebfa
    public Date getBirDate() {
        return birDate;
    }

    public void setBirDate(Date birDate) {
        this.birDate = birDate;
    }

<<<<<<< HEAD
    //获取和设置性别
=======
>>>>>>> 68b8c2f132b1c8271494d7a5c5ef589c56f7ebfa
    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
