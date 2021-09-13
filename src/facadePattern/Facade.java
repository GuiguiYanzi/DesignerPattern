package facadePattern;

import model.UserInfo;
import model.VideoInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class Facade {
    List<VideoInfo> list = new ArrayList<>();
    List<UserInfo> ulist = new ArrayList<>();
    List<String> clist = new ArrayList<>();        //转载视频存储的链表
    Scanner scanner = new Scanner(System.in);
    public void operation(){
        System.out.println("这是一个视频网站权限系统，程序运行成功，启动！");
        System.out.println("------------------------------------------------------");
        while (true) {
            try {
                System.out.println("请输入你需要进行的功能:1.上传视频；2.用户注册；3.转载视频4.权限升级；5.搜索视频；6.查看当前所有信息;7.观看视频；8.退出程序");
                int temp = scanner.nextInt();
                switch (temp)
                {
                    case 1:
                        try{
                            SubSystemA systemA = new SubSystemA(list);
                        }catch (Exception e) {
                            System.out.println("请输入正确的信息");
                            continue;
                        }
                        break;
                    case 2:
                        try{
                            SubSystemB systemB=new SubSystemB(ulist);
                        }catch (Exception e)
                        {
                            System.out.println("信息输入错误，请重新输入");
                            continue;
                        }
                        break;
                    case 3:
                        try {
                            SubSystemC systemC=new SubSystemC(list,ulist,clist);
                        }catch (Exception e)
                        {
                            System.out.println("信息输入错误，请输入正确的信息哦~");
                            continue;
                        }
                        break;
                    case 4:
                        try{
                            SubSystemD systemD=new SubSystemD(list,ulist);
                        }catch (Exception e)
                        {
                            System.out.println("信息输入有误，请重新输入");
                            continue;
                        }
                        break;
                    case 5:
                        try {
                            SubSystemE systemE=new SubSystemE(list);
                        }catch (Exception e)
                        {
                            System.out.println("没有找到当前视频哦，请输入正确的信息");
                            continue;
                        }
                        break;
                    case 6:
                        SubSystemF systemF=new SubSystemF(list,ulist,clist);
                        break;
                    case 7:
                        SubSystemG systemG=new SubSystemG(list,ulist);
                        break;
                    case 8:
                        exit(0);
                }
            }catch (Exception e)
            {
                System.out.println("请输入正确的信息");
                continue;
            }
        }
    }
}
