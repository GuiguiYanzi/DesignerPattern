package addVideo;

public class FunnyFactory implements Factory {

    @Override
    public Video produceVideo(int id, int index, String name, String author) {
        return new FunnyVideo(id,index,name,author);
    }
}
