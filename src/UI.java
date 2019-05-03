import java.util.Scanner;

public class UI {
    private String menu =
            "**********************************************************************\n"+
            "*                           1  插入                                  *\n"+
            "*                           2  查找                                  *\n"+
            "*                           3  删除                                  *\n"+
            "*                           4  修改                                  *\n"+
            "*                           5  输出                                  *\n"+
            "*                           6  退出                                  *\n"+
            "**********************************************************************\n"+ "请选择操作(数字1~6)：\n";

    public void cls(){
        try{
            Thread.sleep(1000);
        }catch (Exception e){}
        for(int i = 0; i < 90; i++){
            System.out.println();
        }
    }

    public void waitKey(){
        System.out.println("****************************");
        System.out.println("按回车键继续！");
        new Scanner(System.in).nextLine();
    }
    public void displayMenu(){
        System.out.print(menu);
    }
}
