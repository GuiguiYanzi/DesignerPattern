package facadePattern;

import findVideo.videoIterator;
import findVideo.videoIteratorImpl;
import model.VideoInfo;

import java.util.List;
import java.util.Scanner;

public class SubSystemE {
    Scanner scanner=new Scanner(System.in);
    public SubSystemE(List<VideoInfo> list) {
        //自己定义的迭代器，进行视频迭代搜索
        System.out.println("请输入你需要寻找的视频名称");
        String videoName=scanner.next();
        videoIterator iterator=new videoIteratorImpl(list);
        int vNums=0;        //当前视频数
        while (iterator.hasNext()){
            VideoInfo tempInfo=iterator.next();
            if(tempInfo.getVideoName().equals(videoName)) {
                System.out.println("视频信息:" + tempInfo);
                vNums++;
            }
        }
        System.out.println("当前找到视频:"+vNums+"个");
    }
}
