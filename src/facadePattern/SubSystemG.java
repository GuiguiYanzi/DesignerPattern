package facadePattern;

import model.UserInfo;
import model.VideoInfo;
import state.*;

import java.util.List;
import java.util.Scanner;

public class SubSystemG {
    Scanner scanner = new Scanner(System.in);

    public SubSystemG(List<VideoInfo> list, List<UserInfo> ulist) {
        //搜出用户可以查看的视频
        //用户登录
        System.out.println("----------------------------------------------------------");
        System.out.println("您需要先进行登录,请输入您的用户ID");
        boolean login = false;        //登录标识码
        int userid = scanner.nextInt();
        int len = ulist.size();
        for (int i = 0; i < len; i++) {
            if (ulist.get(i).getUserId() == userid) {
                System.out.println("登录成功，您现在操作的用户是:" + ulist.get(i).getUserName() + "       您的权限等级为" + ulist.get(i).getMyIndex());
            }
            System.out.println("您当前可以看的视频为");
            for (VideoInfo v:list) {
                if(ulist.get(i).getMyIndex()>=v.getIndex())
                    System.out.println(v.getVideoName());
            }
            System.out.println("请输入您需要观看的视频:");
            String videoName=scanner.next();
            System.out.println("您正在观看的视频是:"+videoName);

            System.out.println("-----------------------------------------------------");
            System.out.println("您可以：1.视频播放；2.视频以n倍速播放；3.暂停视频播放；4.视频停止播放");
            //获取状态上下文
            Context context=new Context();
            int choice=scanner.nextInt();
            switch (choice)
            {
                case 1:
                    context.setVideoState(new playState());
                    System.out.println("视频当前状态:"+context.getContext().getClass().getName());
                    context.play();
                    break;
                case 2:
                    System.out.print("请输入您需要以几倍速进行播放:");
                    double speed=scanner.nextDouble();
                    context.setVideoState(new speedState());
                    System.out.println("视频当前状态:"+context.getContext().getClass().getName());
                    context.speed(speed);
                    break;
                case 3:
                    context.setVideoState(new pauseState());
                    System.out.println("视频当前状态:"+context.getContext().getClass().getName());
                    context.pause();
                    break;
                case 4:
                    context.setVideoState(new stopState());
                    System.out.println("视频当前状态:"+context.getContext().getClass().getName());
                    context.stop();
                    break;
                default:
                    System.out.println("输入有误!");
            }
            login=true;
            break;
        }
        if(!login)
        {
            System.out.println("登录失败，id输入有误，请重新输入");
        }
    }
}
