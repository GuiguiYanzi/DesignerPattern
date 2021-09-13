package state;

import model.VideoInfo;

/**
 * 状态模式，用于观看视频时候的视频播放模式
 *
 */
//视频的抽象类
public abstract class VideoState {
    public VideoInfo videoInfo;
    public void setVideoState(VideoInfo videoInfo)
    {
        this.videoInfo=videoInfo;
    }
    public abstract void play();  //播放
    public abstract void speed(double speed);  //快进
    public abstract void pause();  //暂停
    public abstract void stop();  //停止
}
