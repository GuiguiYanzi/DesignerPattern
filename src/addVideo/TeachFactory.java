package addVideo;

public class TeachFactory implements Factory {
    @Override
    public Video produceVideo(int id, int index, String name, String au) {
        return new TeachVideo(id,index,name,au);
    }
}
