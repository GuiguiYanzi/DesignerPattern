package state;

//上下文类:声明视频的上下文
public class Context{
    public VideoState videoState;
    public final static playState play_state=new playState();
    public final static pauseState pause_state=new pauseState();
    public final static speedState speed_state=new speedState();
    public final static stopState stop_state=new stopState();

    public VideoState getContext()
    {
        return videoState;
    }

    public void setVideoState(VideoState videoState)
    {
        this.videoState=videoState;
    }
    public void play()
    {
        this.videoState.play();
    }
    public void speed(double speeds)
    {
        this.videoState.speed(speeds);
    }
    public void stop()
    {
        this.videoState.stop();
    }
    public void pause()
    {
        this.videoState.pause();
    }
}
