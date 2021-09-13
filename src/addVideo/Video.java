package addVideo;

import model.VideoInfo;

public interface Video {    //抽象产品类:video
    public VideoInfo add(int id, int index, String name, String au);
}
