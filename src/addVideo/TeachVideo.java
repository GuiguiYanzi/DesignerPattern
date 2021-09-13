package addVideo;

import model.VideoInfo;

public class TeachVideo implements Video {
    int id,index;
    String name,au;
    public TeachVideo(int id, int index, String name, String au) {
        this.id=id;
        this.index=index;
        this.name=name;
        this.au=au;
    }

    @Override
    public VideoInfo add(int id, int index, String name, String au) {
        System.out.println("上传了一堂java设计模式视频");
        return new VideoInfo(id,index,name,au);
    }
}
