package state;

public class pauseState extends VideoState{
    @Override
    public void play() {

    }

    @Override
    public void speed(double speed) {

    }

    @Override
    public void pause() {
        System.out.println("视频暂停播放...");
    }

    @Override
    public void stop() {

    }
}
