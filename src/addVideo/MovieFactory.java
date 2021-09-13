package addVideo;

public class MovieFactory implements Factory {
    @Override
    public Video produceVideo(int id, int index, String name, String au) {
        return new Movie(id,index,name,au);
    }
}
