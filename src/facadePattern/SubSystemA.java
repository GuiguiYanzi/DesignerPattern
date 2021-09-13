package facadePattern;

import addVideo.Factory;
import addVideo.Video;
import addVideo.XMLUtil;
import model.VideoInfo;

import java.util.List;
import java.util.Scanner;

public class SubSystemA {
    Scanner scanner=new Scanner(System.in);
    public SubSystemA(List<VideoInfo> list) {
        System.out.println("请输入你需要上传的视频信息:");
        System.out.println("视频id,视频等级index,视频名称name,视频作者author");
        int id=scanner.nextInt();
        int index=scanner.nextInt();
        String name=scanner.next();
        String author=scanner.next();
        try {
            Video video;
            Factory factory;
            System.out.println("请输入上传视频类型:0.搞笑视频，1.电影，2.java设计模式视频");
            String beanId=scanner.next();
            factory= XMLUtil.getBean(beanId);
            video=factory.produceVideo(id,index,name,author);
            //将上传的视频存储在链表中
            list.add(video.add(id,index,name,author));
        }catch (Exception e)
        {
            System.out.println("请输入正确的信息");
        }
    }
}
