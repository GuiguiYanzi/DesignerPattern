package findVideo;

import model.VideoInfo;

import java.util.List;

/**
 * 具体迭代器类:vedioIteratorImpl
 */
public class videoIteratorImpl implements videoIterator {
    private List<VideoInfo> list;
    private int position=0;
    private VideoInfo currentVideo;
    public videoIteratorImpl(List<VideoInfo> list){
        this.list=list;
    }
    @Override
    public boolean hasNext() {
        return position<list.size();
    }

    @Override
    public VideoInfo next() {
        currentVideo=list.get(position);
        position++;
        return  currentVideo;
    }
}
