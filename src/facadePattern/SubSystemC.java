package facadePattern;

import model.UserInfo;
import model.VideoInfo;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class SubSystemC {
    Scanner scanner=new Scanner(System.in);
    public SubSystemC(List<VideoInfo> list, List<UserInfo>ulist, List<String> clist) {
        System.out.println("--------------------------------------------------------------");
        //登录
        System.out.println("请输入您的用户名");
        boolean flag=false;                     //登录成功的标识码
        String user=scanner.next();
        for(UserInfo u:ulist){
            if(u.getUserName().equals(user)) {
                flag=true;
                System.out.println("登录成功，您当前操作的用户是"+user);
                break;
            }
        }
        if(!flag) {System.out.println("登录失败");return;}

        //输入需要查找的视频
        System.out.println("请输入您需要查找的视频名");
        String vName=scanner.next();
        boolean flag1=false;
        for (VideoInfo v:list) {
            if(v.getVideoName().equals(vName)){
                //在此处进行克隆
                try {
                    Date date=new Date();
                    DateFormat df1=DateFormat.getDateInstance();
                    String dateTime = df1.format(date);               //获取转发时间
                    String information="转载用户:  "+user+"         "+v.clone().toString()+"   转载时间"+dateTime;
                    clist.add(information);
                    System.out.println("转发视频成功，请继续您的操作");
                    flag1=true;
                }catch (Exception e)
                {
                    e.printStackTrace();
                }
                break;
            }
        }
        if(!flag1) {System.out.println("对不起，没有当前视频哦~");}
    }
}
