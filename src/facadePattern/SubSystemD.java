package facadePattern;

import Decorator.superVip;
import Decorator.vip;
import model.UserInfo;
import model.VideoInfo;

import java.util.List;
import java.util.Scanner;

public class SubSystemD {
    Scanner scanner=new Scanner(System.in);
    public SubSystemD(List<VideoInfo>list, List<UserInfo>ulist) {
        System.out.println("----------------------------------------------------------");
        //登录
        System.out.println("您需要先进行登录,请输入您的用户ID");
        boolean login=false;        //登录标识码
        int userid=scanner.nextInt();
        int len=ulist.size();
        for (int i=0;i<len;i++) {
            if(ulist.get(i).getUserId()==userid)
            {
                System.out.println("登录成功，您现在操作的用户是:"+ulist.get(i).getUserName()+"       您的权限等级为"+ulist.get(i).getMyIndex());
                System.out.println("您需要：1.通过答题成为vip用户，2.通过充值成为超级vip用户，3.不升级");
                int choice=scanner.nextInt();
                switch (choice){
                    case 1:
                        vip v=new vip(ulist.get(i));
                        ulist.get(i).setMyIndex(v.setLevel(ulist.get(i)));
                        //改变链表中用户信息的等级
                        ulist.set(i,ulist.get(i));
                        System.out.println("您现在的等级权限为"+ulist.get(i).getMyIndex());
                        break;
                    case 2:
                        superVip sv=new superVip(ulist.get(i));
                        ulist.get(i).setMyIndex(sv.setLevel(ulist.get(i)));
                        //改变链表中用户信息的等级
                        ulist.set(i,ulist.get(i));
                        System.out.println("您现在的等级权限为"+ulist.get(i).getMyIndex());
                        break;
                    default:
                        break;
                }
                System.out.println("您当前可以看的视频为");
                for (VideoInfo v:list) {
                    if(ulist.get(i).getMyIndex()>=v.getIndex())
                        System.out.println(v.getVideoName());
                }
                login=true;
                break;
            }
        }
        if(!login) {
            System.out.println("登录失败，id输入有误，请重新输入");
        }
    }
}
