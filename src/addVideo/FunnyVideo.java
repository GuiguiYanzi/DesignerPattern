package addVideo;

import model.VideoInfo;

//搞笑视频
public class FunnyVideo implements Video {
    int VideoId;int Index;String VideoName;String author;
    public FunnyVideo(int id, int index, String name, String author) {
        VideoId=id;
        Index=index;
        VideoName=name;
        this.author=author;
    }

    @Override
    public VideoInfo add(int VideoId, int Index, String VideoName, String author) {
        System.out.println("上传了一个搞笑视频");
        return new VideoInfo(VideoId,Index,VideoName,author);   //返回video信息的一个类
    }
}
