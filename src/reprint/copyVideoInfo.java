package reprint;

import model.VideoInfo;

import java.text.DateFormat;
import java.util.Date;

//转载视频的信息储存类
public class copyVideoInfo{
    int videoId;        //视频号
    String videoName;   //视频名称
    String author;      //视频作者
    String userName;    //转载的用户名
    String dateTime;    //转载时间
    //创建对象时需要传入转发者用户名,转发时间计算机自动生成
    public copyVideoInfo(String userName) {
        this.userName = userName;
        //日期由计算机自动获取
        Date date=new Date();
        DateFormat df1=DateFormat.getDateInstance();
        dateTime=df1.format(date);               //获取转发时间
    }
    //原视频信息
    public void setInfo(VideoInfo videoInfo)
    {
        videoId=videoInfo.getVideoId();
        videoName=videoInfo.getVideoName();
        author=videoInfo.getAuthor();
    }

    public int getVideoId() {
        return videoId;
    }

    public String getVideoName() {
        return videoName;
    }

    public String getAuthor() {
        return author;
    }

    public String getUserName() {
        return userName;
    }

    public String getDateTime() {
        return dateTime;
    }
}
