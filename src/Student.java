import java.util.Date;

<<<<<<< HEAD
//����ѧ����
public class Student {
    //����ID
    private int ID;
    //��������
    private String name;
    //��������
=======
public class Student {
    private int ID;
    private String name;
>>>>>>> 68b8c2f132b1c8271494d7a5c5ef589c56f7ebfa
    private Date birDate;
    //male is true, female is false.
    private boolean gender;

<<<<<<< HEAD
    //����ѧ������
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
    //��ȡ������ID
=======
>>>>>>> 68b8c2f132b1c8271494d7a5c5ef589c56f7ebfa
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
<<<<<<< HEAD
    //��ȡ����������
=======

>>>>>>> 68b8c2f132b1c8271494d7a5c5ef589c56f7ebfa
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
<<<<<<< HEAD
    //��ȡ����������
=======

>>>>>>> 68b8c2f132b1c8271494d7a5c5ef589c56f7ebfa
    public Date getBirDate() {
        return birDate;
    }

    public void setBirDate(Date birDate) {
        this.birDate = birDate;
    }

<<<<<<< HEAD
    //��ȡ�������Ա�
=======
>>>>>>> 68b8c2f132b1c8271494d7a5c5ef589c56f7ebfa
    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
