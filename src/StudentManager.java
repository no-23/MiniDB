import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static java.lang.System.exit;

public class StudentManager {
    //暂存姓名、出生日期和性别等，还有全局变量
    private UI ui = new UI();
    private String name = "";
    private String date = "";
    private Integer id = 0;
    private boolean gender = true;
    private Student[] s = null;

    private int maxNum = 20;
    private Scanner input = new Scanner(System.in);
    private Map<Integer, Student> database = new TreeMap<Integer, Student>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1-o2;
        }
    });
    //insert
    public void insert(int id, String name, String birDate, boolean gender) throws Exception {
        //string such as "19970808"
        if(database.size() == 20){
            throw new Exception("失败，数据量已达到20个！");
        }
        Date date;
        try{
            date= new SimpleDateFormat("yyyyMMdd").parse(birDate);
        }catch(Exception e){
            throw new Exception("请输入正确格式，如'19970808'");
        }
        if(database.containsKey((id))){
            throw new Exception("已存在ID为"+id+"的学生，请先删除！");
        }
        database.put(id, new Student(id, name, date, gender));
    }
    //find
    public Student[] find(String name) throws Exception {
        Student[] s = new Student[20];
        int i = 0;
        boolean notFound = true;
        for(Student s1: database.values()){
            if(name.equals(s1.getName())){
                s[i++] = s1;
                notFound = false;
            }
        }
        if(notFound){
            throw new Exception("找不到姓名为 '"+name+"'的学生数据！");
        }
        return s;
    }
    //delete
    public void delete(int id) throws Exception {
        try{
            Student s = database.remove(id);
            if(s == null){
                throw new Exception();
            }
        }catch (Exception e){
            throw new Exception("删除失败！");
        }
    }
    //modify
    public void modify(int id, String name, String birDate, boolean gender) throws Exception {
        delete(id);
        Date date;
        try{
            date= new SimpleDateFormat("yyyyMMdd").parse(birDate);
        }catch(Exception e){
            throw new Exception("请输入正确格式，如'19970808'.");
        }
        database.put(id, new Student(id, name, date, gender));
    }

    //list name-search-lists return the number of the search result
    public int listMsg(String name) throws Exception {
        Student[] s = null;
        int count = 0;
        int id;
        try{
            s = find(name);
            for(Student s1: s){
                if(s1 != null){
                    count ++;
                    System.out.println("id:" + s1.getID() + "\t姓名：" + s1.getName() + "\t生日：" + new SimpleDateFormat("yyyy年MM月dd日").format(s1.getBirDate()) +
                            "\t性别: " + (s1.getGender() ? "男" : "女"));
                }
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
        if(count > 1){
            System.out.print("存在多个同名学生，请输入学生的ID继续进行：");
            try{
                id = input.nextInt();
                input.nextLine();
            }catch (Exception e){
                throw new Exception("输入类型异常，返回主菜单！");
            }
        }else if(count == 1){
            id = s[0].getID();
        } else{
            throw new Exception("找不到姓名为 '"+name+"'的学生数据！");
        }
        return  id;
    }

    public void getMsg() throws Exception {
        int t;
        try{
            System.out.print("请输入学生ID:");
            id = input.nextInt();
            input.nextLine();
            System.out.print("请输入姓名:");
            name = input.nextLine();
            System.out.print("请输入生日（格式：19970727）:");
            date = input.nextLine();
            System.out.print("请输入性别（数字‘1’代表男，其他数字代表女）:");
            t = input.nextInt();
            gender = (t==1)?true:false;

        }catch (Exception e){
            throw new Exception("输入类型异常，返回主菜单！");
        }finally {
            input.nextLine();
        }
    }

    public void esc(){
        exit(0);
    }


    public void App(){

        while(true){
            //输出选择菜单
            ui.cls();
            ui.displayMenu();
            int choose;
            try{
                choose = input.nextInt();
            }catch (Exception e){
                System.out.println("输入类型异常，返回主菜单！");
                ui.waitKey();
                continue;
            }finally {
                input.nextLine();
            }
            switch (choose) {
                //insert
                case 1:
                    ui.cls();
                    try{
                        getMsg();
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                        ui.waitKey();
                        continue;
                    }
                    try {
                        insert(id, name, date, gender);
                        System.out.println("插入成功！");
                    } catch (Exception e) {
                        System.out.print(e.getMessage());
                        ui.waitKey();
                        continue;
                    }
                    break;
                //find
                case 2:
                    ui.cls();
                    System.out.print("请输入要查找的学生姓名：");
                    name = input.next();
                    try{
                        s = find(name);
                        for(Student s1: s){
                            if(s1 != null){
                                System.out.println("ID:"+ s1.getID() + "\t姓名：" + s1.getName() + "\t生日：" + new SimpleDateFormat("yyyy年MM月dd日").format(s1.getBirDate()) +
                                        "\t性别: " + (s1.getGender() ? "男" : "女"));
                            }
                        }

                    }catch (Exception e){
                        System.out.println(e.getMessage());
                        ui.waitKey();
                        continue;
                    }
                    break;
                //delete
                case 3:
                    ui.cls();

                    System.out.println("请输入要删除的学生姓名:");
                     name = input.next();
                    try{
                        id = listMsg(name);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                        ui.waitKey();
                        continue;
                    }
                    try{
                        delete(id);
                        System.out.println("删除成功！");
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                        ui.waitKey();
                        continue;
                    }
                    break;
                //modify
                case 4:
                    ui.cls();
                    System.out.println("请输入要修改的学生姓名:");
                    name = input.next();
                    try{
                        id = listMsg(name);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                        ui.waitKey();
                        continue;
                    }
                    try{
                        getMsg();
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                        ui.waitKey();
                        continue;
                    }

                try{
                    modify(id,name,date,gender);
                }catch (Exception e){
                    System.out.println(e.getMessage());
                    ui.waitKey();
                    continue;
                }
                System.out.println("修改成功！");
                break;
                //display all
                case 5:
                    ui.cls();
                    System.out.println("显示全部学生数据：");
                    if(database.size()==0){
                        System.out.println("无数据！");
                    }
                    for(Student s_out: database.values()){
                        System.out.println("id:" + s_out.getID() + "\t姓名：" + s_out.getName() + "\t生日：" + new SimpleDateFormat("yyyy年MM月dd日").format(s_out.getBirDate()) +
                                "\t性别: " + (s_out.getGender() ? "男" : "女"));
                    }
                break;
                //exit program
                case 6:
                    ui.cls();
                    System.out.println("3秒后退出！");
                    try{
                        Thread.sleep(3000);
                    }catch (Exception e){}
                    esc();
                 break;
                default:
            }
            ui.waitKey();
        }
    }
}
