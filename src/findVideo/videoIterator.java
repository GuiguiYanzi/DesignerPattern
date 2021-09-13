package findVideo;

import model.VideoInfo;

/**
 * 抽象迭代器，定义迭代器接口实现迭代器
 * 搜索指定的视频由迭代器模式实现，不需要暴露视频细节
 */
public interface videoIterator {
    boolean hasNext();
    VideoInfo next();
}
