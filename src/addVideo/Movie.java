package addVideo;

import model.VideoInfo;

public class Movie implements Video{
    int id,index;
    String name,au;
    public Movie(int id, int index, String name, String au) {
        this.id=id;
        this.index=index;
        this.name=name;
        this.au=au;
    }

    @Override
    public VideoInfo add(int id, int index, String name, String au) {
        System.out.println("上传了一部电影");
        return new VideoInfo(id,index,name,au);
    }
}
