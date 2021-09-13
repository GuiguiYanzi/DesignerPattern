package model;

//视频的信息存储
public class VideoInfo implements Cloneable{
    VideoInfo videoInfo;
    int videoId;        //视频号
    int index;          //视频的权限等级
    String videoName;   //视频名称
    String author;      //视频作者

    public VideoInfo(int videoId,int index,String videoName,String author) {
        this.videoId=videoId;
        this.index=index;
        this.videoName=videoName;
        this.author=author;
    }
    public int getVideoId() {
        return videoId;
    }

    public int getIndex() {
        return index;
    }

    public String getVideoName() {
        return videoName;
    }

    public String getAuthor() {
        return author;
    }

    //克隆
    public VideoInfo clone(){
        try {
            VideoInfo v=(VideoInfo)super.clone();
            return new VideoInfo(v.videoId,v.index,v.videoName,v.author);
        }catch (CloneNotSupportedException e)
        {
            System.out.println("抱歉，没有该视频");
        }
        return null;
    }

    @Override
    public String toString() {
        return "VideoInfo{" +
                "videoId=" + videoId +
                ", videoName='" + videoName + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
